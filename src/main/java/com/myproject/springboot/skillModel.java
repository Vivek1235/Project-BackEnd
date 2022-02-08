package com.myproject.springboot;

public class skillModel {
	private String name;
	private Float level;
	
	public skillModel(String name, Float level) {
		super();
		this.name = name;
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public Float getLevel() {
		return level;
	}
	

}
