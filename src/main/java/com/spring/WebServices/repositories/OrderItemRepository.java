package com.spring.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.WebServices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
