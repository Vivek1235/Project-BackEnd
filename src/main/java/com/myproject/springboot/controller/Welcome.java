package com.myproject.springboot.controller;

import com.myproject.springboot.skillModel;
import com.myproject.springboot.demo.UserDemo;
import com.myproject.springboot.demo.userModel;
import com.myproject.springboot.jpa.Profile;
import com.myproject.springboot.jpa.ProfileRepository;
import com.myproject.springboot.jpa.Skills;
import com.myproject.springboot.jpa.SkillsRepository;
import com.myproject.springboot.jpa.User;
import com.myproject.springboot.jpa.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class Welcome 
{
	@Autowired
	private UsersRepository repository; 
	@Autowired
	private ProfileRepository profileRepository;
	@Autowired
	private SkillsRepository skillsRepository;
	
	@CrossOrigin
	@PostMapping("/login")
	@ResponseBody
	public User loginMessage(@RequestBody User user,ModelMap model) throws Exception
	{
	   User userExists=repository.findByEmail(user.getEmail());
	   
		   if(userExists!=null && userExists.getPassword().equals(user.getPassword()))
		         return userExists;
		   else
			   throw new Exception("error occured");
	   
		
	
	}
	@CrossOrigin
	@PostMapping("/register")
	@ResponseBody
	public  boolean registerMessage(@RequestBody UserDemo user) throws Exception
	{
		if(repository.findByEmail(user.getEmail())==null)
			{  repository.save(new User(user.getEmail(),user.getPassword()));
			   User userCreated=repository.findByEmail(user.getEmail());
			   profileRepository.save(new Profile(user.getEmail(),user.getFirstName(),user.getLastName(), 0, null, null, null,userCreated));
			   return true;
			}
		else
			throw new Exception("already user");
	}
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("/skills/{user}")
	@ResponseBody
	public  List<skillModel> displaySkills(@PathVariable String user) throws Exception
	{
		
		User userMatch=repository.findByEmail(user);
		List<Skills> skills=skillsRepository.findBySkillUserId(userMatch);
		System.out.println(skills);
		if(skills!=null)
		{	
			List<skillModel> skill=new ArrayList<skillModel>();			
				for(Skills i:skills)
				{
				   skillModel temp=new skillModel(i.getSkill(),i.getLevel());
				   skill.add(temp);
				}
			 return skill;
			}
		else
			throw new Exception("no Skills exist");
	}
	
	
}
	


