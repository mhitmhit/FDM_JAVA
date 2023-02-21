package com.fdmgroup.messageui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageControler {

//	private MessageService messageService;
//	
//	@Autowired
//	public MessageController(MessageService messageService) {
//		super();
//		this.messageService = messageService;
//	}
//	
//	@GetMapping("/")
//	publc String goToIndex(Model model) {
//		String message = messageService.getMessage();
//		model.addAttribute("message", message);
//		return "index";
//	}
}
