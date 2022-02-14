package com.myproject.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.myproject.springboot.entity.Experience;
import com.myproject.springboot.entity.Skills;
import com.myproject.springboot.entity.User;

public interface ExperienceRepository extends CrudRepository<Experience,Integer>{
	public List<Experience> findByUserIdId(int userId);
	public Experience findById(int id);

}
