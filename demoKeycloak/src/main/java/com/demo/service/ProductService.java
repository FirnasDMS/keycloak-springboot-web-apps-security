package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Product;
import com.demo.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo repo;

	public void save(Product product) {
		// TODO Auto-generated method stub
		repo.save(product);
	}
}
