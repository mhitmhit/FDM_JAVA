package com.fdmgroup.springcoredemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fdmgroup.springcoredemo.model.Course;

public interface CourseRepository extends JpaRepository<Course, String> {

}
