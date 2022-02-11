package com.myproject.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.myproject.springboot.entity.Skills;
import com.myproject.springboot.entity.User;

public interface SkillsRepository extends CrudRepository<Skills,Integer> {
	 public List<Skills> findBySkillUserIdId(int user);
	 public Skills findById(int id);
	 public Skills findBySkillNameAndSkillUserIdId(String skill,int userId);
	 public Skills findByIdAndSkillUserId(int id,int userId);

}
