package com.suppenstube.controller;

import com.suppenstube.model.dto.MenuDTO;
import com.suppenstube.service.ContentService;
import com.suppenstube.service.MenuItemsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class MenuItemController {
    private final MenuItemsService menuItemsService;

    public MenuItemController( MenuItemsService menuItemsService) {
        this.menuItemsService = menuItemsService;
    }

    @GetMapping("/update")
    public String updateMenu(Model model) {
        model.addAttribute("menuItems", menuItemsService.getAllMenuItems());
        return "change-menu";
    }


    @PostMapping("/update")
    public String updateMenu(@RequestBody List<MenuDTO> menuDTO) {
        menuItemsService.deleteMenuItems();
        menuDTO.forEach(menuItemsService::updateMenu);
        return "change-menu";
    }
}

