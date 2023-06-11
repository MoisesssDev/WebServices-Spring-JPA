package com.spring.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.WebServices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
