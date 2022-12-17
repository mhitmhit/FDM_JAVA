package com.fdmgroup.classesAndObjectsExercises;

public class Processor {
	
	// variables
	final private String MODEL;
	final private double SPEED;
	final private int NUMBER_OF_CORES;
	
	// constructor
	public Processor(String mODEL, double sPEED, int nUMBER_OF_CORES) {
		MODEL = mODEL;
		SPEED = sPEED;
		NUMBER_OF_CORES = nUMBER_OF_CORES;
	}

	// getters and setters
	public String getMODEL() {
		return MODEL;
	}

	public double getSPEED() {
		return SPEED;
	}

	public int getNUMBER_OF_CORES() {
		return NUMBER_OF_CORES;
	}
	
}
