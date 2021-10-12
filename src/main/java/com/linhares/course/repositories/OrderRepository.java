package com.linhares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linhares.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
