package InClass_Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person("test", "tester", 30);
		Person person2 = new Person("yassine", "elk", 21);
		Person person3 = new Person("juan", "arango", 39);
		Person person4 = new Person("nelson", "mand", 76);
		Person person5 = new Person("nico", "tesl", 50);
		
		List<Person> people = new ArrayList<Person>(Arrays.asList(person1, person2, person3, person4, person5));
		
		// create a stream
		people.stream();
		// Intermediate operations ------------------------------------
		Predicate<Person> ageOver30 = 
				person -> person.getAge() > 30;
		
		// use stream.filter with Predicate
		people.stream().filter(ageOver30);
		
		Function<Person, String> mapper1 =
				person -> person.getFirstName() + " " + person.getLastName();
		
		// use stream.map with Function
		people.stream().map(mapper1);
		
		// use stream.filter.map 
		// with Prdicate and Function
		people.stream().filter(ageOver30).map(mapper1);
		
		
		// Terminal operations ------------------------------------------
		// collect method, turns stream into a list
		List<String> peopleOver30 = people.stream().filter(ageOver30).map(mapper1).collect(Collectors.toList());
		System.out.println(peopleOver30);
		
		
		
		
		
		// Terminal operation with Optional
		List<Person> emptyPeopleList = new ArrayList<>();
		
		Comparator<Integer> ageComparator =
				(age1, age2) -> age1 - age2;
				
		//Optional<Integer> highestAge = people.stream().map(person -> person.getAge()).max(ageComparator);
		Optional<Integer> highestAge = emptyPeopleList.stream().map(person -> person.getAge()).max(ageComparator);
		
		if (highestAge.isPresent()) {
			System.out.println(highestAge);
		}else {
			System.out.println("no highest age availalbe");
		}
		
		
		
		
		
		
		
		
		
		// Double Streams
		OptionalInt lowestAge = people.stream()
				.mapToInt(person -> person.getAge())
				.min();
		System.out.println("the lowest age is: " + lowestAge);
		
				
				
				
				
	}

}
