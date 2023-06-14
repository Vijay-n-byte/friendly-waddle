package org.medicine.purchasewebsite.service;

import org.medicine.purchasewebsite.dto.logindto;

import org.medicine.purchasewebsite.entities.admin;
import org.medicine.purchasewebsite.entities.customer;
import org.medicine.purchasewebsite.entities.logincredentials;
import org.medicine.purchasewebsite.repository.logincredentialsrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class logincredentialsservice {
	
	@Autowired
	private logincredentialsrepo lcr;
	
	
	
	public logindto validateadminusername(String s) {
	    admin l=lcr.getadminlogins(s);
		logindto ld=new logindto();
		if(l==null) {
			ld=null;
			return ld;
		}
		else {
			ld.setUsername(l.getUsername());
			ld.setPassword(l.getPassword());
			return ld;
		}
	
	}
	
	public logindto getlogindto(String h) {
		 customer l=lcr.getcustomerlogins(h);
		 logindto ld=new logindto();
			if(l==null) {
				ld=null;
				return ld;
			}
			else {
				ld.setUsername(l.getUsername());
				ld.setPassword(l.getPassword());
				return ld;
			}
	}
	
	public logindto getmanagerlogin(String h) {
		 logincredentials l=lcr.getmanagerlogins(h);
		 logindto ld=new logindto();
			if(l==null) {
				ld=null;
				return ld;
			}
			else {
				ld.setUsername(l.getUsername());
				ld.setPassword(l.getPassword());
				return ld;
			}
	}
	
	public logindto getengineerlogin(String h) {
		 logincredentials l=lcr.getengineerlogins(h);
		 logindto ld=new logindto();
			if(l==null) {
				ld=null;
				return ld;
			}
			else {
				ld.setUsername(l.getUsername());
				ld.setPassword(l.getPassword());
				return ld;
			}
	}
	
	

	
}
