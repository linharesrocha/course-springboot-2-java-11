package com.linhares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linhares.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
