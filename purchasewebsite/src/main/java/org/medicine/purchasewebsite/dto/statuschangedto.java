package org.medicine.purchasewebsite.dto;

public class statuschangedto {
	
	private int ticketnumber;
	private String username;
	@Override
	public String toString() {
		return "statuschangedto [ticketnumber=" + ticketnumber + ", username=" + username + "]";
	}
	public statuschangedto() {
		super();
	}
	public int getTicketnumber() {
		return ticketnumber;
	}
	public void setTicketnumber(int ticketnumber) {
		this.ticketnumber = ticketnumber;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	

}
