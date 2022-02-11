package com.myproject.springboot.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Skills {
	@Id
	@GeneratedValue
	private int id;
	
	private String skillName;
	private Float level;
	

	@ManyToOne
	@JoinColumn(name="user_id")
	@JsonIgnore
	private User skillUserId;
	
	protected Skills() {
	}
	public Skills(String skill,Float level, User user) {
		super();
		this.skillName = skill;
		this.skillUserId = user;
		this.level=level;
	}
	public Skills(int id,String skill,Float level, User user) {
		super();
		this.id=id;
		this.skillName = skill;
		this.skillUserId = user;
		this.level=level;
	}

	public int getId() {
		return id;
	}
	public String getSkillName() {
		return skillName;
	}
	public Float getLevel() {
		return level;
	}
	public User getSkillUserId() {
		return skillUserId;
	}
	@Override
	public String toString() {
		return "Skills [skill=" + skillName + ", user=" + skillUserId + "]";
	}
	
	

}
