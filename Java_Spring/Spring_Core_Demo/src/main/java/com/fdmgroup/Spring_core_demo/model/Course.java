package com.fdmgroup.Spring_core_demo.model;

import java.util.List;

public class Course {

	private String courseCode;
	private List<Trainee> trainees;
	
	public Course(String courseCode, List<Trainee> trainees) {
		super();
		this.courseCode = courseCode;
		this.trainees = trainees;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public List<Trainee> getTrainees() {
		return trainees;
	}

	public void setTrainees(List<Trainee> trainees) {
		this.trainees = trainees;
	}

	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + "]";
	}
	
	
}
