package com.emc.entities;

 class Participant extends EMBase{
	/*
	 * public long id; public String name;
	 */
	public String email;
	public String checkdIn;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCheckdIn() {
		return checkdIn;
	}
	public void setCheckdIn(String checkdIn) {
		this.checkdIn = checkdIn;
	}
	
}
