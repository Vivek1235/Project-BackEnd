package com.myproject.springboot.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

@Entity
public class Experience {
	
	@Id
	private int id;
	
	private String title;
	private String employmentType;
	private String companyName;
	private String location;
	
    @JsonFormat(pattern="yyyy-MM-dd")
	private Date startDate;
    @JsonFormat(pattern="yyyy-MM-dd")
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	@JsonIgnore
	private User userId;
	
	

	protected Experience() {
	}

	public Experience(String title, String employmentType, String companyName, String location, Date startDate,
			Date endDate, User experienceUserId) {
		super();
		this.title = title;
		this.employmentType = employmentType;
		this.companyName = companyName;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.userId = experienceUserId;
	}
	

	public Experience(int id, String title, String employmentType, String companyName, String location, Date startDate,
			Date endDate, User userId) {
		super();
		this.id = id;
		this.title = title;
		this.employmentType = employmentType;
		this.companyName = companyName;
		this.location = location;
		this.startDate = startDate;
		this.endDate = endDate;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getLocation() {
		return location;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}

	
	

}
