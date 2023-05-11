package com.akash.spapp1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//import com.akash.spapp1.entity.Customer;
import com.akash.spapp1.entity.Owner;
@Repository
public interface OwnerRepository extends CrudRepository<Owner, Integer> {
	public Owner findByEmail(String email);
	
	public Owner findByActivationCode(String activationCode);
}
