package com.myproject.springboot.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Education {
	
	@Id
	private int id;
	
	private String schoolName;
	private String degreeName;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date startDate;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date endDate;
	private Float grade;
	private String descript;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	@JsonIgnore
	private User userId;

	
	protected Education() {
	}

	public Education(String schoolName, String degreeName, Date startDate, Date endDate, Float grade, String desc,
			User userId) {
		super();
		this.schoolName = schoolName;
		this.degreeName = degreeName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.grade = grade;
		this.descript = desc;
		this.userId = userId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public float getGrade() {
		return grade;
	}

	public String getDesc() {
		return descript;
	}

	public User getUserId() {
		return userId;
	}
	public void setEducationUserId(User educationUserId) {
		this.userId = educationUserId;
	}

	public int getId() {
		return id;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}
    
}
