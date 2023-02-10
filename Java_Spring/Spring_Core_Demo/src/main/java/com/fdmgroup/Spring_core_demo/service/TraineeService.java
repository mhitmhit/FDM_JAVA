package com.fdmgroup.Spring_core_demo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fdmgroup.Spring_core_demo.model.Trainee;
import com.fdmgroup.Spring_core_demo.repository.TraineeRepository;

@Service
public class TraineeService {

	private TraineeRepository traineesRepo;

	public TraineeService(TraineeRepository traineesRepo) {
		super();
		this.traineesRepo = traineesRepo;
	}
	
	public Optional<Trainee> createTrainee(Trainee trainee){
		Optional<Trainee> traineeOpt = Optional.empty();
		
		if (!	(traineesRepo.existsById(trainee.getTraineeId()) 
				|| traineesRepo.existsByEmail(trainee.getEmail())) 	) {
			traineeOpt = Optional.of( traineesRepo.save(trainee) );
		}
		return traineeOpt;
	}
	
}
