package com.ecommerce.ecommerce.repository;

import com.ecommerce.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long>{

    List<Product> findByCategory(Long categoryId);

    List<Product> findByNameOrDescriptionContaining(String name, String description);
}
