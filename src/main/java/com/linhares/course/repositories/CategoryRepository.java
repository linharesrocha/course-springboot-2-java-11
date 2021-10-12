package com.linhares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linhares.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
