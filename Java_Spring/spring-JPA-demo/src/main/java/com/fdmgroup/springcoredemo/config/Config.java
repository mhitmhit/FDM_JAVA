package com.fdmgroup.springcoredemo.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fdmgroup.springcoredemo.model.Course;
import com.fdmgroup.springcoredemo.model.Trainee;

@Configuration
public class Config {
	// By default, Spring beans are singletons!
	// Prototype beans are only managed by Spring before it gives you the reference
//	@Bean
//	@Scope("prototype")
//	public Trainee trainee() {
//		return new Trainee();
//	}

	// Spring will automatically instantiate an empty collection and pass it in
	// if we don't create a bean of that type
//	@Bean
//	public Course courseN22Jav21(List<Trainee> trainees) {
//		return new Course("N-22-JAV-21", trainees);
//	}

//	@Bean
//	public Academy nyAcademy(CourseRepository courseRepo, TraineeRepository traineeRepo) {
//		return new Academy(courseRepo, traineeRepo);
//	}

	// The default name of a bean = name of the method
//	@Bean(name="traineeMapRepo")
//	public TraineeRepository traineeRepo(Map<Long, Trainee> trainees) {
//		return new TraineeMapRepository(trainees);
//	}
//
//	@Bean
//	public CourseRepository courseRepo(Map<Long, Course> courses) {
//		return new CourseMapRepository(courses);
//	}
}
