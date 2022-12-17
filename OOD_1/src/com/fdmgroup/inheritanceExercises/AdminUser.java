package com.fdmgroup.inheritanceExercises;

public class AdminUser extends UserAccount {
	
	public AdminUser(String username, String password, String fullName) {
		super(username, password, fullName);
		// TODO Auto-generated constructor stub
	}

	// methods
	public void accessWebsite() {
		System.out.println("accessing website as Admin User");
	}
	
	
}
