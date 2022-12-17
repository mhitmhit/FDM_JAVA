package com.fdmgroup.classesAndObjectsExercises;

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
		
		System.out.println("Hard Drive Object: ");
		System.out.println("Model       Capacity      UsedSpace");
		System.out.println(drive1.getMODEL()+"       " + drive1.getCAPACITY() +"           "+ drive1.getUsedSpace() );
		System.out.println(drive2.getMODEL()+"          " + drive2.getCAPACITY() +"           "+ drive2.getUsedSpace() );
		System.out.println("");
		System.out.println("Processor Object: ");
		System.out.println("Model           Speed       Number of Cores");
		System.out.println(processor1.getMODEL()+"        "+processor1.getSPEED()+ "          "+processor1.getNUMBER_OF_CORES());
		System.out.println(processor2.getMODEL()+"     "+processor2.getSPEED()+ "           "+processor2.getNUMBER_OF_CORES());
		System.out.println("");
		System.out.println("Memory Object:");
		System.out.println("Model     Capacity    UsedSpaced     Speed");
		System.out.println(memory1.getMODEL()+ "    "+ memory1.getCAPACITY()+ "         " + memory1.getUsedSpace()+ "         "+ memory1.getSPEED());
		System.out.println(memory2.getMODEL()+ "     "+ memory2.getCAPACITY()+ "         " + memory2.getUsedSpace()+ "         "+ memory2.getSPEED());
		drive1.setUsedSpace(50);
		System.out.println(drive1.getUsedSpace());
		
		
		
		
		
	}// End of Main
}// End of Runner
