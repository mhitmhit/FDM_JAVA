package com.fdmgroup.Spring_core_demo.service;

import org.springframework.stereotype.Service;

import com.fdmgroup.Spring_core_demo.repository.CourseRepository;

@Service
public class CourseService {
	
	private CourseRepository courseRepo;
	
	public CourseService(CourseRepository courseRepo) {
		super();
		this.courseRepo = courseRepo;
	}
	
	
}
