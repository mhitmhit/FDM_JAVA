package comparators_walk_Through;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// User compare
		User user1 = new User();
		User user2 = new User();
		
		UserComparator userComparator = new UserComparator();
		
		System.out.println(user1.compareTo(user2));
		System.out.println(userComparator.compare(user1, user2));
		
		
		List<Car> carsList = new ArrayList<Car>();
		carsList.add(new Car(5000, "Renault"));
		carsList.add(new Car(2000, "Ford"));
		carsList.add(new Car(7000, "vauxhall"));
		carsList.add(new Car(1000, "Citroen"));
		
		// car comparator by Engine Size
		CarEngineSizeComparator carEngineComparator = new CarEngineSizeComparator();
		
		System.out.println("sort cars by engine size");
		
		Collections.sort(carsList, carEngineComparator);
		
		for (Car eachCar:carsList) {
			System.out.println(eachCar.getEngineSize());
		}
		
		
	
		// car comparator by make
		
		CarMakeComparator carMakeComparator = new CarMakeComparator();
		
		System.out.println("sort cars by make");
		
		Collections.sort(carsList, carMakeComparator);
		
		for (Car eachCar:carsList) {
			System.out.println(eachCar.getMake());
		}
		
	}

}
