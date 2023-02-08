package com.fdmgroup.spring_core_exercise1.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fdmgroup.spring_core_exercise1.interfaces.UserRepository;
import com.fdmgroup.spring_core_exercise1.model.User;

@Repository
public class UserMapRepository implements UserRepository {

	
	private Map<Long, User> userMapRepository;

	
	public UserMapRepository(Map<Long, User> userMapRepository) {
		super();
		this.userMapRepository = userMapRepository;
	}

	@Override
	public User save(User user) {
		userMapRepository.put(user.getUserId(), user);
		return null;
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
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
		result = prime * result + ((userMapRepository == null) ? 0 : userMapRepository.hashCode());
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
		UserMapRepository other = (UserMapRepository) obj;
		if (userMapRepository == null) {
			if (other.userMapRepository != null)
				return false;
		} else if (!userMapRepository.equals(other.userMapRepository))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return userMapRepository.toString();
	}


	

}
