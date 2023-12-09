package com.suppenstube.model.entity;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Map;

@Entity
@Table(name = "orders")
public class Order extends BaseEntity {

    @ElementCollection
    @JoinTable(name="Ordered_items", joinColumns=@JoinColumn(name="id"))
    @MapKeyColumn (name="soup_name")
    @Column(name="value")
    Map<Integer, MenuItem> items;

    private BigDecimal total;

    @ManyToOne
    private User orderedBy;



}
