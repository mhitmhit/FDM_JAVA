package com.fdmgroup.spring_core_exercise1.model;

import java.math.BigDecimal;

import com.fdmgroup.spring_core_exercise1.interfaces.AccountRepository;
import com.fdmgroup.spring_core_exercise1.interfaces.UserRepository;
import com.fdmgroup.spring_core_exercise1.repositories.AccountMapRepository;
import com.fdmgroup.spring_core_exercise1.repositories.UserMapRepository;

public class Teller {

	private AccountRepository accountRepo;
	private UserRepository userRepo;

	public Teller(AccountRepository accountMapRepo, UserRepository userMapRepo) {
		super();
		this.accountRepo = accountMapRepo;
		this.userRepo = userMapRepo;
	}
	
	public Teller() {
		super();
	}

	public User addUser(User user){
		userRepo.save(user);
		return null;
	}
	
	public Account addAccount(Account account) {
		accountRepo.save(account);
		return account;
	}
	
	public User updateUser(User user) {
		return user;
	}
	
	public Account depositIntoAccount(Account account, BigDecimal ammount) {
		return account;
	}
	
	public Account WithdrawFromAccount(Account account, BigDecimal ammount) {
		return account;
	}
	
	public void deleteUser(User user) {
		
	}
	
	public void deleteAccount(Account account) {
		
	}
	
	public Account findAccount(Long accountNumber) {
		return new Account();
	}
	
	public User findUser(Long userId) {
		return new User();
	}

	@Override
	public String toString() {
		return "Teller [accountRepo=" + accountRepo + ", userRepo=" + userRepo + "]";
	}
	
	
}
