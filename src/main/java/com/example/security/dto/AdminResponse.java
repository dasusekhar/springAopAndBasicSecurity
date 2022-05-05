package com.example.security.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class AdminResponse {
	private String studentName;
	private String name;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AdminResponse(String studentName, String name) {
		super();
		this.studentName = studentName;
		this.name = name;
	}
	public AdminResponse() {
		super();
	}
	@Override
	public String toString() {
		return "AdminResponse [studentName=" + studentName + ", name=" + name + "]";
	}
	

}
