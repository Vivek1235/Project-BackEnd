package com.myproject.springboot.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SkillsRepository extends CrudRepository<Skills,Integer> {
	 public List<Skills> findBySkillUserId(User user);

}
