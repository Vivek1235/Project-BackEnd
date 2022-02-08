package com.myproject.springboot.jpa;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Experience {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String title;
	private String employmentType;
	private String companyName;
	private String location;
	

	private Date startDate;
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User experienceUserId;
	
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
		this.experienceUserId = experienceUserId;
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

	public User getExperienceUserId() {
		return experienceUserId;
	}
	

}
