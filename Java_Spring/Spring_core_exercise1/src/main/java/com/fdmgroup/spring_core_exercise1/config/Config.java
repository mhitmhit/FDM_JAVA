package com.fdmgroup.spring_core_exercise1.config;

import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fdmgroup.spring_core_exercise1.interfaces.AccountRepository;
import com.fdmgroup.spring_core_exercise1.interfaces.UserRepository;
import com.fdmgroup.spring_core_exercise1.model.Account;
import com.fdmgroup.spring_core_exercise1.model.Teller;
import com.fdmgroup.spring_core_exercise1.model.User;
import com.fdmgroup.spring_core_exercise1.repositories.AccountMapRepository;
import com.fdmgroup.spring_core_exercise1.repositories.UserMapRepository;


@Configuration
public class Config {
	
//	@Bean
//	public User user() {
//		return new User();
//	}
	
//	@Bean
//	public Account account() {
//		return new Account();
//	}
	
//	@Bean
//	public AccountRepository accountRepository(Map<Long, Account> acctMap) {
//		return new AccountMapRepository(acctMap);
//	}
	
//	@Bean
//	public UserRepository userRepository(Map<Long, User> userRepo) {
//		return new UserMapRepository(userRepo);
//	}

//	@Bean
//	public Teller teller(AccountRepository accountRepository, UserRepository userRepository) {
//		return new Teller(accountRepository, userRepository);
//	}
	
	
}
