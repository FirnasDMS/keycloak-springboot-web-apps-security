package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
