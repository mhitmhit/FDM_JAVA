package Loops;

import java.util.ArrayList;

public class OOD_Module_4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(1.1);
		String[] courses = {"UNIX", "SQL", "Java", "Python", "Web Apps"};
		for (String course:courses) {
			System.out.println(" I love learning " + course);
		}
		
		System.out.println(1.6);
		String text = "10,7,25,3,8";
		String[] stringArray = text.split(",");
		int total=0;
		for (String ele:stringArray) {
			total = total + Integer.parseInt(ele);
		}
		System.out.println("total is: " + total);
		
		System.out.println(1.7);
		String sentence = "desrever neeb";
		String newSentence = "";
		char[] charSentence = sentence.toCharArray();
		for (char ele : charSentence) {
			newSentence = ele + newSentence;
		}
		System.out.println(newSentence);
		
	}// End Main

}
