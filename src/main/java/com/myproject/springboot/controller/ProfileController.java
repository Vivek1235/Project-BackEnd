package com.myproject.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.springboot.entity.Profile;
import com.myproject.springboot.service.ProfileService;

@RestController
public class ProfileController {
    @Autowired
    private ProfileService profileService;
	
	@CrossOrigin
	@GetMapping("/profile/{userId}")
	public Profile fetchProfile(@PathVariable int userId)
	{
	   return 	profileService.getProfileDetails(userId);
	}
	
	

	@CrossOrigin
	@PutMapping("/profile/{userId}")
	public Profile updateProfile(@RequestBody Profile profile,@PathVariable int userId)
	{
	   return 	profileService.updateProfileDetails(profile, userId);
	}
	
}
