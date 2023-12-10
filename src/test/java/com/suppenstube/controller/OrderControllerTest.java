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
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(OrderController.class)
public class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MenuItemsService menuItemsService;

    @Test
    public void testGetMenuWhenGetRequestThenReturnOrderView() throws Exception {
        // Arrange
        when(menuItemsService.getAllMenuItems()).thenReturn(List.of(new MenuDTO("Soup name", BigDecimal.TEN, null)));

        // Act & Assert
        mockMvc.perform(get("/order"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(view().name("order"));
    }

    @Test
    public void testOrderFromMenuWhenPostRequestThenRedirectToChangeMenu() throws Exception {
        // Arrange
        MenuDTO menuDTO = new MenuDTO("Soup name", BigDecimal.TEN, null); // Assuming MenuDTO can be instantiated without setting properties for this test

        // Act & Assert
        mockMvc.perform(post("/order")
                        .flashAttr("menuDTO", menuDTO))
                .andExpect(MockMvcResultMatchers.status().isFound())
                .andExpect(MockMvcResultMatchers.redirectedUrl("change-menu"));
    }
}