package com.myproject.springboot.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
	@Id
	private int id;
	
	
	private String email;
	private String password;
	
	@OneToMany(mappedBy="userId")
	private List<Skills> skill;
	
	@OneToOne(mappedBy="userId")
	private Profile profile;
	
	@OneToMany(mappedBy="userId")
	private List<Experience> experience;
	
	@OneToMany(mappedBy="userId")
	private List<Education> education;
	
	
	protected User()
	{
		
	}
	
	public User(String email, String password) {
		super();

		this.email = email;
		this.password = password;
	}


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
