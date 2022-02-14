package com.myproject.springboot.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

@Entity
public class Profile {
	@Id
	private int id;
	
	private String email;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	 @JsonFormat(pattern="yyyy-MM-dd")
	private Date dateOfBirth;
	private String imageUrl;
	private String about;
	@OneToOne
	@JoinColumn(name="user_id")
	@JsonIgnore
	private User userId;

	
	protected Profile() {
		
	}

	public Profile(String email, String firstName, String lastName, String phoneNumber, String address, Date dateOfBirth,
			String imageUrl, User userId,String about) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.imageUrl = imageUrl;
		this.userId = userId;
		this.setAbout(about);
		}

	
	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public User getUserId() {
		return userId;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}
	
	

}
