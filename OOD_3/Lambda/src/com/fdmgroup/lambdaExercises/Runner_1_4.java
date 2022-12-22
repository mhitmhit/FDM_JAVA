package com.fdmgroup.lambdaExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;



public class Runner_1_4 {

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
	    
	    System.out.println("origina array list: ---------------");
	    for (BankAccount b:bankAccountsList) {
			System.out.println(b.getBalance());
		}
	    
	    System.out.println("1.4.1---------------");
	    Comparator<BankAccount> sortByAccountBalance =
	    		//(acct1, acct2) -> {if (acct1.getBalance() > acct2.getBalance())return 1; else if (acct1.getBalance() < acct2.getBalance())return -1; else return 0;}
	    		(acct1, acct2) -> (acct1.getBalance() > acct2.getBalance()) ? 1:-1;
	    		
	    bankAccountsList.sort(sortByAccountBalance);
	    
	    for (BankAccount b:bankAccountsList) {
			System.out.println(b.getBalance());
		}
	    
	    System.out.println("1.4.2----------------");
	    Comparator<BankAccount> sortByAccountType =
	    		(acct1, acct2) -> (acct1.getAccountType().compareTo(acct2.getAccountType()));
	    		
	    bankAccountsList.sort(sortByAccountType);
	    
	    for (BankAccount b:bankAccountsList) {
			System.out.println(b.getAccountType());
		}
	    
	    System.out.println("1.4.4-----------------");
	    Comparator<BankAccount> sortByAccountTypeThenByBalance =
	    		sortByAccountBalance.thenComparing(sortByAccountType);
	   
	    bankAccountsList.sort(sortByAccountTypeThenByBalance);
	    
	    for (BankAccount b:bankAccountsList) {
			System.out.println(b.getAccountType());
		} 
	    		
	    
	    
	    
	    
	    
	    System.out.println("1.5.1 ------------------");
	    Map<Integer, Integer> accountsMap = new HashMap<>();
	    
	    
	    
	    System.out.println("1.5.2 ------------------"); 
	    BiFunction<Integer, Integer, Integer> mapingBiFunction =
	    		(oldValue, newValue) -> oldValue + newValue;
	    
	    
	    for (BankAccount b:bankAccountsList) {
	    	int key = b.getBankCode();
	    	
	    accountsMap.merge(key,1,mapingBiFunction);
		}
	    
	    for (Map.Entry<Integer, Integer> entry : accountsMap.entrySet()) {
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	    }
	    		
	    
	    
	    
	    System.out.println("1.5.3 ------------------");
	    Map<Integer, Double> acctMap = new HashMap<>();
	    
	    BiFunction<Double, Double, Double> mapFunction =
	    		(oldValue, newValue) -> oldValue+newValue;
	    		
	    for (BankAccount b:bankAccountsList) {
	    	int key = b.getBankCode();
	    	acctMap.merge(key, b.getBalance(), mapFunction);
	    	
	    }
	    
	    for (Map.Entry<Integer, Double> entry : acctMap.entrySet()) {
	    	System.out.println(entry.getKey()+" "+entry.getValue());
	    }
	    	
	}

}
