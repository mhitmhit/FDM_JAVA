package com.fdmgroup.bankDesignProject;

public class CheckingAccount extends Account {

	private int nextCheckNumber = 0;
	
	public int getNextCheckNumber() {
		nextCheckNumber++;
		return nextCheckNumber;
	}
}
