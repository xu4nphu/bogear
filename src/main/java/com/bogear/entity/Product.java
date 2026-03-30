package com.bogear.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Products")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String name;
    Double price;
    String image;

    // Thay đổi từ String categoryId sang Object Category
    @ManyToOne
    @JoinColumn(name = "category_id")
    Category category;
}