package com.fdmgroup.Spring_core_demo;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.fdmgroup.Spring_core_demo.model.Course;
import com.fdmgroup.Spring_core_demo.model.Trainee;
import com.fdmgroup.Spring_core_demo.repository.TraineeRepository;


// This class doubles as a Config class
@SpringBootApplication
public class SpringCoreDemoApplication implements CommandLineRunner {
//public class SpringCoreDemoApplication{
	private ApplicationContext ctx;
	
	// I want Spring to inject the ApplicationContext object into the instance of this class
	public SpringCoreDemoApplication(ApplicationContext ctx) {
		super();
		this.ctx = ctx;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

//	@Override
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
		
		// Spring handles creating the actual class under the hood
		TraineeRepository traineeRepo = ctx.getBean(TraineeRepository.class);

		traineeRepo.save(t1);
		traineeRepo.save(t2);
		traineeRepo.save(new Trainee(3, "Luis Tuapante", "luis.tuapante@fdmgroup.com", "NY", "JAVA", 0));
		traineeRepo.save(new Trainee(4, "Anthony Jimenez", "anthony.jimenez2@email.com", "NY", "JAVA", 0));

		Optional<Trainee> retrievedTrainee = traineeRepo.findByEmail("ben.hessel@fdmgroup.com");

		if (retrievedTrainee.isPresent()) {
			System.out.println(retrievedTrainee.get());
		}

		System.out.println("Trainees with FDM email: ");
		traineeRepo.findByEmailFragment("fdmgroup").forEach(t -> System.out.println(t));
		
		
	}

}
