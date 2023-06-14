package org.medicine.purchasewebsite.controllers;

import java.util.List;

import org.medicine.purchasewebsite.entities.customer;
import org.medicine.purchasewebsite.entities.logincredentials;
import org.medicine.purchasewebsite.service.adminservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping(value="/admin")
public class admincontroller {
	
	@Autowired
	private adminservice as;
	
	@PostMapping("/customer")
	public void addcustomerbyadmin(@RequestBody customer c) {
		as.addcustomers1(c);

	}
	
	@GetMapping("/customer")
	public List<customer> getcustomerbyadmin() {
		return as.getcust();

	}
	
	
	
	@PostMapping("/engineer")
	public void addengineerbyadmin(@RequestBody logincredentials c) {
		as.addengineer1(c);

	}
	
	@PostMapping("/manager")
	public void addmanagerbyadmin(@RequestBody logincredentials c) {
		as.addmanager1(c);

	}
	
	

}
