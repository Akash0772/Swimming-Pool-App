package com.akash.spapp1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akash.spapp1.entity.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	public Customer findByEmail(String email);
	
	public Customer findByActivationCode(String activationCode);
}
