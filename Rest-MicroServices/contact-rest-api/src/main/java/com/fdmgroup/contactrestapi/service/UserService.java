package com.fdmgroup.contactrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fdmgroup.contactrestapi.model.User;
import com.fdmgroup.contactrestapi.repository.UserRepository;

@Service
public class UserService {
	
	UserRepository userRepo;

	public UserService(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}
	
	public List<User> retriveUsers() {
		return userRepo.findAll();
	}

	public User retrieveUserById(long id) {
		Optional<User> user = userRepo.findById(id);
		if (!user.isPresent()) {
			throw new UserNotFoundException("No user found with id: " + id);
		}
		return user.get();
	}

	
	public User retrieveUserByUsername(String username) {
		Optional<User> user = userRepo.findByUsername(username);
		if (!user.isPresent()) {
			throw new UserNotFoundException("No user found with username: " + username);
		}
		return user.get();
	}
	
	public User createUser(User user) {
		return userRepo.save(user);
	}
	
	public User updateUser(long id, User user) {
		Optional<User> conta = userRepo.findById(id);
		if (! conta.isPresent()) {
			throw new UserNotFoundException("No user found with id : " + id);
		}
		conta.get().setFirstName(user.getFirstName());
		conta.get().setLastName(user.getLastName());
		conta.get().setEmail(user.getEmail());
		conta.get().setUsername(user.getUsername());
		conta.get().setPassword(user.getPassword());
		return userRepo.save(conta.get());
	}
	
	public User deleteUser(long id) {
		Optional<User> conta = userRepo.findById(id);
		userRepo.deleteById(id);
		return conta.get();
	}

}
