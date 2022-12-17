package com.fdmgroup.dependenciesExercises;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HardDrive drive1 = new HardDrive("Seagate", 2);
		HardDrive drive2 = new HardDrive("Dell", 3);
		drive2.setUsedSpace(500);
		
		Processor processor1 = new Processor("Intel Xeon", 2.93, 6);
		Processor processor2 = new Processor("Intel Celeron", 2.9, 2);
		
		Memory memory1 = new Memory("Kingston", 4, 1600);
		Memory memory2 = new Memory("Corsair", 8, 1333);
		
		Computer computer1 = new Computer("Dell", drive1, memory1, processor1);
		Computer computer2 = new Computer("Lenovo", drive2, memory2, processor2);
		
		PowerSource powerSource1 = new PowerSource(1000);
		
		computer1.getPower(powerSource1);
		
		ComputerStore store1 = new ComputerStore("store1");
		store1.addComputer(computer1);
		store1.addComputer(computer2);
		
		ArrayList<Computer> computerArray = store1.getAllComputers();
		for (Computer e:computerArray) {
			System.out.println(e.getMODEL());	
		}
		
		
		
	}// End Main
}//End Runner Classs
