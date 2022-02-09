package com.myproject.springboot.jpa;

import javax.persistence.*;

@Entity
public class Skills {
	@Id
	@GeneratedValue
	private int id;
	
	private String skill;
	private Float level;
	

	@ManyToOne
	@JoinColumn(name="user_id")
	private User skillUserId;
	
	protected Skills() {
	}
	public Skills(int id,String skill, User user,Float level) {
		super();
		this.id=id;
		this.skill = skill;
		this.skillUserId = user;
		this.level=level;
	}
	public Float getLevel() {
		return level;
	}
	
	public int getId() {
		return id;
	}
	public String getSkill() {
		return skill;
	}
	public User getUser() {
		return skillUserId;
	}
	
	@Override
	public String toString() {
		return "Skills [skill=" + skill + ", user=" + skillUserId + "]";
	}
	
	

}
