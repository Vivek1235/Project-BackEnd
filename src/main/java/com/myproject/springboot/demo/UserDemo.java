package com.myproject.springboot.demo;

public class UserDemo {
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	private UserDemo()
	{}
	public UserDemo(String email, String firstName, String lastName, String password) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
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
	

}
