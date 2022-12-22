package inClassExample;

import java.util.Optional;

public class Computer {
	
	private String model;
	private Motherboard motherboard;

	public Computer(String model) {
		super();
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	// if motherboard is null, then optional will return a null wrapped in a Motherboard Object.
	public Optional<Motherboard> getMotherboard() {
		return Optional.ofNullable(motherboard);
	}
	
	public void setMotherboard(Motherboard motherboard) {
		this.motherboard = motherboard;
	}
	
	@Override
	public String toString() {
		return "Computer [model=" + model + ", motherboard=" + motherboard + "]";
	}
	
	
	
}
