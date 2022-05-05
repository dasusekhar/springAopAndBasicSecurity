package com.example.security.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Parents {
	@Id
	
	private int id;
	private String name;
	private String mobile;
	private String address;
	private int fee;
	private String status;
	public int getId() {
		return id;
	}
	
	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Parents(int id, String name, String mobile, String address, int fee, String status) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.address = address;
		this.fee = fee;
		this.status = status;
	}
	public Parents() {
		super();
	}
	

}
