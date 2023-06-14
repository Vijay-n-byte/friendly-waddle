package org.medicine.purchasewebsite.dto;

public class complaintsdto {
	
	private String username;
	private String com;
	private String pincode;
	public String getUsername() {
		return username;
	}
	@Override
	public String toString() {
		return "complaintsdto [username=" + username + ", com=" + com + ", pincode=" + pincode + "]";
	}
	public String getCom() {
		return com;
	}
	public void setCom(String com) {
		this.com = com;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	
	
	

}
