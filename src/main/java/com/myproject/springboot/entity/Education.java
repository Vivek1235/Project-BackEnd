package com.myproject.springboot.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Education {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String schoolName;
	private String degreeName;
	private Date startDate;
	private Date endDate;
	private Float grade;
	private String descript;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	@JsonIgnore
	private User educationUserId;

	
	protected Education() {
	}

	public Education(String schoolName, String degreeName, Date startDate, Date endDate, Float grade, String desc,
			User educationUserId) {
		super();
		this.schoolName = schoolName;
		this.degreeName = degreeName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.grade = grade;
		this.descript = desc;
		this.educationUserId = educationUserId;
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

	public User getEducationUserId() {
		return educationUserId;
	}
	public void setEducationUserId(User educationUserId) {
		this.educationUserId = educationUserId;
	}


}
