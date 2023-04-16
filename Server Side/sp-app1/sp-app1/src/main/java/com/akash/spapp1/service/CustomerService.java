package com.akash.spapp1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.spapp1.entity.Customer;
import com.akash.spapp1.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private MailService mailService;
	
	public Customer save(Customer customer) throws Exception{
//		db service
		customer = customerRepository.save(customer);
//		mail service	
		mailService.sendMailToVerifyEmailId(customer.getEmail());
		return customer;
	}
}
