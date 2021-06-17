package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class IndexController {
	
	@Autowired
	private UserService UserService;

	@PostMapping("/add")
	public ResponseEntity<String> addUsers(User user){
		try {
			UserService.save(user);
			return new ResponseEntity<>("Ok", HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>("Unauthorized", HttpStatus.FORBIDDEN);
		}
	}	
	
	
	@GetMapping("/findall")
	public List<User> findAllUser(){
		
		     return UserService.findAll();
	}
	
	
	
	
}
