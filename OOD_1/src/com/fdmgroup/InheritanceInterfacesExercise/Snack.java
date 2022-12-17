package com.fdmgroup.InheritanceInterfacesExercise;

public class Snack implements FoodItem, BasketItem {
	// variables
	private String name;
	private double price;
	private int calories;
	private int fatContent;
	private int sugarContent;
	
	public Snack(String name, double price, int calories, int fatContent, int sugarContent) {
		super();
		this.name = name;
		this.price = price;
		this.calories = calories;
		this.fatContent = fatContent;
		this.sugarContent = sugarContent;
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
	
	
}
