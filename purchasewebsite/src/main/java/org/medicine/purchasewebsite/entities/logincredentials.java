package org.medicine.purchasewebsite.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class logincredentials {
	@Id
	private String username;
	private String password;
	private String pincode;
	private String name;
	//managers or enginnerrs;used for query
	private String designations;
	@Override
	public String toString() {
		return "logincredentials [username=" + username + ", password=" + password + ", pincode=" + pincode + ", name="
				+ name + ", designations=" + designations + "]";
	}
	public logincredentials() {
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignations() {
		return designations;
	}
	public void setDesignations(String designations) {
		this.designations = designations;
	}
	
	

}
