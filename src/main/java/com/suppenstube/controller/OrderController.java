package com.suppenstube.controller;

import com.suppenstube.model.dto.MenuDTO;
import com.suppenstube.service.MenuItemsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    private final MenuItemsService menuItemsService;

    public OrderController(MenuItemsService menuItemsService) {
        this.menuItemsService = menuItemsService;
    }

    @GetMapping("/order")
    public String getMenu(Model model) {
        model.addAttribute("menuItems", menuItemsService.getAllMenuItems());
        return "order";
    }

    @PostMapping("/order")
    public String orderFromMenu(MenuDTO menuDTO) {
        menuItemsService.updateMenu(menuDTO);
        return "change-menu";
    }
}
