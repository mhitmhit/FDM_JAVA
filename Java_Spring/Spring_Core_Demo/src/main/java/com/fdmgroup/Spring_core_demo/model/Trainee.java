package com.fdmgroup.Spring_core_demo.model;

public class Trainee {
	private long traineeId;
	private String name;
	private String emai;
	private String location;
	private String stream;
	private int cupsOfCoffee;
	
	public Trainee(long traineeId, String name, String emai, String location, String stream, int cupsOfCoffee) {
		super();
		this.traineeId = traineeId;
		this.name = name;
		this.emai = emai;
		this.location = location;
		this.stream = stream;
		this.cupsOfCoffee = cupsOfCoffee;
	}
	
	public Trainee() {
		super();
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

	public String getEmai() {
		return emai;
	}

	public void setEmai(String emai) {
		this.emai = emai;
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
		final int prime = 31;
		int result = 1;
		result = prime * result + cupsOfCoffee;
		result = prime * result + ((emai == null) ? 0 : emai.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((stream == null) ? 0 : stream.hashCode());
		result = prime * result + (int) (traineeId ^ (traineeId >>> 32));
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
		Trainee other = (Trainee) obj;
		if (cupsOfCoffee != other.cupsOfCoffee)
			return false;
		if (emai == null) {
			if (other.emai != null)
				return false;
		} else if (!emai.equals(other.emai))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stream == null) {
			if (other.stream != null)
				return false;
		} else if (!stream.equals(other.stream))
			return false;
		if (traineeId != other.traineeId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", name=" + name + ", emai=" + emai + ", location=" + location
				+ ", stream=" + stream + ", cupsOfCoffee=" + cupsOfCoffee + "]";
	}
	
	
	
}
