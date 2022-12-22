package InClass;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person("test", "tester", 30);
		Person person2 = new Person("yassine", "elk", 21);
		Person person3 = new Person("juan", "arango", 39);
		
		// function example
		Function<Person, String> getPersonFullName = 
				person -> person.getFirstName() + "---" + person.getLastName();
		
		String fullName = getPersonFullName.apply(person1);
			
		System.out.println(fullName);
		

		// bi Function example
		BiFunction<Person, Integer, Integer> yearsToRetirement =
				(person, retirementAge) -> retirementAge-person.getAge(); 
				
		int yearsToRetire = yearsToRetirement.apply(person2, 65);
				
		System.out.println("years to retire: " + yearsToRetire);
				
		// predicate example
		Predicate<Person> oldEnoughToVote =
				(e) -> e.getAge() >= 18;
				
		System.out.println("old enough to vote ? " + oldEnoughToVote.test(person3));
		
		
	}

}
