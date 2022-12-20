package Walkthrough;

public class Apple implements Produce {

	String species;

	public Apple(String species) {
		super();
		this.species = species;
	}
	
	public String getSpecies() {
		return species;
	}
}