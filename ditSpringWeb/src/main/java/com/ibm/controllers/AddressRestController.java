package com.ibm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.entities.Address;
import com.ibm.repo.AddressRepo;

@RestController
@RequestMapping("/api")
public class AddressRestController {

	@Autowired
	AddressRepo repo;
	@PostMapping("/address")
	public void addAddress(@RequestBody Address address){
		repo.addAddress(address);
	}
	
	@GetMapping("/address")
	public Address findAddress(){
		return new Address(12, "GK", "Delhi");
	}
}
