package com.fdmgroup.Spring_core_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdmgroup.Spring_core_demo.model.Course;

public interface CourseRepository extends JpaRepository<Course, String>{

}
