package com.example.security.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.security.entity.Parents;

@Repository
public interface ParentsRepository extends JpaRepository<Parents,Integer>{
	
	List<Parents> findByFeeAndStatus(int fee,String status);
}
