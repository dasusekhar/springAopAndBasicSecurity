package com.example.security.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Student implements Serializable {
	@Id
	private int id;
	private String studentName;
	private String course;
	
	@OneToOne(targetEntity=Parents.class,cascade=CascadeType.ALL)
	@JoinColumn(name="cp_fk",referencedColumnName="id")
	private Parents parents;
	
	public Parents getParents() {
		return parents;
	}
	public void setParents(Parents parents) {
		this.parents = parents;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student(int id, String studentName, String course) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.course = course;
	}
	public Student() {
		super();
	}
	

}
