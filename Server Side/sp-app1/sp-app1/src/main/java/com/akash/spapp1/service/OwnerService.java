package com.akash.spapp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.akash.spapp1.entity.Owner;
import com.akash.spapp1.repository.OwnerRepository;

@Service
public class OwnerService {
	
	@Autowired
	private OwnerRepository ownerRepository;
	
	@Autowired
	private MailService mailService;
	
	public Owner save(Owner owner) throws Exception{
//		db service
		owner = ownerRepository.save(owner);
//		mailService.sendMessage(customer.getEmail());
//		mail service
//		if(customer.getStatus()==0) {
//			String activationCode = mailService.sendMailToVerifyEmailId(customer.getEmail(), "customer");
//			customer.setActivationCode(activationCode);
//			customer = customerRepository.save(customer);
//		}
		String activationCode = mailService.sendMailToVerifyEmailId(owner.getEmail(), "owner");
		owner.setActivationCode(activationCode);
		owner = ownerRepository.save(owner);
		return owner;
		
	}
	public Owner update(Owner owner) throws Exception{
//		db service
		owner = ownerRepository.save(owner);
		return owner;
		
	}
	
	public Owner findByEmail(String email) {
		return ownerRepository.findByEmail(email);
	}
	public Owner findByActivationCode(String activationCode) {
		return ownerRepository.findByActivationCode(activationCode);
	}
}
