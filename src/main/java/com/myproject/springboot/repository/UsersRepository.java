package com.myproject.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.myproject.springboot.entity.User;

public interface UsersRepository extends CrudRepository <User,Integer>{
	
    public User findByEmail(String email);
    public User findById(int id);
}
