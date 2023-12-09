package com.suppenstube.model.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "content")
public class BasicContent {

    @Id
    private Long id;
    private String about;
}
