package com.myproject.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.springboot.entity.Experience;
import com.myproject.springboot.entity.Skills;
import com.myproject.springboot.service.ExperienceService;

@RestController
public class ExperienceController {
	
	@Autowired
	private ExperienceService experienceService;
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/experience/{userId}")
	public  List<Experience> getExperiencesByUserId(@PathVariable int userId) throws Exception
	{
		
		return experienceService.getUserExperienceList(userId);
	}
	@CrossOrigin
	@DeleteMapping("/experience/{userId}/{Id}")
	public List<Experience> deleteExperienceById(@PathVariable int userId,@PathVariable int Id) throws Exception
	{
		return experienceService.deleteExperience(userId, Id);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/experience/{userId}")
	public  Experience addExperienceByUserId(@RequestBody Experience newExperience,@PathVariable int userId) throws Exception
	{
	
		return experienceService.addUserExperience(userId, newExperience);
	}

	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/experienceList/experience/{Id}")
	public  Experience  getExperienceByUserId(@PathVariable int Id) throws Exception
	{
		
		return experienceService.getUserExperience(Id);
	}
	
	@CrossOrigin
	@PutMapping(value="/experience/{userId}")
	public Experience updateExperienceById(@RequestBody Experience experience,@PathVariable int userId) throws Exception
	{
		return experienceService.updateExperience(experience,userId);
	}
}
