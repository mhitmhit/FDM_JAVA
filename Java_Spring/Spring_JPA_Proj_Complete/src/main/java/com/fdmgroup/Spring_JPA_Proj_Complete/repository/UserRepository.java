package com.fdmgroup.Spring_JPA_Proj_Complete.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdmgroup.Spring_JPA_Proj_Complete.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	boolean existsByUsernameOrEmail(String username, String email);
	Optional<User> findByUsername(String username);
	Optional<User> findByUsernameAndPassword(String username, String password);
	
}
