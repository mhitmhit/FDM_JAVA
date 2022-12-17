package com.fdmgroup.InheritanceInterfacesExercise;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toy toy1 = new Toy(0, 10, "spiderman", 9.99);
		Laptop laptop1 = new Laptop(3.6, 3, 500, "delllaptop", 1000);
		
		Snack snack1 = new Snack("snickers", 1.50, 1200, 490, 590);
		Snack snack2 = new Snack("banana", 0.50, 200, 90, 80);
		
		ReadyMeal meal1 = new ReadyMeal("meatballs", 12.99, "dinner", 5000);
		ReadyMeal meal2 = new ReadyMeal("pizza", 13.99, "lunch", 3000);
		
		Basket basket = new Basket();
		CalorieCounter counter = new CalorieCounter();
		
		basket.addItem(toy1);
		basket.addItem(laptop1);
		basket.addItem(snack1);
		basket.addItem(snack2);
		basket.addItem(meal1);
		basket.addItem(meal2);
		System.out.println("items in the basket initially: ");
		for (BasketItem item:basket.getAllItems()) {
			System.out.print(item.getName()+", ");
		}
		System.out.println("");
		System.out.println("items in the basket after removing pizza:");
		basket.removeItem(meal2);
		for (BasketItem item:basket.getAllItems()) {
			System.out.print(item.getName()+", ");
		}
		
		
	}

}
