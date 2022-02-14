package com.myproject.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.springboot.entity.Skills;
import com.myproject.springboot.service.SkillsService;

@RestController
public class SkillsController {
	
	@Autowired
	private SkillsService skillsService;
	
	@CrossOrigin
	@DeleteMapping("/skills/{userId}/{Id}")
	public List<Skills> deleteSkillById(@PathVariable int userId,@PathVariable int Id) throws Exception
	{
		return skillsService.deleteSkill(userId,Id);
	}
	
	
	
	
	@CrossOrigin
	@PutMapping(value="/skills/{userId}")
	public Skills updateSkillById(@RequestBody Skills skill,@PathVariable int userId) throws Exception
	{
		return skillsService.updateSkill(skill,userId);
	}
	
	
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/skills/{userId}")
	public  List<Skills> getSkillsByUserId(@PathVariable int userId) throws Exception
	{
		
		return skillsService.getUserSkills(userId);
	}
	
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/skills/{userId}")
	public  Skills addSkillsByUserId(@RequestBody Skills newSkill,@PathVariable int userId) throws Exception
	{
	
		return skillsService.addUserSkill(userId,newSkill);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/skills/skill/{Id}")
	public  Skills getSkillById(@PathVariable int Id) throws Exception
	{
		
		return skillsService.getSkill(Id);
	}
	
}
