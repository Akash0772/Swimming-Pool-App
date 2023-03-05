package com.akash.spapp1.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	private Integer id;
	private String firstName;
	
	@OneToMany(mappedBy="customer")
	private Set<Booking> bookings = new HashSet<>();
	
//	remaining attributes will be consider later
}
