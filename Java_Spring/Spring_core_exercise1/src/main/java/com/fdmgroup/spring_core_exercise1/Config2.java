package com.fdmgroup.spring_core_exercise1;



import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.fdmgroup.spring_core_exercise1.interfaces.AccountRepository;
import com.fdmgroup.spring_core_exercise1.interfaces.UserRepository;
import com.fdmgroup.spring_core_exercise1.model.Account;
import com.fdmgroup.spring_core_exercise1.model.Teller;
import com.fdmgroup.spring_core_exercise1.model.User;
import com.fdmgroup.spring_core_exercise1.repositories.AccountMapRepository;
import com.fdmgroup.spring_core_exercise1.repositories.UserMapRepository;

public class Config2 {


//	public User user() {
//		return new User();
//	}
//	
//
//	public Account account() {
//		return new Account();
//	}
//	
//
//	public UserRepository userRepo(Map<Long,User> userRepo) {
//		return new UserMapRepository(userRepo);
//	}
//	
//
//	public AccountRepository accountRepo(Map<Long,Account> accountRepo) {
//		return new AccountMapRepository(accountRepo);
//	}
//	
//
//	public Teller teller (UserRepository userRepo, AccountRepository accountRepo) {
//		return new Teller(accountRepo, userRepo);
//	}
}
