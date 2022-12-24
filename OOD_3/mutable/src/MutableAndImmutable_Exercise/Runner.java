package MutableAndImmutable_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		
	Trainee trainee1 = new Trainee("oner", "java" , 3);
	Trainee trainee2 = new Trainee("twoer", "js" , 6);
	Trainee trainee3 = new Trainee("theer", "data" , 1);
	
	List<Trainee> traineeList = new ArrayList<Trainee>(Arrays.asList(trainee1, trainee2, trainee3));
	
	Trainer trainer1 = new Trainer("aubri");
	
	trainer1.addStream("java");
	trainer1.addStream("sql");
	trainer1.addStream("odd");
	
	CompletedClass completedClass = new CompletedClass("java", trainer1, traineeList);
	
	// week before making any changes
	System.out.println("week values before making the changes------");
	for (Trainee t:traineeList) {
		System.out.println(t.getName() + " " + t.getWeek());
	}
	
	System.out.println("week values after making the changes------");
	System.out.println("calling the traineeList outside our immutable class------");
	
	trainee1.setWeek(5);
	trainee2.setWeek(5);
	trainee3.setWeek(5);
	
	for (Trainee t:traineeList) {
		System.out.println(t.getName() + " " + t.getWeek());
	}
	
	System.out.println("week values after making the changes------");
	System.out.println("calling the traineeList using the immutable class------");
	
	for (Trainee t:completedClass.getTRAINEES()) {
		System.out.println(t.getName() + " " + t.getWeek());
	}
	
	trainer1.addStream("javascript");
	
	System.out.println("Trainer streams, from outside the immutable class");
	for (String s:trainer1.getAllStreams()) {
		System.out.println(s );
	}
	
	
	System.out.println("Trainer streams, from inside the immutable class");
	for (String s:completedClass.getTRAINER().getAllStreams()) {
		System.out.println(s);
	}
	
	
	
	
	
	
	}// End of Main
}
