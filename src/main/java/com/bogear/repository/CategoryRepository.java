package com.bogear.repository;

import com.bogear.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

// CategoryRepository.java
public interface CategoryRepository extends JpaRepository<Category, String> {
}
