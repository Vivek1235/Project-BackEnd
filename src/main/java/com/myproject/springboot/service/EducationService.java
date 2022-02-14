package com.myproject.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.springboot.entity.Education;
import com.myproject.springboot.entity.Experience;
import com.myproject.springboot.repository.EducationRepository;
import com.myproject.springboot.repository.UsersRepository;

@Service
public class EducationService {

	@Autowired
	private UsersRepository userRepository; 
	@Autowired
	private EducationRepository educationRepository;
	
	
	
	
	
	public List<Education> getUserEducationDetails(int userId) throws Exception
	{

		List<Education> education=educationRepository.findByUserIdId(userId);
		
		if(education!=null)
		{	
			return education;
		}
		else
			throw new Exception("no education exist");
	}
	public List<Education> deleteEducation(int userId,int id) throws Exception
	{
		 Education education=educationRepository.findById(id);
		if(education!=null)
			{educationRepository.deleteById(id);
			  return educationRepository.findByUserIdId(userId);
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
	public Education getUserEducation(int Id) throws Exception
	{

		Education updateEducation=educationRepository.findById(Id);

		if(updateEducation!=null)
		{	
			return updateEducation;
			}
		else
			throw new Exception("no education match");
	}
	public Education updateEducation(Education updateEducation,int userId) throws Exception
	{
		int Id=updateEducation.getId();
		updateEducation.setUserId(userRepository.findById(userId));
		return educationRepository.save(updateEducation);
	

		
	}
}
