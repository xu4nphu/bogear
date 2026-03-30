package com.bogear.repository;

import com.bogear.entity.Category;
import com.bogear.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// ProductRepository.java
public interface ProductRepository extends JpaRepository<Product, Integer> {
    // Tìm sản phẩm theo ID của danh mục (Dùng cho bộ lọc)
    @Query("SELECT p FROM Product p WHERE p.category.id = ?1")
    List<Product> findByCategoryId(String cid);
}

