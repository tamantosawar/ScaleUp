package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Orders;
import com.example.repo.OrderRepository;


@Service
@Transactional
public class OrderService {
	@Autowired
	private OrderRepository orderRepo;

	public void save(Orders orders) {
		orderRepo.save(orders);
	}

	public List<Orders> listAll() {
		return orderRepo.findAll();
	}

	public Orders get(int id) {
		return orderRepo.findById(id).get();
	}

	public void delete(int id) {
		orderRepo.deleteById(id);
	}
		
}
