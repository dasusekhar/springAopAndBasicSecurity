package com.example.security.dto;

import com.example.security.entity.Student;

public class AdminPresentaion {
	
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public AdminPresentaion(Student student) {
		super();
		this.student = student;
	}

	public AdminPresentaion() {
		super();
	}

	@Override
	public String toString() {
		return "AdminPresentaion [student=" + student + "]";
	}
	

}
