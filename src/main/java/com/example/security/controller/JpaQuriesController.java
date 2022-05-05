package com.example.security.controller;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.dto.AdminPresentaion;
import com.example.security.dto.AdminResponse;
import com.example.security.entity.Parents;
import com.example.security.entity.Student;
import com.example.security.service.StudentService;

@RestController
@RequestMapping("/student1")
@CrossOrigin("http://localhost:4200")

public class JpaQuriesController {
	@Autowired
	private StudentService studentService;
	@GetMapping("/get")
	public ResponseEntity<List<?>> getByIdSorting()
	{
		List<Student> get1=studentService.getByStudentsBys();
		return new ResponseEntity<>(get1,HttpStatus.ACCEPTED);
	}
	@GetMapping("/count")
	public ResponseEntity<?> getCountStudents()
	{
		Long get2=studentService.getCounts();
		return new ResponseEntity<>(get2,HttpStatus.ACCEPTED);
	}
	@GetMapping("/courseList/{course}")
	public ResponseEntity<?> getCourseStudents(@PathVariable("course") String course)
	{
		Long get3=studentService.getByCourse(course);
		return new ResponseEntity<>(get3,HttpStatus.ACCEPTED);
	}
	@GetMapping("/courseDetails/{course}")
	public ResponseEntity<List<?>> getByCourseList(@PathVariable String course)
	{
		List<Student> get4=studentService.getByCouseList(course);
		return new ResponseEntity<>(get4,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getStartWith/{id}")
	public ResponseEntity<List<?>> getStudentNameStartWith(@PathVariable("id")int id)
	{
		List<Student> get5=studentService.getByStudentStarsWith(id);
		return new ResponseEntity<>(get5,HttpStatus.ACCEPTED);
	}
	/*
	@GetMapping("/feeStatus/{status}")
	public ResponseEntity<List<?>> getByIdSorting(@PathVariable String status)
	{
		java.util.Optional<Parents> get6=studentService.getByStudentFeeStatus(status);
		return new ResponseEntity<>(get6,HttpStatus.ACCEPTED);
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	@PostMapping("/parents/save")
	public ResponseEntity<?> saveParent(@RequestBody Parents parent)
	{
		Parents get7= studentService.saveParents(parent);
		return new ResponseEntity<>(get7,HttpStatus.ACCEPTED);
	}
	@GetMapping("/parents/get")
	public ResponseEntity<List<?>> getParentsAll( )
	{
		List<Parents> get8= studentService.getParentsAll();
		return new ResponseEntity<>(get8,HttpStatus.ACCEPTED);
	}
	@GetMapping("/parents/{status}/{fee}")
		public ResponseEntity<List<?>> getFeeAndStatus(@PathVariable String status,@PathVariable int fee)
	{
	List<Parents> get9= studentService.getFeeAndStasus(status,fee);
		return new ResponseEntity<>(get9,HttpStatus.ACCEPTED);
	}
	@GetMapping("/parent/{status}/{fee}")
	public ResponseEntity<List<?>> getFeeAndStatusDuplicate(@PathVariable String status,@PathVariable int fee)
{
List<Parents> get10= studentService.getFeeAndStasusDuplicate(status,fee);
	return new ResponseEntity<>(get10,HttpStatus.ACCEPTED);
}
	
	
	@GetMapping("/parent/join")
	public ResponseEntity<List<?>> getJoin()
{
List<AdminResponse> get11= studentService.getJoin();
	return new ResponseEntity<>(get11,HttpStatus.ACCEPTED);
}




}
