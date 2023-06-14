package org.medicine.purchasewebsite.entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class complaints {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ticketno;
//	private int productno;
	private String complaint;
	//open-1 ,close-0--manager query
	private   int  status;
	//used for engineers query
	@Nullable
	private String asignedto;
	private String pincode;

	@ManyToOne
	private customer cust;

	public int getTicketno() {
		return ticketno;
	}

	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
	}

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getAsignedto() {
		return asignedto;
	}

	public void setAsignedto(String asignedto) {
		this.asignedto = asignedto;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

//	public customer getCust() {
//		return cust;
//	}

	public void setCust(customer cust) {
		this.cust = cust;
	}

	public complaints() {
		super();
	}

	@Override
	public String toString() {
		return "complaints [ticketno=" + ticketno + ", complaint=" + complaint + ", status=" + status + ", asignedto="
				+ asignedto + ", pincode=" + pincode +  "]";
	}
	
	
	

}
