package com.fdmgroup.spring_core_exercise1.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fdmgroup.spring_core_exercise1.interfaces.AccountRepository;
import com.fdmgroup.spring_core_exercise1.model.Account;

@Repository
public class AccountMapRepository implements AccountRepository {

	private Map<Long, Account> accountMapRepository;

	public AccountMapRepository(Map<Long, Account> accountMapRepository) {
		super();
		this.accountMapRepository = accountMapRepository;
	}

	@Override
	public Account save(Account t) {
		accountMapRepository.put(t.getAccountNumber(), t);
		return null;
	}

	@Override
	public Account findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountMapRepository == null) ? 0 : accountMapRepository.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountMapRepository other = (AccountMapRepository) obj;
		if (accountMapRepository == null) {
			if (other.accountMapRepository != null)
				return false;
		} else if (!accountMapRepository.equals(other.accountMapRepository))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return accountMapRepository.toString();
	}

}
