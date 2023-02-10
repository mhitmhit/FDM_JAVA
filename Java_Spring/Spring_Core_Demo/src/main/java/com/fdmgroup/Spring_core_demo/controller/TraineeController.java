package com.fdmgroup.Spring_core_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.fdmgroup.Spring_core_demo.model.Trainee;
import com.fdmgroup.Spring_core_demo.service.TraineeService;

@Controller
public class TraineeController {

	private TraineeService traineeService;

	public TraineeController(TraineeService traineeService) {
		super();
		this.traineeService = traineeService;
	}
	
	// 2 different mappings to be able to persist a trainee
	//  first mapping : get request that sends the user to the page with the form
	//  2nd mapping: post request that takes in the form inputs, binds them to trainee obj
	//		and sends that trainee object to our database for persistance.
	
	@GetMapping("/toCreateTrainee")
	public String goToCreateTraineePage() {
		return "add-trainee";
	}
	
	@PostMapping("/addTrainee")
	public String addATrainee(Trainee trainee) {
		// 1-call service method to persist a trainee
		traineeService.createTrainee(trainee);
		// 2-return a confirmation
		return "confirmation";
	}
	
}
