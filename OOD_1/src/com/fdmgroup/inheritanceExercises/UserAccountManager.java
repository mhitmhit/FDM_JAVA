package com.fdmgroup.inheritanceExercises;

import java.util.ArrayList;

public class UserAccountManager {
	
	// variables
	private ArrayList<UserAccount> userAccounts = new ArrayList<UserAccount>();
	
	// methods
	public void addUser(UserAccount user) {
		userAccounts.add(user);
	}
	public boolean login(String username, String password) {
		for (UserAccount user:userAccounts) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;	
	}
	
	

}// End of Class
