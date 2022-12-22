package com.fdmgroup.lambdaExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount account1 = new BankAccount(12345678, 987654, "Mr J Smith", "savings", 1.1, 25362.91);
	    BankAccount account2 = new BankAccount(87654321, 234567, "Ms J Jones", "current/checking", 0.2, 550);
	    BankAccount account3 = new BankAccount(74639572, 946284, "Dr T Williams", "savings", 1.1, 4763.32);
	    BankAccount account4 = new BankAccount(94715453, 987654, "Ms S Taylor", "savings", 1.1, 10598.01);
	    BankAccount account5 = new BankAccount(16254385, 234567, "Mr P Brown", "current/checking", 0.2, -195.74);
	    BankAccount account6 = new BankAccount(38776543, 946284, "Ms F Davies", "current/checking", 0.2, -503.47);
	    BankAccount account7 = new BankAccount(87609802, 987654, "Mr B Wilson", "savings", 1.1, 2.5);
	    BankAccount account8 = new BankAccount(56483769, 234567, "Dr E Evans", "current/checking", 0.2, -947.72);
	    
	    List<BankAccount> bankAccountsList = new ArrayList<BankAccount>(Arrays.asList(account1, account2, account3, account4, account5, account6, account7, account8));
	    
		System.out.println("1.3.1");
	    bankAccountsList.forEach(acct -> System.out.println("account holder: "+acct.getAccountHolder()+" and balance is: "+ acct.getBalance()));
	    
	    System.out.println("1.3.3");
	    bankAccountsList.forEach(acct -> acct.setBalance(acct.getBalance()-10));
	    bankAccountsList.forEach(acct -> System.out.println("account holder: "+acct.getAccountHolder()+" and balance is: "+ acct.getBalance()));
	    
	    System.out.println("1.3.4");
	    bankAccountsList.removeIf(acct -> acct.getBalance() < -500 );
	    bankAccountsList.forEach(acct -> System.out.println("account holder: "+acct.getAccountHolder()+" and balance is: "+ acct.getBalance()));
	    
	    System.out.println("1.3.5");
	    bankAccountsList = new ArrayList<BankAccount>(Arrays.asList(account1, account2, account3, account4, account5, account6, account7, account8));
	    bankAccountsList.removeIf(acct -> acct.getAccountType().contains("savings"));
	    bankAccountsList.forEach(acct -> System.out.println("account holder: "+acct.getAccountHolder()+" and balance is: "+ acct.getBalance()));
	    
	}

}
