package org.medicine.purchasewebsite.controllers;

import org.medicine.purchasewebsite.dto.logindto;
import org.medicine.purchasewebsite.service.logincredentialsservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping(value="/login")
public class logincontroller {
	
	@Autowired
	private logincredentialsservice ls;
	
	@GetMapping(value= "admin/{user}")
	public logindto responsetoadminlogin(@PathVariable String user) {
		return ls.validateadminusername(user);
	}
	
	@GetMapping(value= "customer/{user}")
	public logindto responsetocustomerlogin(@PathVariable String user) {
		return ls.getlogindto(user);
	}
	
	@GetMapping(value= "manager/{user}")
	public logindto responsetmanagerlogin(@PathVariable String user) {
		return ls.getmanagerlogin(user);
	}
	
	@GetMapping(value= "engineer/{user}")
	public logindto responsetengineerlogin(@PathVariable String user) {
		return ls.getengineerlogin(user); 
	}
}


