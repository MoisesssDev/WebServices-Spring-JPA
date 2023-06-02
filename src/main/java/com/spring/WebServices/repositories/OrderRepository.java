package com.spring.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.WebServices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
