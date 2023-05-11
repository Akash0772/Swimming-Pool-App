package com.akash.spapp1.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Date date;
	
	@ManyToOne
	private SwimmingPool swimmingPool;
	@ManyToOne
	private Customer customer;
	
//	remaining field later
}

/*
 1. Same owner will have multiple swimming pool.
 2. Multiple booking can be done by a same customer
 3. Multiple booking can be done under one swimming pool.
 4. Every booking required customer and swimming pool.
 5. Every swimming pool should belong to the one owner.
*/