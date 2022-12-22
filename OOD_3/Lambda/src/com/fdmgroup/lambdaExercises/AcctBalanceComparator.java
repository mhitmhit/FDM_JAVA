package com.fdmgroup.lambdaExercises;

import java.util.Comparator;

public class AcctBalanceComparator implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		if (o1.getBalance() > o2.getBalance())
			return 1;
		else if (o1.getBalance() < o2.getBalance())
			return -1;
		else 
			return 0;
	}
	
}
