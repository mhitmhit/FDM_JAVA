package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;

public class Person extends Customer {

	public Person(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void chargeAllAccounts(double amount) {
		ArrayList<Account> customerAccounts = getAccounts();
		for (int i = 0; i < customerAccounts.size(); i++) {
			customerAccounts.get(i).withdraw(amount);
		}
	}

}
