package InClass_Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person("test", "tester", 30);
		Person person2 = new Person("yassine", "elk", 21);
		Person person3 = new Person("juan", "arango", 39);
		Person person4 = new Person("nelson", "mand", 76);
		Person person5 = new Person("nico", "tesl", 50);
		
		List<Person> people = new ArrayList<Person>(Arrays.asList(person1, person2, person3, person4, person5));
		
		people.stream();
		
		Predicate<Person> ageOver30 = 
				person -> person.getAge() > 30;
				
		//people.stream().filter(ageOver30).map(mapper)
		
		
				
				
				
				
				
	}

}
