package org.medicine.purchasewebsite.dto;

import java.util.List;

import org.medicine.purchasewebsite.entities.complaints;
import org.springframework.web.multipart.MultipartFile;

import jakarta.annotation.Nullable;
import jakarta.persistence.OneToMany;

public class customerdto {
	
	private String username;
	private String productno;
	private List<complaints> complaints1;
	@Override
	public String toString() {
		return "customerdto [username=" + username + ", productno=" + productno + ", complaints1=" + complaints1 + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getProductno() {
		return productno;
	}
	public void setProductno(String productno) {
		this.productno = productno;
	}
	public List<complaints> getComplaints1() {
		return complaints1;
	}
	public void setComplaints1(List<complaints> complaints1) {
		this.complaints1 = complaints1;
	}
	public customerdto() {
		super();
	}
	
	
	
	
}
