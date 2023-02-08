package com.fdmgroup.springcoredemo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
public class Course {
	@Id
	private String courseCode;
	@OneToMany
	private List<Trainee> trainees;

	public Course() {
		this.trainees = new ArrayList<>();
	}

	@Autowired
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
	public int hashCode() {
		return Objects.hash(courseCode, trainees);
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
		return Objects.equals(courseCode, other.courseCode) && Objects.equals(trainees, other.trainees);
	}

	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", trainees=" + trainees + "]";
	}

}
