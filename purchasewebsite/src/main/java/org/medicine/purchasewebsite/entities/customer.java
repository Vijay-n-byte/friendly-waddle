package org.medicine.purchasewebsite.entities;

import java.util.List;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class customer {
	
	//it is also considered to be customerid
	@Id
	private String username;
	private String password;
	private String productno;
	
	
	@OneToMany(mappedBy="cust")
	@Nullable
	private List<complaints> c;
	
    public customer() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProductno() {
		return productno;
	}

	public void setProductno(String productno) {
		this.productno = productno;
	}

	public List<complaints> getC() {
		return c;
	}

	public void setC(List<complaints> c) {
		this.c = c;
	}

	
	
    
    
	
	
	
	
}
