package com.fdmgroup.contactrestclient.client;

import java.util.List;

import com.fdmgroup.contactrestclient.model.Contact;

public interface ContactClient {
	
	public List<Contact> retrieveContacts();
	Contact retrieveContact(long id);
	Contact createContact(Contact contact);
	void updateContact(Contact contact);
	void deleteContact(long id);
}
