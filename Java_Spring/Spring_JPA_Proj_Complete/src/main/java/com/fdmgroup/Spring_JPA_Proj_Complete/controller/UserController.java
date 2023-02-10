package com.fdmgroup.Spring_JPA_Proj_Complete.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fdmgroup.Spring_JPA_Proj_Complete.model.User;
import com.fdmgroup.Spring_JPA_Proj_Complete.service.UserService;

@Controller
public class UserController {
	
	private UserService userService;
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	@GetMapping("/register")
	public String toRegister() {
		return "registration-page";
	}
	
	/*
	 * params to this method are passed in through the http request
	 * and are contained within the request body.
	 * 
	 * form input fields are brougt into the request parameters in key-value pairs
	 * 
	 * By requesting Spring bring in a user object to the method, we are askng spring
	 * to find similiarities in the request parameters and the user object fields and bind them 
	 * together
	 * 
	 */
	@PostMapping("/processRegistration")
	public String registerNewUser(User user, @RequestParam String passwordValidation) {
		/*
		 * send the user info to the service -- return boolean
		 */
		if(!user.getPassword().equals(passwordValidation)) {
			return "redirect:/register";
		} else if(!userService.createUser(user)) {
			return "redirect:/register";
		} else {
			return "redirect:/login";
		}
	}
	
	@GetMapping("/login")
	public String toLogin() {
		return "login-page";
	}
	
}
