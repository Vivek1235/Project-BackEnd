package com.myproject.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.springboot.entity.Profile;
import com.myproject.springboot.repository.ProfileRepository;

@Service
public class ProfileService {
	@Autowired
	private ProfileRepository profileRepository;
	
	
	public Profile getProfileDetails(int userId)
	{
		return profileRepository.findByProfileUserIdId(userId);
	}
	

}
