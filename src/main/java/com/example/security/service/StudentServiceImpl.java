package com.example.security.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.security.dto.AdminPresentaion;
import com.example.security.dto.AdminResponse;
import com.example.security.entity.Parents;
import com.example.security.entity.Student;
import com.example.security.error.BusinessException;
import com.example.security.repository.ParentsRepository;
import com.example.security.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private ParentsRepository parentsRepository;
	

	@Override
	public Student addStudents(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}
	//sorting name of the student

	@Override
	public List<Student> getByStudentsBys() {
		List<Student>list1=studentRepository.findAll();
		
		List<Student>list2=list1.stream().sorted(Comparator.comparing(Student::getStudentName)).collect(Collectors.toList());
		return list2;
	}

	@Override
	public long getCounts() {
		List<Student>List3=studentRepository.findAll();
		long c=List3.stream().count();
		
		
		return c;
	}

	@Override
	public Long getByCourse(String course) {
		List<Student>list4=studentRepository.findAll();
		Long courses=list4.stream().filter(x->x.getCourse().equalsIgnoreCase(course)).count();
		return courses;
	}

	@Override
	public List<Student> getByCouseList(String course) {
		List<Student>list5=studentRepository.findAll();
		List<Student> list6=list5.stream().filter(x->x.getCourse().equalsIgnoreCase(course)).collect(Collectors.toList());
		return list6;
	}
	

	@Override
	public List<Student> getByStudentStarsWith(int id) {
	List<Student>list7=studentRepository.findAll();
	List<Student>list8=list7.stream().filter(x->x.getId()>id).collect(Collectors.toList());
		return list8;
	}
/*
	@Override
	public Optional<String> getByStudentFeeStatus(String status) {
		List<Parents> list9=parentsRepository.findAll();
		Optional<String> statusN=list9.stream().filter(x->x.getStatus()==status).map(Parents::getName).findAny();
		return statusN;
	}
*/
	@Override
	public Parents saveParents(Parents parent) {
		if(parent.getName().isEmpty()||parent.getName().length()==0)
		{
			throw new BusinessException("601","input field are empty");
		}
		
		return parentsRepository.save(parent);
	}

	@Override
	public List<Parents> getParentsAll() {
		
		return parentsRepository.findAll();
	}

	@Override
	public List<Parents> getFeeAndStasus(String status, int fee) {
		

List<Parents> list1=parentsRepository.findByFeeAndStatus(fee, status);
//List<Parents> list2=list1.stream().filter(x->x.getStatus()==status).filter(x->x.getFee()==fee).collect(Collectors.toList());
		return list1;
	}

	@Override
	public List<Parents> getFeeAndStasusDuplicate(String status, int fee) {
		List<Parents>list6=parentsRepository.findAll();
		List<Parents> list7=list6.stream().filter(x->x.getFee()>fee).filter(k->k.getStatus().contentEquals(status)).collect(Collectors.toList());
			
		
		
		return list7;
	}

	@Override
	public List<AdminResponse> getJoin() {
		
		return studentRepository.getAllInformation();
	}

	
	
	
	
	

}
