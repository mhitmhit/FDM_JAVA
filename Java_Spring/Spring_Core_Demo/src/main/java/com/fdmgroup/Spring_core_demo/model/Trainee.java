package com.fdmgroup.Spring_core_demo.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
@Entity
public class Trainee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="TRAINEE_ID_GEN")
	@SequenceGenerator(name="TRAINEE_ID_GEN", sequenceName="TRAINEE_ID_SEQ")
	private long traineeId;
	private String name;
	private String email;
	private String location;
	private String stream;
	private int cupsOfCoffee;

	public Trainee() {
	}

	public Trainee(long traineeId, String name, String email, String location, String stream, int cupsOfCoffee) {
		super();
		this.traineeId = traineeId;
		this.name = name;
		this.email = email;
		this.location = location;
		this.stream = stream;
		this.cupsOfCoffee = cupsOfCoffee;
	}

	public long getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(long traineeId) {
		this.traineeId = traineeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public int getCupsOfCoffee() {
		return cupsOfCoffee;
	}

	public void setCupsOfCoffee(int cupsOfCoffee) {
		this.cupsOfCoffee = cupsOfCoffee;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cupsOfCoffee, email, location, name, stream, traineeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trainee other = (Trainee) obj;
		return cupsOfCoffee == other.cupsOfCoffee && Objects.equals(email, other.email)
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& Objects.equals(stream, other.stream) && traineeId == other.traineeId;
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", name=" + name + ", email=" + email + ", location=" + location
				+ ", stream=" + stream + ", cupsOfCoffee=" + cupsOfCoffee + "]";
	}

}
