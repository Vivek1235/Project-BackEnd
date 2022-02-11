package com.myproject.springboot.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	private String email;
	private String password;
	
	@OneToMany(mappedBy="skillUserId")
	private List<Skills> skill;
	
	@OneToOne(mappedBy="profileUserId")
	private Profile profile;
	
	@OneToMany(mappedBy="experienceUserId")
	private List<Experience> experience;
	
	@OneToMany(mappedBy="educationUserId")
	private List<Education> education;
	
	
	protected User()
	{
		
	}
	
	public User(String email, String password) {
		super();
//		this.id=id;
		this.email = email;
		this.password = password;
	}
//	public List<Skills> getSkill() {
//		return skill;
//	}
////
//	public Profile getProfile() {
//		return profile;
//	}

	public int getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
	

}
