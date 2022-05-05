package com.example.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.security.dto.AdminPresentaion;
import com.example.security.dto.AdminResponse;
import com.example.security.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
	@Query("select new com.example.security.dto.AdminResponse(c.studentName,p.name) from Student c join c.parents p")
	public List<AdminResponse> getAllInformation();
	
	

}
