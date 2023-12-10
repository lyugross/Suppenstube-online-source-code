package com.suppenstube.service.impl;

import com.suppenstube.model.dto.MenuDTO;
import com.suppenstube.model.dto.NewsDTO;
import com.suppenstube.model.entity.News;
import com.suppenstube.repo.NewsRepository;
import com.suppenstube.service.NewsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }


    @Override
    public List<NewsDTO> getAllNews() {
        return newsRepository
                .findAll()
                .stream()
                .map(model -> new NewsDTO(model.getHeadline(), model.getText()))
                .toList();
    }

    @Override
    public void add(NewsDTO newsDTO) {
        News news= new News();
        news.setHeadline(newsDTO.headline());
        news.setText(newsDTO.text());
        newsRepository.save(news);
    }

    @Override
    public void delete(Long newsId) {
        newsRepository.deleteById(newsId);
    }
}
