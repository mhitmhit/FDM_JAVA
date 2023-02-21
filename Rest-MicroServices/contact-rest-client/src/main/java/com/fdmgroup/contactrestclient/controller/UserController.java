package com.fdmgroup.contactrestclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.contactrestclient.model.User;
import com.fdmgroup.contactrestclient.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping
	public String getUsers(Model model) {
		List<User> users = userService.retrieveUsers();
		model.addAttribute("users", users);
		return "user-details";
	}
	
	@GetMapping("/userRegistration")
	public String toUserRegistrationPage() {
		return "create-user";
	}
	
	@PostMapping("/registerUser")
	public String registerUser(User user) {
		userService.registerUser(user);
		return "redirect:/users";
	}
	
	@PostMapping("/processLogin")
	public String loggingInTheUser() {
		
		
		return "login-success";
	}
	
}
