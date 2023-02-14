package com.fdmgroup.contactrestclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
	
	@GetMapping
	public String getContacts(Model model){
		//List<Contact> contacts =contactService.retrieveContacts();
		//model.addAttribute("contacts", contacts);
		return "index";
	}
}
