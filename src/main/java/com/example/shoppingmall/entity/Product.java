package com.example.shoppingmall.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Product")
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="product_id")
    private Long id;

    @Column(name="product_name")
    private String name;

    @Column(name="product_price")
    private Integer price;

    @Column(name="product_stockQuantity")
    private Integer stockQuantity;

    @Column(name="product_description")
    private String description;

    @Column(name="product_thumbnail_url")
    private String thumbnailUrl;
}
