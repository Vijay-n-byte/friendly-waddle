package org.medicine.purchasewebsite.service;

import org.medicine.purchasewebsite.dto.assigndto;
import org.medicine.purchasewebsite.dto.statuschangedto;
import org.medicine.purchasewebsite.entities.complaints;
import org.medicine.purchasewebsite.repository.customerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class engineerservice {
	
	@Autowired
	private customerrepo crr;
	
	public void updatecomplaints1(statuschangedto a) {
		complaints c=crr.getcomplaint(a.getTicketnumber());
		System.out.println(c);
		c.setStatus(0);
		crr.updatecomplaintsofcustomer(c);
	}

}
