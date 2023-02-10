package com.fdmgroup.Spring_JPA_Proj_Complete.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fdmgroup.Spring_JPA_Proj_Complete.model.User;
import com.fdmgroup.Spring_JPA_Proj_Complete.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepo;

	public UserService(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}
	
	public boolean createUser(User user) {
		if(userRepo.existsByUsernameOrEmail(user.getUsername(), user.getEmail())) {
			return false;
		} else {
			userRepo.save(user);
			return true;
		}
	}
	
	public Optional<User> loginUser(User user){
		return userRepo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
	}
	
	public Optional<User> getUser(String username){
		return userRepo.findByUsername(username);
	}
}
