package com.myproject.springboot.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Skills {
	@Id
	private int id;
	
	private String name;
	private String level;
	

	@ManyToOne
	@JoinColumn(name="user_id")
	@JsonIgnore
	private User userId;
	
	protected Skills() {
	}
	public Skills(String name,String level, User user) {
		super();
		this.name = name;
		this.userId = user;
		this.level=level;
	}
	
	

	public Skills(int id, String name, String level, User userId) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLevel() {
		return level;
	}
	public User getUserId() {
		return userId;
	}
	@Override
	public String toString() {
		return "Skills [skill=" + name + ", user=" + userId + "]";
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	
	

}
