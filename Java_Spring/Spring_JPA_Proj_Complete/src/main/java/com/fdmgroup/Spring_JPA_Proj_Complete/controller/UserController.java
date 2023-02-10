package com.fdmgroup.Spring_JPA_Proj_Complete.controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fdmgroup.Spring_JPA_Proj_Complete.model.User;
import com.fdmgroup.Spring_JPA_Proj_Complete.service.MediaService;
import com.fdmgroup.Spring_JPA_Proj_Complete.service.UserService;

@Controller
public class UserController {
	
	private UserService userService;
	private MediaService mediaService;
	
	public UserController(UserService userService, MediaService mediaSer) {
		super();
		this.userService = userService;
		this.mediaService = mediaSer;
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
	public String registerNewUser(User user, @RequestParam String passwordValidation, RedirectAttributes redirectAttribute) {
		/*
		 * send the user info to the service -- return boolean
		 */
		if(!user.getPassword().equals(passwordValidation)) {
				redirectAttribute.addFlashAttribute("message", "the password you entered did not match");
				return "redirect:/register";
		} else if(!userService.createUser(user)) {
			redirectAttribute.addFlashAttribute("message", "the username or email are already in system");
				return "redirect:/register";
		} else {
			return "redirect:/login";
		}
	}
	
	@GetMapping("/login")
	public String toLogin() {
		return "login-page";
	}
	
	@PostMapping("/processLogin")
	public String loginUser(User user, HttpSession session) {
		Optional<User> userOpt = userService.loginUser(user);
		if(userOpt.isPresent()) {
			session.setAttribute("username", user.getUsername());
			return "redirect:/home";
		}else {
			return "redirect:/login";
		}
	}
	
	@GetMapping("/home")
	public String toHome(HttpSession session, Model model) {
		if(session.getAttribute("username") !=null) {
			model.addAttribute("mediaList", mediaService.getAllMedia());
			return "home";
		} else {
			return "redirect:/login";
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}
	
	@GetMapping("/update")
	public String toUpdateUser(HttpSession session, Model model) {
		if(session.getAttribute("username") != null) {
			Optional<User> userOpt =userService.getUser((String)session.getAttribute("username"));
			if(userOpt.isPresent()) {
				model.addAttribute("user", userOpt.get());
				return "update-user-page";
			}	
		}
		return "redirect:/login";
	}
	
}
