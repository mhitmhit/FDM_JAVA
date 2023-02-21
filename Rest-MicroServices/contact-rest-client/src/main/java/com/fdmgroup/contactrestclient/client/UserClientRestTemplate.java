package com.fdmgroup.contactrestclient.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fdmgroup.contactrestclient.model.User;

@Service
public class UserClientRestTemplate implements UserClient {

	private WebClient webClient;
	
	@Autowired
	public UserClientRestTemplate(WebClient webClient) {
		super();
		this.webClient=webClient;
	}
	@Override
	public List<User> retrieveUsers() {
		return webClient.get()
				.uri(  builder -> builder.path("api/v1/users").build()  )
				.retrieve()
				.bodyToFlux(User.class)
				.collectList()
				.block()
				;
	}

	@Override
	public User retrieveUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUser(User user) {
		return webClient.post()
				.uri( builder->builder.path("api/v1/users").build() )
				.bodyValue(user)
				.retrieve()
				.bodyToMono(User.class)
				.block()
				;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		
	}

}
