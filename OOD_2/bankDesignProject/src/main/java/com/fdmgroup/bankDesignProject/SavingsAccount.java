package com.fdmgroup.bankDesignProject;

public class SavingsAccount extends Account {
	
	private double interestRate;
	
	public void addInterest() {
		balance = balance + balance * ( interestRate / 100 );
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double rate) {
		this.interestRate = rate;
	}
	
	@Override
	public double withdraw(double amount) {
		if (this.balance < amount ) {
			return 0;
		}	
		balance = balance - amount;
		return amount;
	}
	
}
