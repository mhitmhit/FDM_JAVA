package com.fdmgroup.InheritanceInterfacesExercise;

public class Laptop implements BasketItem {
	
	// variables
	private double cpuSpeed;
	private double memory;
	private double hardDrive;
	private String name;
	private double price;
	
	// constructor
	public Laptop(double cpuSpeed, double memory, double hardDrive, String name, double price) {
		super();
		this.cpuSpeed = cpuSpeed;
		this.memory = memory;
		this.hardDrive = hardDrive;
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
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		this.price = price;
	}
	
	
	
	
}
