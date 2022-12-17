package Playground;

public abstract class Animal {
	
	protected String type;

	public Animal(String type) {
		this.type = type;
	}

	public abstract void sleep();

	public void move() {
		System.out.println("this animal is moving.");
	}
}
