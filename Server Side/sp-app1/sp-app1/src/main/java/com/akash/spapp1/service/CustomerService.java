package com.akash.spapp1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.akash.spapp1.config.EmailConfig;
import com.akash.spapp1.entity.Customer;
import com.akash.spapp1.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
//	@Autowired
//	private EmailConfig mailService;
	
	@Autowired
	private MailService mailService;
	
	public Customer save(Customer customer) throws Exception{
//		db service
		customer = customerRepository.save(customer);
//		mailService.sendMessage(customer.getEmail());
//		mail service
//		if(customer.getStatus()==0) {
//			String activationCode = mailService.sendMailToVerifyEmailId(customer.getEmail(), "customer");
//			customer.setActivationCode(activationCode);
//			customer = customerRepository.save(customer);
//		}
		String activationCode = mailService.sendMailToVerifyEmailId(customer.getEmail(), "customer");
		customer.setActivationCode(activationCode);
		customer = customerRepository.save(customer);
		return customer;
		
	}
	public Customer update(Customer customer) throws Exception{
//		db service
		customer = customerRepository.save(customer);
		return customer;
		
	}
	
	public Customer findByEmail(String email) {
		return customerRepository.findByEmail(email);
	}
	public Customer findByActivationCode(String activationCode) {
		return customerRepository.findByActivationCode(activationCode);
	}
}
