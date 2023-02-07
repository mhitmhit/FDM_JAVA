package com.fdmgroup.spring_core_exercise1;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fdmgroup.spring_core_exercise1.model.Account;
import com.fdmgroup.spring_core_exercise1.model.Teller;
import com.fdmgroup.spring_core_exercise1.model.User;

@SpringBootApplication
public class SpringCoreExercise1Application implements CommandLineRunner {

	private ApplicationContext ctx;
	
	// want spring to inject ctx into this class
	public SpringCoreExercise1Application(ApplicationContext ctx) {
		super();
		this.ctx = ctx;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCoreExercise1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("starting app");
		
		Account acct1 = ctx.getBean(Account.class);
		acct1.setAccountNumber(123456789);
		acct1.setBalance(new BigDecimal(5000));
		
		User user1 = ctx.getBean(User.class);
		user1.setUserId(1001);
		user1.setAccount(acct1);
		user1.setName("yas el");
		
		Teller t1 = ctx.getBean(Teller.class);
		t1.addUser(user1);
		t1.addAccount(acct1);
		
		System.out.println(t1);
		
	}

}
