package com.fdmgroup.dependenciesExercises;

public class PowerSource {
	// variables
	double watts;

	// constructor
	public PowerSource(double watts) {
		super();
		this.watts = watts;
	}
	
	// getters and setters
	public double getWatts() {
		return watts;
	}
	public void setWatts(double watts) {
		this.watts = watts;
	}

	// methods
	public double supplyPower() {
		return watts;
	}
}
