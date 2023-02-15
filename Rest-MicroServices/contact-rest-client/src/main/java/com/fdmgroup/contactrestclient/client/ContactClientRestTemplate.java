package com.fdmgroup.contactrestclient.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fdmgroup.contactrestclient.model.Contact;

@Service
public class ContactClientRestTemplate implements ContactClient {

	private WebClient webClient;

	@Autowired
	public ContactClientRestTemplate(WebClient webClient) {
		super();
		this.webClient = webClient;
	}

	@Override
	public List<Contact> retrieveContacts() {
		
		return webClient.get()
				.uri(builder -> builder.path("api/v1/contacts")
				.build())
				.retrieve() // retrieve- to consume now, exchange - to consume later 
				.bodyToFlux(Contact.class)
				.collectList()
				.block()
				;
	}

	@Override
	public Contact retrieveContact(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact createContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateContact(Contact contact) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteContact(long id) {
		// TODO Auto-generated method stub

	}

}
