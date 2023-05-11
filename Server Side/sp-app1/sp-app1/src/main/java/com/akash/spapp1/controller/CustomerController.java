package com.akash.spapp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.spapp1.entity.Customer;
import com.akash.spapp1.service.CustomerService;

@RestController
@RequestMapping("customer")
@CrossOrigin
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@PostMapping
	public ResponseEntity<Customer> save(@RequestBody Customer customer) throws Exception{
		return ResponseEntity.ok(customerService.save(customer));
	}
	
	@GetMapping("/verification/email/activationCode/{activationCode}")
	public String emailVerification(@PathVariable String activationCode) throws Exception {
		String message = "Not verified.";
		Customer customer = customerService.findByActivationCode(activationCode);
		if(activationCode.equals(customer.getActivationCode())) {
			message = "<h1>Your email account verified successfully</h1>";
			customer.setStatus(1);
			customerService.update(customer);
		}
			
		return message;
	}
}
