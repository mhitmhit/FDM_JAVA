package streams_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount(12345678, 987654, "Mr J Smith", 		"savings", 			1.1, 	25362.91);
	    BankAccount account2 = new BankAccount(87654321, 234567, "Ms J Jones", 		"current/checking", 0.2, 	550);
	    BankAccount account3 = new BankAccount(74639572, 946284, "Dr T Williams", 	"savings", 			1.1, 	4763.32);
	    BankAccount account4 = new BankAccount(94715453, 987654, "Ms S Taylor", 	"savings", 			1.1, 	10598.01);
	    BankAccount account5 = new BankAccount(16254385, 234567, "Mr P Brown", 		"current/checking", 0.2, 	-195.74);
	    BankAccount account6 = new BankAccount(38776543, 946284, "Ms F Davies", 	"current/checking", 0.2, 	-503.47);
	    BankAccount account7 = new BankAccount(87609802, 987654, "Mr B Wilson", 	"savings", 			1.1, 	2.5);
	    BankAccount account8 = new BankAccount(56483769, 234567, "Dr E Evans", 		"current/checking", 0.2, 	-947.72);
	    
	    List<BankAccount> acctList = new ArrayList<BankAccount>(Arrays.asList(account1,account2, account3, account4, account5, account6, account7, account8));
	    
	    
	    System.out.println("------------------1.2.1");
	    List<BankAccount> currentAcctList = acctList.stream()
	    	.filter(account -> account.getAccountType().contains("current"))
	    	.collect(Collectors.toList());
	    for (BankAccount b : currentAcctList) {
	    	System.out.println(b.getAccountNumber());
	    }

	    System.out.println("------------------1.2.2");
	    List<BankAccount> overdrawnAcctList = acctList.stream()
		    	.filter(account -> account.getBalance() <0)
		    	.collect(Collectors.toList());
		    for (BankAccount b : overdrawnAcctList) {
		    	System.out.println(b.getAccountNumber());
		    }
	    
	    System.out.println("------------------1.2.3");
	    Comparator<Double> highBalaComparator =
				(bal1, bal2) -> (bal1 - bal2 > 0) ? 1 : -1;
				
	    Optional<Double> highestBalance = acctList.stream().map(account -> account.getBalance()).max(highBalaComparator);
	    System.out.println(highestBalance);
	    		
	    System.out.println("------------------1.2.4");
	    //Double averageBalance = acctList.stream().map(account -> account.getBalance()).reduce(0.00, (ans, bal) -> (ans + bal));
	    //System.out.println(averageBalance.doubleValue());
	    OptionalDouble averageBalance = acctList.stream().mapToDouble(account -> account.getBalance()).average();
	    System.out.println(averageBalance);
	    
	    System.out.println("------------------1.2.5");
	    OptionalDouble averageAcctsInCredit = acctList.stream().filter(acct -> acct.getBalance() < 0).mapToDouble(acct -> acct.getBalance()).average();
	    System.out.println(averageAcctsInCredit);
	    
	    System.out.println("------------------1.2.6");
	    Double sumOfOverdrafts = acctList.stream().filter(acct -> acct.getBalance() < 0).mapToDouble(acct -> acct.getBalance()).sum();
	    System.out.println(sumOfOverdrafts);
	    
	    
	    System.out.println("------------------1.2.7");
	    Double totalInterest = acctList.stream().filter(acct -> acct.getBalance() > 0).mapToDouble(acct -> acct.getBalance() *0.02).reduce(0.00, (tot, val)  -> tot + val);
	    System.out.println(totalInterest);
	    
	    
	    System.out.println("------------------1.3.1");
	    List<String> nameOverdrawn = acctList.stream().filter(acct -> acct.getBalance() < 0).map(acct -> acct.getAccountHolder()).collect(Collectors.toList());
	    System.out.println(nameOverdrawn);
	    
	    
	    System.out.println("------------------1.3.2");
	    System.out.println("before increase:");
	    System.out.println(acctList);
	    System.out.println("after increase:");
	    acctList.stream().filter(acct -> acct.getAccountType().contains("savings")).forEach(acct -> acct.setInterestRate(1.3));
	    System.out.println(acctList);
	    
	    
	    System.out.println("------------------1.3.4");
	    List<BankAccount> accountsFrom987654 = acctList.stream().filter(acct -> acct.getBankCode()==987654).collect(Collectors.toList());
	    System.out.println(accountsFrom987654);
	    
	    
	    System.out.println("------------------1.4.1");
	    BinaryOperator<BankAccount> accumulator1 =
	    		(acct1, acct2) -> acct1.getBalance() > acct2.getBalance() ? acct1 : acct2;
	    		
	    Optional<BankAccount> highestBalAccount = acctList.stream().reduce(accumulator1);
	    System.out.println(highestBalAccount.get().getAccountHolder());
	    
	    
	    
	}

}
