package com.fdmgroup.Spring_core_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fdmgroup.Spring_core_demo.model.Course;
import com.fdmgroup.Spring_core_demo.model.Trainee;


// This class doubles as a Config class
@SpringBootApplication
public class SpringCoreDemoApplication implements CommandLineRunner {
	
	private ApplicationContext ctx;
	
	// I want Spring to inject the ApplicationContext object into the instance of this class
	public SpringCoreDemoApplication(ApplicationContext ctx) {
		super();
		this.ctx = ctx;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-------------- Spring Core Demo");
		Trainee t1 = ctx.getBean(Trainee.class);
		
		t1.setTraineeId(1);
		t1.setName("Ben Hessel");
		t1.setEmail("ben.hessel@fdmgroup.com");
		t1.setCupsOfCoffee(2);
		t1.setStream("JAVA");
		t1.setLocation("Boston");
		
		System.out.println(t1);
		
		Course course = ctx.getBean(Course.class);
		course.addTrainee(t1);
		System.out.println(course);
		
		Trainee t2 = ctx.getBean(Trainee.class);
		t2.setTraineeId(2);
		t2.setName("Carol Dsouza");
		t2.setEmail("carol.dsouza@fdmgroup.com");
		t2.setCupsOfCoffee(0);
		t2.setLocation("Toronto");
		t2.setStream("JAVA");
		
		System.out.println(t2);
		System.out.println(t1);
		System.out.println(t1 == t2);
		
	}

}
