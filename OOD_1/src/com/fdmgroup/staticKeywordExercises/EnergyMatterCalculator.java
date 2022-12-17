package com.fdmgroup.staticKeywordExercises;

public class EnergyMatterCalculator {
	// variables
	public static final double SPEED_OF_LIGHT = 299792458;
	
	// getters and setters
	public static double getSpeedOfLight() {
		return SPEED_OF_LIGHT;
	}
	
	// methods
	public static double matterToEnergy(double matter) {
		double result = matter * SPEED_OF_LIGHT * SPEED_OF_LIGHT;
		return result;
	}
	public static double energyToMatter(double energy) {
		double result = energy / (SPEED_OF_LIGHT * SPEED_OF_LIGHT);
		return result;
	}
	
	
}// End of Class
