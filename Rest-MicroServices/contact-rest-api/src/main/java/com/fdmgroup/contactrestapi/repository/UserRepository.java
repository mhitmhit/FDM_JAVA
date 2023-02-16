package com.fdmgroup.contactrestapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.data.jpa.repository.JpaRepository;

import com.fdmgroup.contactrestapi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public Optional<User> findByUsername(String username);
	
}
