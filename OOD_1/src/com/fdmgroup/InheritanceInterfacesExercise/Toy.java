package com.fdmgroup.InheritanceInterfacesExercise;

public class Toy implements BasketItem {
	// variables
	private int minAge;
	private int maxAge;
	private String name;
	private double price;

	// constructor
	public Toy(int minAge, int maxAge, String name, double price) {
		super();
		this.minAge = minAge;
		this.maxAge = maxAge;
		this.name = name;
		this.price = price;
	}
	
	// methods
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
		
	}
	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public void setPrice(double price) {
		this.price = price;	
	}
	
} // End of Class
