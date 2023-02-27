package com.fdmgroup.contactrestapi.controller;

import java.net.URI;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fdmgroup.contactrestapi.model.Contact;

//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fdmgroup.contactrestapi.service.ContactService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/api/v1/contacts")
public class ContactController {

	private ContactService contactService;

	@Autowired
	public ContactController(ContactService contactService) {
		super();
		this.contactService = contactService;
	}

	@GetMapping()
	public List<Contact> getContacts() {
		return contactService.retriveContacts();
	}

	@GetMapping("/{id}")
	public Contact getContact(@PathVariable long id) {
		return contactService.retrieveContact(id);

	}

	@Operation(summary="create a contact resourse from user input")
	@ApiResponses(value= {
			@ApiResponse(responseCode="201", description="Contact resource created",
					headers= {@Header(name="location", description="URI to access the created resourse")},
					content= {@Content(mediaType=MediaType.APPLICATION_JSON_VALUE)}
						)
	})
	@PostMapping
	public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
		System.out.println("post mapping called !!!!!");
		Contact createdContact = contactService.createContact(contact);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(contact.getId())
				.toUri();

		return ResponseEntity.created(location).build();
		// return ResponseEntity.created(location).body(createdContact);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Contact> updateContact(@PathVariable long id, @RequestBody Contact contact) {
		Contact updatedContact = contactService.updateContact(id, contact);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(contact.getId())
				.toUri();
		return ResponseEntity.created(location).body(updatedContact);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Contact> deleteContact(@PathVariable long id) {
		System.out.println("delete mapping called !!!!!");
		Contact deletedContact = contactService.deleteContact(id);

		return ResponseEntity.created(null).body(deletedContact);
	}

}
