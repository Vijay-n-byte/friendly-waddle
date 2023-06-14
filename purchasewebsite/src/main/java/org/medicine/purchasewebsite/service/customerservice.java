package org.medicine.purchasewebsite.service;

import java.util.List;

import org.medicine.purchasewebsite.dto.complaintsdto;
import org.medicine.purchasewebsite.dto.customerdto;
import org.medicine.purchasewebsite.dto.managerdto;
import org.medicine.purchasewebsite.entities.customer;
import org.medicine.purchasewebsite.entities.complaints;
import org.medicine.purchasewebsite.repository.customerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class customerservice {

	@Autowired
	private customerrepo cr;
	
	public customerdto sendcustomerdto(String h) {
		customer y=cr.getcustomer(h);
		customerdto b=new customerdto();
		b.setUsername(y.getUsername());
		b.setProductno(y.getProductno());
		b.setComplaints1(y.getC());
		return b;
		
	}
	
	public void savecomplaints(complaintsdto cd) {
		customer c=cr.getcustomer(cd.getUsername());
		complaints comp=new complaints();
		
		comp.setComplaint(cd.getCom());
		comp.setCust(c);
		comp.setStatus(1);
		comp.setPincode(cd.getPincode());
		cr.savecomplaintsofcustomer(comp);
	}
	
	public managerdto getmanagerdto() {
		managerdto mg=new managerdto();
		mg.setC(cr.getcomplaintsformanager());
		mg.setL(cr.getengineersfformanagers());
		System.out.print(mg);
	    return mg;
	}
	
	public List<complaints> getengineercomplaints(String h) {
		return cr.getcomplaintsforengineers(h);
	}
	
	
	
	
}
