package com.spring.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.WebServices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
