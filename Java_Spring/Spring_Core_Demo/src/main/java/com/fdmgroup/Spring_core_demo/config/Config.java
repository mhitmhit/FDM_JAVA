package com.fdmgroup.Spring_core_demo.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.fdmgroup.Spring_core_demo.model.Course;
import com.fdmgroup.Spring_core_demo.model.Trainee;



@Configuration
public class Config {
	// By default, Spring beans are singletons!
//	@Bean
//	@Scope("prototype")
//	public Trainee trainee() {
//		return new Trainee();
//	}
//	
//	// Spring will automatically instantiate an empty collection and pass it in
//	// if we don't create a bean of that type
//	@Bean
//	public Course course(List<Trainee> trainees) {
//		return new Course("N-22-JAV-21", trainees);
//	}
}
