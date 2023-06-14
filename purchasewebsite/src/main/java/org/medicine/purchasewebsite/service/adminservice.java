package org.medicine.purchasewebsite.service;

import java.util.List;

import org.medicine.purchasewebsite.entities.customer;
import org.medicine.purchasewebsite.entities.logincredentials;
import org.medicine.purchasewebsite.repository.adminrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class adminservice {
	
	@Autowired
	private adminrepo ar;
	
	public void addcustomers1(customer c) {
		ar.addcustomer(c);
	}
	
	public void addengineer1(logincredentials c) {
		ar.addengineer(c);
	}
	public void addmanager1(logincredentials c) {
		ar.addmanager(c);
	}
	
	public List<customer> getcust(){
		return ar.getcustomersforadmin();
	}
	
	

}
