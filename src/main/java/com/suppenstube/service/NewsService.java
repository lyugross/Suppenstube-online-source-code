package com.suppenstube.service;

import com.suppenstube.model.dto.NewsDTO;

import java.util.List;

public interface NewsService {
    List<NewsDTO> getAllNews();
    void add(NewsDTO newsDTO);
    void delete(Long newsId);
}
