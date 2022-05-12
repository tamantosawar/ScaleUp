package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Orders;
@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer>{
	
	
}
