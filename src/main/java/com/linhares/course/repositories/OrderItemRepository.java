package com.linhares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linhares.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
