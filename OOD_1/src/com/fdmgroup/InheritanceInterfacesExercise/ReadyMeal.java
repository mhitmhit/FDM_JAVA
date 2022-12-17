package com.fdmgroup.InheritanceInterfacesExercise;

public class ReadyMeal implements BasketItem, FoodItem {
	// variables
	private String name;
	private double price;
	private int calories;
	private String cuisineType;
	
	// constructor
	public ReadyMeal(String name, double price, String cuisineType, int calories) {
		super();
		this.name = name;
		this.price = price;
		this.cuisineType = cuisineType;
		this.calories = calories;
	}

	// methods
	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		return calories;
	}
	@Override
	public void setCalories(int calories) {
		// TODO Auto-generated method stub
		this.calories = calories;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
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
