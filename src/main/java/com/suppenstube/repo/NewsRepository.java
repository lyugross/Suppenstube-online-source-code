package com.suppenstube.repo;

import com.suppenstube.model.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    void deleteById(Long newsId);
}