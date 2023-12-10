package com.suppenstube.controller;

import com.suppenstube.service.MenuItemsService;
import com.suppenstube.service.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    private final MenuItemsService menuItemsService;
    private final NewsService newsService;

    public IndexController(MenuItemsService menuItemsService, NewsService newsService) {
        this.menuItemsService = menuItemsService;
        this.newsService = newsService;
    }


    @GetMapping("/")
    public String getNewsAndMenu(Model model) {
        model.addAttribute("news", newsService.getAllNews());
        model.addAttribute("menuItems", menuItemsService.getAllMenuItems());
        return "index";
    }
}
