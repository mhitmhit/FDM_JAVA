package com.fdmgroup.lambdaExercises;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import InClass.Person;

public class Runner_1_2 {

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

    
    System.out.println("1.2.1");
    Function<BankAccount, String> customerNameAndBalance = 
			account -> account.getAccountHolder() + "---" + account.getBalance();
	System.out.println(customerNameAndBalance.apply(account3));
	
	
	System.out.println("1.2.2");
	Function<BankAccount, Double> interestDue =
			account -> account.getBalance() * account.getInterestRate()/100;
	System.out.println(interestDue.apply(account2));
	
	
	System.out.println("1.2.3");
	Function<BankAccount, Double> interestDueForOverdrawnAccount =
			account -> (account.getBalance() < 0) ? 0 : account.getBalance() * account.getInterestRate()/100;
			//account -> account.getBalance() * account.getInterestRate()/100;
	System.out.println(interestDueForOverdrawnAccount.apply(account2));
	System.out.println(interestDueForOverdrawnAccount.apply(account8));
	
	
	System.out.println("1.2.4");
	Predicate<BankAccount> checkIfCurrent =
			account -> account.getAccountType().contains("current");
	System.out.println(checkIfCurrent.test(account1));
	System.out.println(checkIfCurrent.test(account6));
	
	
	System.out.println("1.2.5");
	Predicate<BankAccount> checkIfOverdrawn =
			account -> (account.getBalance() < 0) ? true : false;
	System.out.println(checkIfOverdrawn.test(account5));
	System.out.println(checkIfOverdrawn.test(account7));
	
	
	System.out.println("1.2.6");
	BinaryOperator<BankAccount> highestBalance =
			(acc1, acc2) -> (acc1.getBalance() > acc2.getBalance()) ? acc1: acc2;
	System.out.println(highestBalance.apply(account3, account4).getAccountHolder());
	
	
	System.out.println("1.2.7");
	Consumer<BankAccount> charge10dollarFee =
			(acct1) ->    acct1.setBalance(acct1.getBalance() - 10);
	charge10dollarFee.accept(account2);
	charge10dollarFee.accept(account6);
	System.out.println(account2.getBalance());
	System.out.println(account6.getBalance());
			
	
	
	
	}
}
