package com.fdmgroup.classesAndObjectsExercises;

public class Memory {
	// variables
	final private String MODEL;
	final private double CAPACITY;
	private double usedSpace;
	final private double SPEED;
	
	// constructor
	public Memory(String model, double capacity, double speed) {
		MODEL = model;
		CAPACITY = capacity;
		SPEED = speed;
	}
	
	// methods
	public void storeData(String data) {
		System.out.println("memory.storeData method. arg: " + data);
	}

	// getters and setters
	public double getUsedSpace() {
		return usedSpace;
	}

	public void setUsedSpace(double usedSpace) {
		this.usedSpace = usedSpace;
	}

	public String getMODEL() {
		return MODEL;
	}

	public double getCAPACITY() {
		return CAPACITY;
	}

	public double getSPEED() {
		return SPEED;
	}
	
	
}// End Memory Class
