package com.fdmgroup.contactrestclient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.contactrestclient.client.UserClient;
import com.fdmgroup.contactrestclient.model.User;

@Service
public class UserService {

	private UserClient userClient;

	@Autowired
	public UserService(UserClient userClient) {
		super();
		this.userClient = userClient;
	}

	public List<User> retrieveUsers() {
		return userClient.retrieveUsers();
	}

	public void registerUser(User user) {
		userClient.createUser(user);
		
	}
	
	
}
