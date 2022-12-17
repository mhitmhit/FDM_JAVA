package com.fdmgroup.dependenciesExercises;

import java.util.ArrayList;

public class ComputerStore {
	// variables
	private String name;
	private ArrayList<Computer> computers = new ArrayList<Computer>(); //Aggregation example  ComputerStore 0------- Computer
	
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// constructor
	public ComputerStore(String name) {
		super();
		this.name = name;
		//this.computers = computers;
	}
	
	// methods
	public void addComputer(Computer computer) {
		computers.add(computer);
	}
	public ArrayList<Computer> getAllComputers(){
		return computers;
	}
	
}// End of Class
