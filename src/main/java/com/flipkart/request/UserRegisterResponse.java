package com.flipkart.request;

import org.springframework.stereotype.Component;

@Component
public class UserRegisterResponse {
	
	private int id;
	private String name;
	private int marks;
	public UserRegisterResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRegisterResponse(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
