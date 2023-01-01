package com.fdmgroup.bankDesignProject;

import java.util.ArrayList;

public class AccountController {
	
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	private ArrayList<Account> accounts = new ArrayList<Account>();
	
	public Customer createCustomer(String name, String address, String type) {
		if (type == "person") {
			Person person = new Person(name, address);
			customers.add(person);
			return person;
		} else if (type == "company") {
			Company company = new Company(name, address);
			customers.add(company);
			return company;
		} 
		return null;
	}
	
	//
	public Account createAccount(Customer customer, String type) {	
		if (type == "checking") {
			CheckingAccount newAccount = new CheckingAccount();
			accounts.add(newAccount);
			customer.addAccount(newAccount);
			return newAccount;
		} else if (type == "savings") {
			SavingsAccount newAccount = new SavingsAccount();
			accounts.add(newAccount);
			customer.addAccount(newAccount);
			return newAccount;
		}
		return null;
	}
	
	public void removeCustomer(Customer customer) {
		int indexCustomer = customers.indexOf(customer);
		for (Account acct : customers.get(indexCustomer).getAccounts()) {
			accounts.remove(acct);
		}
		customers.remove(customer);
		
	}
	
	public void removeAccount(Account account) {

		accounts.remove(account);
	
		int indexCustomer = -1;
		int indexAccount = -1;
		search:
		for (int i = 0; i < customers.size(); i++) {
			for (int j = 0; j < customers.get(i).getAccounts().size(); j++) {
				if (customers.get(i).getAccounts().get(j).equals(account)) {
					indexCustomer = i;
					indexAccount = j;
					break search;
				}
			}
		}
		if (indexCustomer !=-1 && indexAccount !=-1 ) {
			customers.get(indexCustomer).removeAccount(account);
		}
	}
	
	public ArrayList<Customer> getCustomers(){
		return customers;
	}
	
	public ArrayList<Account> getAccounts(){
		return accounts;
	}
	
	
}
