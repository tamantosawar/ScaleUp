package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Product;
import com.example.repo.ProductRepository;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository productRepo;

	public void save(Product product) {
		productRepo.save(product);
	}

	public List<Product> listAll() {
		return productRepo.findAll();
	}

	public Product get(Long id) {
		return productRepo.findById(id).get();
	}

	public void delete(Long id) {
		productRepo.deleteById(id);
	}
	
	public List<Product> search(String keyword) {
		return productRepo.search(keyword);
		}
}
