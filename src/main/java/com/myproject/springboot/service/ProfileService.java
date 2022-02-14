package com.myproject.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.springboot.entity.Profile;
import com.myproject.springboot.repository.ProfileRepository;
import com.myproject.springboot.repository.UsersRepository;

@Service
public class ProfileService {
	@Autowired
	private ProfileRepository profileRepository;
	
	@Autowired
	private UsersRepository userRepository;
	
	public Profile getProfileDetails(int userId)
	{
		return profileRepository.findByUserIdId(userId);
	}


	public Profile updateProfileDetails(Profile profile,int userId) {
		profile.setUserId(userRepository.findById(userId));
		return profileRepository.save(profile);
	}
	

}
