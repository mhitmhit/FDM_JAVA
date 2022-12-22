package inClassExample;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class driver {

	public static void main(String[] args) {
		
		Computer computer = new Computer("HP");
		ComputerStore computerStore = new ComputerStore();
		
		//Motherboard  motherBoard1 = new Motherboard("Asus MB");
		//MemoryChip memeoryChip1 = new MemoryChip("DDR");
		
		//computer.setMotherboard(motherBoard1);
		//motherBoard1.setMemoryChip(memeoryChip1);
		
		
		
		
		
		
		Optional<Motherboard> optionalMotherboard = computer.getMotherboard();
	
		if (optionalMotherboard.isPresent()) {
			Motherboard motherboard = optionalMotherboard.get();
		}
		
		Consumer<Motherboard> printMotherboardModel =
				motherboard -> System.out.println(motherboard.getModel());
				
		computer.getMotherboard().ifPresent(printMotherboardModel);
		
		// nested if Present
		computer.getMotherboard()
			.ifPresent( motherboard -> motherboard.getMemoryChip()
			.ifPresent( memoryChip -> memoryChip.accessData()
					  ));
		
		
		

		
		
		
		
		
		// Computer Store
		
		int numberOfComputers = computerStore.getComputers()
				.orElse(new ArrayList<Computer>())
				.size();
		
		System.out.println(numberOfComputers);
		
		
		
		
		
		
		
		Supplier<MissingMotherBoardException> missingMotherboard =
				() -> new MissingMotherBoardException("Missing mother board exception message");
		
		Supplier<MissingMemoryException> missingMemory =
				() -> new MissingMemoryException("Missing memory exception message");
				
		try {
			computer.getMotherboard()
				.orElseThrow(missingMotherboard)
				.getMemoryChip()
				.orElseThrow(missingMemory)
				.accessData();
		} catch (MissingMemoryException e) {
			System.out.println("memory missing");
		} catch (MissingMotherBoardException e) {
			System.out.println("mother board missing");
		}
		
		
		
		
		
	} // End of Main
}
