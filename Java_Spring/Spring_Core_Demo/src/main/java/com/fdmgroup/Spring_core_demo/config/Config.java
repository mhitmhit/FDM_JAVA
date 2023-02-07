package com.fdmgroup.Spring_core_demo.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fdmgroup.Spring_core_demo.model.Course;
import com.fdmgroup.Spring_core_demo.model.Trainee;

@Configuration
public class Config {

	@Bean
	public Trainee trainee() {
		return new Trainee();
	}
	
	@Bean
	public Course course(List<Trainee> trainees) {
		return new Course("N-22-jav-21", trainees);
	}
}
