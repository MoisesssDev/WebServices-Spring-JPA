package com.spring.WebServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.WebServices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
