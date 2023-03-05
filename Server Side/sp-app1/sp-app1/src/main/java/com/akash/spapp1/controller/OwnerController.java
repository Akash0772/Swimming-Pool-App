package com.akash.spapp1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akash.spapp1.entity.Owner;
import com.akash.spapp1.service.OwnerService;

@RestController
@RequestMapping("owner")
@CrossOrigin
public class OwnerController {
	
	private OwnerService ownerService;
	
	@PostMapping
	public ResponseEntity<Owner> save(@RequestBody Owner owner){
		return ResponseEntity.ok(ownerService.save(owner));
	}
}
