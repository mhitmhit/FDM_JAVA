package inClassExample;

import java.util.Optional;
import java.util.function.Consumer;

public class driver {

	public static void main(String[] args) {
		
		Computer computer = new Computer("HP");
		
		
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
		
	}

}
