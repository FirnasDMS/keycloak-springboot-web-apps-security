package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/add")
	private ResponseEntity<String> addProduct(Product product){
		
		productService.save(product);
		return new ResponseEntity<>("Success", HttpStatus.ACCEPTED);
	}
	
	
	
}
