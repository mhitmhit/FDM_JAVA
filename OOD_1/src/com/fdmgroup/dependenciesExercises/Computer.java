package com.fdmgroup.dependenciesExercises;

public class Computer {
	// variables
	final private String MODEL;
	private HardDrive hardDrive;  // association example: Computer -> HardDrive
	private Memory memory;
	private final Processor processor;
	
	// getters and setters
	public HardDrive getHardDrive() {
		return hardDrive;
	}
	public void setHardDrive(HardDrive hardDrive) {
		this.hardDrive = hardDrive;
	}
	public Memory getMemory() {
		return memory;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	public String getMODEL() {
		return MODEL;
	}
	public Processor getProcessor() {
		return processor;
	}
	
	// Constructor
	public Computer(String mODEL, HardDrive hardDrive, Memory memory, Processor processor) {
		super();
		MODEL = mODEL;
		this.hardDrive = hardDrive;
		this.memory = memory;
		this.processor = processor;
	}
	
	// methods
	public void turnOn() {
		System.out.println("computer turned ON");
	}
	public void turnOff() {
		System.out.println("computer turned OFF");
	}
	public void getPower(PowerSource powerSource) {  // dependency Exmple. Computer ----> PowerSource
		double watts = powerSource.supplyPower();
		System.out.println("watts: "+watts);
	}
	
}// End of Computer Class
