package com.fdmgroup.Spring_core_demo.model;

import java.util.List;

public class Course {

	private String courseCode;
	private List<Trainee> trainees;
	
	
	public Course() {
		super();
	}

	public Course(String courseCode, List<Trainee> trainees) {
		super();
		this.courseCode = courseCode;
		this.trainees = trainees;
	}
	
	public void addTrainee(Trainee trainee) {
		this.trainees.add(trainee);
	}
	
	public void removeTrainee(Trainee trainee) {
		this.trainees.remove(trainee);
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
		return "Course [courseCode=" + courseCode + ", trainees=" + trainees + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseCode == null) ? 0 : courseCode.hashCode());
		result = prime * result + ((trainees == null) ? 0 : trainees.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (courseCode == null) {
			if (other.courseCode != null)
				return false;
		} else if (!courseCode.equals(other.courseCode))
			return false;
		if (trainees == null) {
			if (other.trainees != null)
				return false;
		} else if (!trainees.equals(other.trainees))
			return false;
		return true;
	}
	
	
}
