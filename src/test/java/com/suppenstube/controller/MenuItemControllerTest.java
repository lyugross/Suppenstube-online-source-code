package com.suppenstube.controller;

import com.suppenstube.model.dto.MenuDTO;
import com.suppenstube.service.MenuItemsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(MenuItemController.class)
public class MenuItemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MenuItemsService menuItemsService;

    @Test
    public void testUpdateMenuWhenGetThenReturnChangeMenuView() throws Exception {
        // Arrange
        var menuItems
                = new MenuDTO("Soup name", BigDecimal.TEN, null);
        given(menuItemsService.getAllMenuItems()).willReturn(Collections.singletonList(menuItems));

        // Act & Assert
        mockMvc.perform(get("/update"))
                .andExpect(view().name("change-menu"))
                .andExpect(model().attribute("menuItems", menuItems));
    }

}