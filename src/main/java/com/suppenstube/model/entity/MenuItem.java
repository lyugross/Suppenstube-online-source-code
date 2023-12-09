package com.suppenstube.model.entity;


import com.suppenstube.model.entity.enums.SoupLabels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "menu_item")
public class MenuItem extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    private SoupLabels label;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public SoupLabels getLabel() {
        return label;
    }

    public void setLabel(SoupLabels label) {
        this.label = label;
    }
}
