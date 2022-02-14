package com.myproject.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.myproject.springboot.entity.Education;
import com.myproject.springboot.entity.Experience;
import com.myproject.springboot.entity.Skills;
import com.myproject.springboot.entity.User;

public interface EducationRepository extends CrudRepository<Education,Integer>{
	public List<Education> findByUserIdId(int userId);
	public Education findById(int id);
}
