package com.fdmgroup.contactrestclient.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fdmgroup.contactrestclient.model.Contact;

import reactor.core.publisher.Mono;

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
		return webClient.get()
				.uri( builder -> builder.path("api/v1/contacts/{id}").build(id) )
				.retrieve()
				.onStatus(status -> status.value() == HttpStatus.NOT_FOUND.value(),
														response -> Mono.error(new ContactNotFoundException("No contact found with id:" + id)))
				.bodyToMono(Contact.class)
				.block()
				;
	}

	@Override
	public Contact createContact(Contact contact) {
		return webClient.post()
				.uri( builder -> builder.path("/api/v1/contacts").build() )
				.bodyValue(contact)
				.retrieve()
				.bodyToMono(Contact.class)
				.block()
				;
	}

	@Override
	public void updateContact(Contact contact) {
		webClient.put()
			.uri( builder -> builder.path("/api/v1/contacts/{id}").build(contact.getId()) )
			.bodyValue(contact)
			.retrieve()
			.bodyToMono(Contact.class)
			.log()
			.block()
			;
	}

	@Override
	public void deleteContact(long id) {
		// TODO Auto-generated method stub

	}

}
