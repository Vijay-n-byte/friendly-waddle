package org.medicine.purchasewebsite.dto;

public class assigndto {

	public String username;
	public int ticketnumber;
	@Override
	public String toString() {
		return "assigndto [username=" + username + ", ticketnumber=" + ticketnumber + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getTicketnumber() {
		return ticketnumber;
	}
	public void setTicketnumber(int ticketnumber) {
		this.ticketnumber = ticketnumber;
	}
	public assigndto() {
		super();
	}
	
}
