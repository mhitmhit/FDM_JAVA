package com.fdmgroup.Spring_core_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fdmgroup.Spring_core_demo.service.CourseService;

@Controller
public class CourseController {
	
	private CourseService courseSer;
	
	public CourseController(CourseService courseSer) {
		super();
		this.courseSer = courseSer;
	}
	
	//@RequestMapping(value="/courses", method=RequestMethod.GET)
	@GetMapping("/courses")
	public String toCourseList() {
		return "course-list";
	}
	
	
}
