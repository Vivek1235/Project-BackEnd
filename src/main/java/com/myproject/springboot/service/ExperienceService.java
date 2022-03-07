package com.myproject.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.springboot.entity.Experience;
import com.myproject.springboot.entity.Skills;
import com.myproject.springboot.repository.ExperienceRepository;
import com.myproject.springboot.repository.UsersRepository;

@Service
public class ExperienceService {
	@Autowired
	private UsersRepository userRepository; 
	@Autowired
	private ExperienceRepository experienceRepository;
	
	
	
	
	
	public List<Experience> getUserExperienceList(int userId) throws Exception
	{

		List<Experience> experiences=experienceRepository.findByUserIdId(userId);
		if(experiences!=null)
		{	
			
			 return experiences;
			}
		else
			throw new Exception("no experiences exist");
	}
	public List<Experience> deleteExperience(int userId,int id) throws Exception
	{
		 Experience experience=experienceRepository.findById(id);
		if(experience!=null)
			{experienceRepository.deleteById(id);
			  return experienceRepository.findByUserIdId(userId);
			}
		else
			throw new Exception("Experience doesn't exist");
		
	}
	
	public Experience addUserExperience(int userId,Experience newExperience) throws Exception
	{
		      newExperience.setUserId(userRepository.findById(userId));
		      System.out.println(newExperience);
			   return experienceRepository.save(newExperience);
		   
		
	}
	public Experience getUserExperience(int Id) throws Exception
	{

		Experience experience=experienceRepository.findById(Id);

		if(experience!=null)
		{	
			return experience;
			}
		else
			throw new Exception("no experience match");
	}
		
	
	public Experience updateExperience(Experience updateExperience,int userId) throws Exception
	{
		int Id=updateExperience.getId();
		updateExperience.setUserId(userRepository.findById(userId));
		return experienceRepository.save(updateExperience);
	
		
	}

}
