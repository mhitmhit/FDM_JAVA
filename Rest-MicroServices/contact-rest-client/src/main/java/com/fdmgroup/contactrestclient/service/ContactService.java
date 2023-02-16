package com.fdmgroup.contactrestclient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.contactrestclient.client.ContactClient;
import com.fdmgroup.contactrestclient.model.Contact;

@Service
public class ContactService {
	
	// No database as we will be using our
	// Contacts api from contact-rest-api project
	
	private ContactClient contactClient;

	@Autowired
	public ContactService(ContactClient contactClient) {
		super();
		this.contactClient = contactClient;
	}
	
	public List<Contact> retrieveContacts(){
		return contactClient.retrieveContacts();
	}
	
	public Contact retrieveContact(long id) {
		return contactClient.retrieveContact(id);
	}

	public void createContact(Contact contact) {
		contactClient.createContact(contact);
	}
	
}
