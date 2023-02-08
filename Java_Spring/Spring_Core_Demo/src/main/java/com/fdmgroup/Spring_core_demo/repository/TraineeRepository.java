package com.fdmgroup.Spring_core_demo.repository;

import java.util.List;
import java.util.Optional;

import com.fdmgroup.Spring_core_demo.model.Trainee;


public interface TraineeRepository extends Repository<Trainee, Long>{
	// Derived Query
	// introducer = what we're doing
	// criteria = criteria we want to perform the action around
	Optional<Trainee> findByEmail(String email);
	List<Trainee> findByStream(String stream);
	boolean existsByEmail(String email);
	
//	@Query("SELECT t FROM Trainee t WHERE " + 
//			"lower(t.email) LIKE lower(concat('%', :emailFragment, '%'))")
//	List<Trainee> findByEmailFragment(@Param("emailFragment") String email);
}
