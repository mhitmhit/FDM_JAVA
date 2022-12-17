package com.fdmgroup.inheritanceExercises;

public abstract class UserAccount {
	// variables
	private String username;
	private String password;
	private String fullName;

	// constructor
	public UserAccount(String username, String password, String fullName) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
	}
	
	// methods
	public boolean changePassword(String newPass, String confirmPass) {
		if (newPass.equals(confirmPass)) {
			password = newPass;
			return true;
		} else {
			return false;
		}
	}
	public abstract void accessWebsite();
	
	// getters and setters
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPassword() {
		return password;
	}
	

	
	
	
}
