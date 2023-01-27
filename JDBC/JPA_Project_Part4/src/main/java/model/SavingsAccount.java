package model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class SavingsAccount extends BankAccount {
	@Column
	private double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
