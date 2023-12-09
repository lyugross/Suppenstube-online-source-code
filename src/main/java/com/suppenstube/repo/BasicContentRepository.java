package com.suppenstube.repo;

import com.suppenstube.model.entity.BasicContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BasicContentRepository extends JpaRepository<BasicContent, Long> {
}