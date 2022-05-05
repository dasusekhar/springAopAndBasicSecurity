package com.example.security.service;

import java.util.List;
import java.util.Optional;

import com.example.security.dto.AdminPresentaion;
import com.example.security.dto.AdminResponse;
import com.example.security.entity.Parents;
import com.example.security.entity.Student;

public interface StudentService {

	Student addStudents(Student student);

	List<Student> getAllStudents();

	List<Student> getByStudentsBys();

	long getCounts();

	Long getByCourse(String course);

	List<Student> getByCouseList(String course);

	

	List<Student> getByStudentStarsWith(int id);

	//Optional<Parents> getByStudentFeeStatus(String status);

	Parents saveParents(Parents parent);

	List<Parents> getParentsAll();



	List<Parents> getFeeAndStasus(String status, int fee);

	List<Parents> getFeeAndStasusDuplicate(String status, int fee);

	List<AdminResponse> getJoin();



}
