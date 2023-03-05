package com.akash.spapp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.spapp1.entity.Owner;
import com.akash.spapp1.repository.OwnerRepository;

@Service
public class OwnerService {
	
	@Autowired
	private OwnerRepository ownerRepository;
	
	public Owner save(Owner owner) {
		return ownerRepository.save(owner);
	}
}
