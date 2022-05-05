package com.example.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.entity.Student;
import com.example.security.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping("/save")
	public ResponseEntity<Student> addStudents(@RequestBody Student student)
	{
		Student saveStudents=studentService.addStudents(student);
		return new ResponseEntity<>(saveStudents,HttpStatus.ACCEPTED);
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<Student>> getStudents()
	{
		List<Student> getAll=studentService.getAllStudents();
		return new ResponseEntity<>(getAll,HttpStatus.OK);
	}


}
