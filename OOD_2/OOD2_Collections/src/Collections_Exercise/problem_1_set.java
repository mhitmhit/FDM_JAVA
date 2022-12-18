package Collections_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class problem_1_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stringValue = "yassine ali james cookie elmo spiderman blackPanther yassine ali cookie ali ali alia";
		//ArrayList<String> originalArray = new ArrayList<String>();
		String[] originalArray = stringValue.split(" ");
		
		
		Set<String> newSet = new TreeSet();
		
		for (String s:originalArray) {
			newSet.add(s);
		}
		
		System.out.println(newSet);
		
		
	}

}
