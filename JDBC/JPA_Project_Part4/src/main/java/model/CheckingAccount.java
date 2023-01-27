package model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class CheckingAccount extends BankAccount {
	@Column
	private double minBalance;
	public CheckingAccount() {
		super();
	}
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

}
