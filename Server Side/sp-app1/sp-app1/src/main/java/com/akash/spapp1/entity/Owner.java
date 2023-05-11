package com.akash.spapp1.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Owner {
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Long mobileNumber;
	private String email;
	private String password;
	private String activationCode;
	private int status = 0; // 0 ==> yet to verify, 1 ==> verified
	@OneToMany(mappedBy="owner")
	private Set<SwimmingPool> swimmingPools = new HashSet<>();
//	we will consider other fields later
}
