package com.myproject.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.springboot.entity.Profile;
import com.myproject.springboot.service.ProfileService;

@RestController
public class FetchDetails {
    @Autowired
    private ProfileService profileService;
	
	@CrossOrigin
	@GetMapping("/profile/{userId}")
	public Profile fetchProfile(@PathVariable int userId)
	{
	   return 	profileService.getProfileDetails(userId);
	}
}
