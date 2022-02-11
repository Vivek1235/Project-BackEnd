package com.myproject.springboot.controller;

import com.myproject.springboot.entity.Skills;
import com.myproject.springboot.entity.User;
import com.myproject.springboot.model.RegistrationModel;
import com.myproject.springboot.service.SkillsService;
import com.myproject.springboot.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Welcome 
{
	@Autowired
	private UserService userService;
	

	
	@CrossOrigin
	@PostMapping("/login")
	public User login(@RequestBody User user,ModelMap model) throws Exception
	{
	   return userService.userLogin(user);
		
	
	}
	
	
	@CrossOrigin
	@PostMapping("/register")
	public  boolean register(@RequestBody RegistrationModel user) throws Exception
	{
		return userService.registerUser(user);
	}
	
	
	
	
	
	
}
	


