package com.suppenstube.controller;


import com.suppenstube.model.dto.NewsDTO;

import com.suppenstube.service.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @PostMapping("/update-news")
    public String add(NewsDTO newsDTO) {
       newsService.add(newsDTO);
       return "update-news";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long newsId) {
        newsService.delete(newsId);
        return "update-news";
    }

}
