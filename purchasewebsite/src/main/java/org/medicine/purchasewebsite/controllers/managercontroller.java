package org.medicine.purchasewebsite.controllers;

import org.medicine.purchasewebsite.dto.assigndto;
import org.medicine.purchasewebsite.dto.managerdto;
import org.medicine.purchasewebsite.service.customerservice;
import org.medicine.purchasewebsite.service.managerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping(value="/manager")
public class managercontroller {
	
	@Autowired
	private customerservice cs;
	
	@Autowired
	private managerservice ms;
	
	@GetMapping
	public managerdto getdetailsformanager() {
		return cs.getmanagerdto();
	}
	
	@PostMapping
	public void assignbymanager(@RequestBody assigndto a) {
		System.out.println(a);
		ms.updatecomplaints(a);
	}
	
	

}
