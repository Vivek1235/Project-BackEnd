package com.myproject.springboot.demo;

public class userModel {
	private String email;
	private String password;
	
	public userModel(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	

}
