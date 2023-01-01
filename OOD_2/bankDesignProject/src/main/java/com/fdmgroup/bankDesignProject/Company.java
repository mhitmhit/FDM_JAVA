package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;

public class Company extends Customer {

	public Company(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void chargeAllAccounts(double amount) {
		ArrayList<Account> customerAccounts = getAccounts();
		for (int i = 0; i < customerAccounts.size(); i++) {
			if ( customerAccounts.get(i) instanceof SavingsAccount) {
				customerAccounts.get(i).withdraw(2 * amount);
			} else {
				customerAccounts.get(i).withdraw(amount);
			}
		}
	}

}
