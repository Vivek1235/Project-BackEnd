package com.myproject.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.springboot.entity.Education;
import com.myproject.springboot.entity.Experience;
import com.myproject.springboot.repository.EducationRepository;
import com.myproject.springboot.repository.ExperienceRepository;
import com.myproject.springboot.repository.UsersRepository;

@Service
public class EducationService {

	@Autowired
	private UsersRepository userRepository; 
	@Autowired
	private EducationRepository educationRepository;
	
	
	
	
	
	public List<Education> getUserEducationDetails(int userId) throws Exception
	{

		List<Education> education=educationRepository.findByEducationUserIdId(userId);
		if(education!=null)
		{	
			
			 return education;
			}
		else
			throw new Exception("no experiences exist");
	}
	public List<Education> deleteEducation(int userId,int id) throws Exception
	{
		 Education education=educationRepository.findById(id);
		if(education!=null)
			{educationRepository.deleteById(id);
			  return educationRepository.findByEducationUserIdId(userId);
			}
		else
			throw new Exception("choosen Education doesn't exist");
		
	}
	public Education addUserEducation(int userId,Education newEducation) throws Exception
	{
		      newEducation.setEducationUserId(userRepository.findById(userId));
		      System.out.println(newEducation);
			   return educationRepository.save(newEducation);
		   
		
	}
}
