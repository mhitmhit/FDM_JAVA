package com.fdmgroup.bankDesignProject;

public abstract class Account {
	
	private final long ACCOUNT_ID;
	private static long nextAccoutnId = 1000;
	protected double balance = 0;
	
	public Account() {
		this.ACCOUNT_ID = Account.nextAccoutnId;
		Account.nextAccoutnId = Account.nextAccoutnId + 5;
	}
	
	public double withdraw(double amount) {
		balance = balance - amount;
		return amount;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void correctBalance(double amount) {
		balance = amount;
	}
	
	public long getACCOUNT_ID() {
		return ACCOUNT_ID;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
}
