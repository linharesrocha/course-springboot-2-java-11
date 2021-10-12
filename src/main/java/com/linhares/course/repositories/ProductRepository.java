package com.linhares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linhares.course.entities.Category;
import com.linhares.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
