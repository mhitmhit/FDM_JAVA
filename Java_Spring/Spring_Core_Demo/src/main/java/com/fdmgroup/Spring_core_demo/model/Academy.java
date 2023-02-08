package com.fdmgroup.Spring_core_demo.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fdmgroup.Spring_core_demo.repository.CourseRepository;
import com.fdmgroup.Spring_core_demo.repository.TraineeRepository;



@Component(value = "fdmAcademy")
@Scope("prototype")
public class Academy {
	private CourseRepository courseRepo;
	private TraineeRepository traineeRepo;

	public Academy(CourseRepository courseRepo, @Qualifier("traineeMapRepository") TraineeRepository traineeRepo) {
		super();
		this.courseRepo = courseRepo;
		this.traineeRepo = traineeRepo;
	}
	
	// TODO: Add methods

}
