package Conditionals;

public class OOD_Module_3 {

	public static void main(String[] args) {
		//1.1
		System.out.println(1.1);
		String alienColor = "blue";
		if (alienColor.equals("green")) {
			System.out.println("you have earned 5 points");
		}
		
		//1.2
		System.out.println(1.2);
		if (alienColor.equals("yellow")) {
			System.out.println("you have earned 10 points");
		}
		if (alienColor.equals("red")) {
			System.out.println("you have earned 15 points");
		}

		//1.3
		System.out.println(1.3);
		if (alienColor.equals("green")) {
			System.out.println("you have earned 5 points");
		} else if (alienColor.equals("yellow")) {
			System.out.println("you have earned 10 points");
		} else if (alienColor.equals("red")) {
			System.out.println("you have earned 15 points");
		} else {
			System.out.println("invalid color");
		}
		
		//1.4
		System.out.println(1.4);
		int age = 70;
		if ( age < 2 ) {
			System.out.println("baby");
		} else if ( age < 4 ) {
			System.out.println("toddler");
		} else if ( age < 13 ) {
			System.out.println("child");
		} else if ( age < 20 ){
			System.out.println("teenager");
		} else if ( age < 65 ){
			System.out.println("adult");
		} else {
			System.out.println("pensioner");
		}
		
		//1.5
		System.out.println(1.5);
		
		System.out.println(2.1);
		
		
		
		
		
	}// end of Main

}
