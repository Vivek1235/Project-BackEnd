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

import com.myproject.springboot.entity.Education;
import com.myproject.springboot.entity.Experience;
import com.myproject.springboot.service.EducationService;


@RestController
public class EducationController {
	@Autowired
	private EducationService educationService;
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/education/{userId}")
	public  List<Education> getEducationDetailsByUserId(@PathVariable int userId) throws Exception
	{
		
		return educationService.getUserEducationDetails(userId);
	}
	
	
	@CrossOrigin
	@DeleteMapping("/education/{userId}/{Id}")
	public List<Education> deleteEducationById(@PathVariable int userId,@PathVariable int Id) throws Exception
	{
		return educationService.deleteEducation(userId, Id);
	}
	
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/education/{userId}")
	public  Education addEducationByUserId(@RequestBody Education newEducation,@PathVariable int userId) throws Exception
	{
	
		return educationService.addUserEducation(userId, newEducation);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/educationList/education/{Id}")
	public  Education  getEducationByUserId(@PathVariable int Id) throws Exception
	{
		
		return educationService.getUserEducation(Id);
	}
	
	@CrossOrigin
	@PutMapping(value="/education/{userId}")
	public Education updateEducationById(@RequestBody Education education,@PathVariable int userId) throws Exception
	{
		return educationService.updateEducation(education, userId);
	}

}
