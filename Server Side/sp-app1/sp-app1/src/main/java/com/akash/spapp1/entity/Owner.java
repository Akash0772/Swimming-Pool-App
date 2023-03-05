package com.akash.spapp1.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Owner {
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Long mobileNumber;
	private String email;
	private String password;
	@OneToMany
	private Set<SwimmingPool> swimmingPools = new HashSet<>();
//	Generate getter and setter
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<SwimmingPool> getSwimmingPools() {
		return swimmingPools;
	}
	public void setSwimmingPools(Set<SwimmingPool> swimmingPools) {
		this.swimmingPools = swimmingPools;
	}
	

	
//	we will consider other fields later
}
