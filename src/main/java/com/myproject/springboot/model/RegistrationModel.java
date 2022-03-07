package com.myproject.springboot.model;

public class RegistrationModel {
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	
	private String phoneNumber;
	private RegistrationModel()
	{}
	public RegistrationModel(String email, String firstName, String lastName, String password,String phoneNumber) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phoneNumber=phoneNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	

}
