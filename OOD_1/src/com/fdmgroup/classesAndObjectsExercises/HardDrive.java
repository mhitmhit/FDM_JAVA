package com.fdmgroup.classesAndObjectsExercises;

public class HardDrive {
	// variables
	final private String MODEL;
	final private double CAPACITY;
	private double usedSpace;
	
	// constructor
	public HardDrive(String model, double capacity){
		MODEL = model;
		CAPACITY = capacity;
	}
	
	// methods
	public String readData(String file) {
		String returnString = "data from + " + file;
		return returnString;	
	}
	
	public void writeData(String data, String file) {
		System.out.println("method hardDrive.wrideData. parameters: " + data + file);
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
	
	
	
	
	
}// End of Class HardDriv
