package com.myproject.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.myproject.springboot.entity.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Integer>{
	
  public Profile findByUserIdId(int userId);
}
