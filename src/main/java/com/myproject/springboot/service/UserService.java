package com.myproject.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.myproject.springboot.entity.Profile;
import com.myproject.springboot.entity.User;
import com.myproject.springboot.model.RegistrationModel;
import com.myproject.springboot.repository.ProfileRepository;
import com.myproject.springboot.repository.UsersRepository;

@Service
public class UserService {
	@Autowired
	private UsersRepository userRepository; 
	@Autowired
	private ProfileRepository profileRepository; 
	
	
	
	public User userLogin(User user) throws Exception
	{
		User userExists=userRepository.findByEmail(user.getEmail());
		   
		   if(userExists!=null && userExists.getPassword().equals(user.getPassword()))
		         return userExists;
		   else
			   throw new Exception("error occured");
	}
	public boolean registerUser(RegistrationModel user) throws Exception
	{
        System.out.println(user.getPhoneNumber());
		if(userRepository.findByEmail(user.getEmail())==null)
			{  userRepository.save(new User(user.getEmail(),user.getPassword()));
		      User userCreated=userRepository.findByEmail(user.getEmail());
		  
		   profileRepository.save(new Profile(user.getEmail(),user.getFirstName(),user.getLastName(), user.getPhoneNumber(), null, null,"https://www.kindpng.com/picc/m/451-4517876_default-profile-hd-png-download.png",userCreated,null));
		   return true;
		}
	else
		throw new Exception("already user");
	}
	

}
