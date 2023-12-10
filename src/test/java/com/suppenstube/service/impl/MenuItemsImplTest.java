package com.suppenstube.service.impl;

import com.suppenstube.model.dto.MenuDTO;
import com.suppenstube.model.entity.MenuItem;
import com.suppenstube.model.entity.enums.SoupLabels;
import com.suppenstube.repo.MenuItemRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MenuItemsImplTest {

    @Mock
    private MenuItemRepository menuItemRepository;

    @InjectMocks
    private MenuItemsImpl menuItemsService;

    private MenuItem menuItem1;
    private MenuItem menuItem2;
    private List<MenuItem> menuItemList;

    @BeforeEach
    void setUp() {
        menuItem1 = new MenuItem();
        menuItem1.setName("Tomato Soup");
        menuItem1.setPrice(BigDecimal.valueOf(5.99));
        menuItem1.setLabel(SoupLabels.VEGAN);

        menuItem2 = new MenuItem();
        menuItem2.setName("Chicken Soup");
        menuItem2.setPrice(BigDecimal.valueOf(6.99));
        menuItem2.setLabel(SoupLabels.MEAT);

        menuItemList = Arrays.asList(menuItem1, menuItem2);
    }

    @Test
    void testGetAllMenuItemsWhenMenuItemsExistThenReturnListOfDTOs() {
        // Arrange
        when(menuItemRepository.findAll()).thenReturn(menuItemList);

        // Act
        List<MenuDTO> result = menuItemsService.getAllMenuItems();

        // Assert
        assertNotNull(result, "The list of DTOs should not be null");
        assertEquals(menuItemList.size(), result.size(), "The list of DTOs should have the same size as the list of entities");
        verify(menuItemRepository, times(1)).findAll();
    }

    @Test
    void testUpdateMenuWhenNewMenuItemThenSaveToRepository() {
        // Arrange
        MenuDTO newMenuDTO = new MenuDTO("Beef Stew", BigDecimal.valueOf(7.99), SoupLabels.MEAT);

        // Act
        menuItemsService.updateMenu(newMenuDTO);

        // Assert
        verify(menuItemRepository, times(1)).save(any(MenuItem.class));
    }

    @Test
    void testDeleteMenuItemsThenCallDeleteAll() {
        // Act
        menuItemsService.deleteMenuItems();

        // Assert
        verify(menuItemRepository, times(1)).deleteAll();
    }
}