package com.fdmgroup.Spring_core_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fdmgroup.Spring_core_demo.model.Course;
import com.fdmgroup.Spring_core_demo.model.Trainee;

@SpringBootApplication
public class SpringCoreDemoApplication implements CommandLineRunner {

	private ApplicationContext ctx;
	
	// want spring to inject ctx into this class
	public SpringCoreDemoApplication(ApplicationContext ctx) {
		super();
		this.ctx = ctx;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("my first spring boot application");
		
		Trainee t1 = ctx.getBean(Trainee.class);
		
		t1.setName("ben");
		t1.setEmai("ben@gmail.com");
		t1.setCupsOfCoffee(2);
		t1.setLocation("boston");
		t1.setStream("JAVA");
		t1.setTraineeId(1);
		
		System.out.println(t1);
		
		Course course = ctx.getBean(Course.class);
		course.addTrainee(t1);
		
		System.out.println(course);
		
		
	}

}
