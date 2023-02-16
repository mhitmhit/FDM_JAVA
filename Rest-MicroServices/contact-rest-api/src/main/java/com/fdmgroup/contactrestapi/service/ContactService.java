package com.fdmgroup.contactrestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.contactrestapi.model.Contact;
import com.fdmgroup.contactrestapi.repository.ContactRepository;

@Service
public class ContactService {

	private ContactRepository contactRepo;

	@Autowired
	public ContactService(ContactRepository contactRepo) {
		super();
		this.contactRepo = contactRepo;
	}

	public List<Contact> retriveContacts() {
		return contactRepo.findAll();
	}

	public Contact retrieveContact(long id) {
		Optional<Contact> contact = contactRepo.findById(id);
		if (!contact.isPresent()) {
			throw new ContactNotFoundException("No contact with id: " + id);
		}
		return contact.get();
	}

	public Contact createContact(Contact contact) {
		return contactRepo.save(contact);
	}
	
	public Contact updateContact(long id, Contact contact) {
		Optional<Contact> conta = contactRepo.findById(id);
		conta.get().setFirstName(contact.getFirstName());
		conta.get().setLastName(contact.getLastName());
		conta.get().setMiddleName(contact.getMiddleName());
		conta.get().setPhoneNumber(contact.getPhoneNumber());
		return contactRepo.save(conta.get());
	}
	
	public Contact deleteContact(long id) {
		Optional<Contact> conta = contactRepo.findById(id);
		contactRepo.deleteById(id);
		return conta.get();
	}
	


}
