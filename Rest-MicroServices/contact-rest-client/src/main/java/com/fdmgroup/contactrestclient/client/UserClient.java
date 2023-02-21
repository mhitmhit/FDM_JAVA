package com.fdmgroup.contactrestclient.client;

import java.util.List;

import com.fdmgroup.contactrestclient.model.User;

public interface UserClient {
	
	public List<User> retrieveUsers();
	User retrieveUser(long id);
	User createUser(User user);
	void updateUser(User user);
	void deleteUser(long id);

}
