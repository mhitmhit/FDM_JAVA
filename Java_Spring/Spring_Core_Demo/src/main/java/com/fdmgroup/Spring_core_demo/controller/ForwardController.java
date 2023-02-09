package com.fdmgroup.Spring_core_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ForwardController {

	@GetMapping("/forwardExample")
	public String forwardRequest() {
		System.out.println("this method forwards to another method...");
		return "forward:/processRequest";
	}
	
	@GetMapping("/processRequest")
	public String processForwardedRequest() {
		System.out.println("...this method is taking a forwarded request");
		return "index";
	}
	
	@GetMapping("/toGoogle")
	public String redirectToGoogle() {
		return "redirect:https://www.google.com";
	}
	
//	@GetMapping("/googleSearch")
//	public String redirectToGoogleSearch(@RequestParam String searchTerm) {
//		return "redirect:https://www.google.com/search?q=" + searchTerm;
//	}
	
	@GetMapping("/googleSearch")
	public String redirectToGoogleSearch(@RequestParam("searchTerm") String query) {
		return "redirect:https://www.google.com/search?q=" + query;
	}
	
	
	
}
