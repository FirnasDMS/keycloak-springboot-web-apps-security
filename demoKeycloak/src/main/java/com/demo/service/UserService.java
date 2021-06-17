package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.User;
import com.demo.repo.UserRepo;

@Service
public class UserService {

	@Autowired
    private UserRepo repo;

	public void save(User user) {
		// TODO Auto-generated method stub
		
		repo.save(user);
		
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
