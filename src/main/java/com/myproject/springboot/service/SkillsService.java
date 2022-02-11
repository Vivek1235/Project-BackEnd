package com.myproject.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.springboot.entity.Skills;
import com.myproject.springboot.entity.User;
import com.myproject.springboot.repository.SkillsRepository;
import com.myproject.springboot.repository.UsersRepository;

@Service
public class SkillsService {
	@Autowired
	private UsersRepository userRepository; 
	@Autowired
	private SkillsRepository skillsRepository;
	
	
	
	
	
	public List<Skills> getUserSkills(int userId) throws Exception
	{
		User userMatch=userRepository.findById(userId);
		List<Skills> skills=skillsRepository.findBySkillUserIdId(userId);
		System.out.println(skills);
		if(skills!=null)
		{	
			return skills;
			}
		else
			throw new Exception("no Skills exist");
	}
	
	
	public Skills addUserSkill(int userId,Skills newSkill) throws Exception
	{
		  Skills skillExists=skillsRepository.findBySkillNameAndSkillUserIdId(newSkill.getSkillName(), userId);
		   if(skillExists!=null)
		       throw new Exception("skill already exists");
		   else
			   return skillsRepository.save(new Skills(newSkill.getSkillName(),newSkill.getLevel(),userRepository.findById(userId)));
		   
		
		
		
	}
	public List<Skills> deleteSkill(int userId,int id) throws Exception
	{
		Skills skill=skillsRepository.findById(id);
		if(skill!=null)
			{skillsRepository.deleteById(id);
			  return skillsRepository.findBySkillUserIdId(userId);
			}
		else
			throw new Exception("Skill doesn't exist");
		
	}
	public Skills updateSkill(Skills skill,int id)
	{
		skillsRepository.deleteById(skill.getId());
		skillsRepository.save(new Skills(skill.getId(),skill.getSkillName(),skill.getLevel(),userRepository.findById(id)));
	
		return skill;
		
	}


}
