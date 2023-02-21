package com.fdmgroup.contactrestclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.fdmgroup.contactrestclient.model.Contact;
import com.fdmgroup.contactrestclient.service.ContactService;

@Controller
public class ContactController {
	
	private ContactService contactService;
	
	@Autowired
	public ContactController(ContactService contactService) {
		super();
		this.contactService=contactService;
	}
	
	@GetMapping("/")
	public String getContacts(Model model){
		List<Contact> contacts =contactService.retrieveContacts();
		model.addAttribute("contacts", contacts);
		return "index";
	}
	
	@GetMapping("/view/{id}")
	public String getContact(Model model, @PathVariable String id) {
		Contact retrievedContact = contactService.retrieveContact(Long.valueOf(id));
		model.addAttribute("contact", retrievedContact);
		return "contact-details";
	}
	
	@GetMapping("/update/{id}")
	public String updateContact(Model model, @PathVariable String id) {
		Contact retrievedContact = contactService.retrieveContact(Long.valueOf(id));
		model.addAttribute("contact", retrievedContact);
		return "update-contact";
	}
	
	@PostMapping("/updateContact")
	public String updateContact(Contact contact) {
		contactService.updateContact(contact);
		return "redirect:/";
	}
	
	
	@GetMapping("/createContact")
	public String goToCreateContact(Model model) {
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		return "create-contact";
	}
	
	@PostMapping("/createContact")
	public String createContact(Contact contact) {
		contactService.createContact(contact);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteContact(@PathVariable String id) {
		contactService.deleteContact(Long.valueOf(id));
		return "redirect:/";
	}
	
}
