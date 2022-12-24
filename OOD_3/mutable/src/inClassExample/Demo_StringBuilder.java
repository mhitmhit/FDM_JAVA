package inClassExample;

public class Demo_StringBuilder {

	public static void main(String[] args) {

		String string1 = "Aubri";
		String string2 = string1;
		
		System.out.println("String 1: "+ string1);
		System.out.println("String 2: "+ string2);
		
		string1 = "Aubriana";
		System.out.println("String 1: "+ string1);
		System.out.println("String 2: "+ string2);
		
		String string3 = new String("Aubri");
		System.out.println(string2 == string3);
		System.out.println(string2.equals(string3));
		System.out.println(string2.compareTo(string3));
		
		
		StringBuilder strB1 = new StringBuilder("ABC");
		StringBuilder strB2 = strB1;
		
		System.out.println("value of strB1: " + strB1);
		System.out.println("value of strB2: "  + strB2);
		
		strB1.append("DEF");
		
		System.out.println("value of strB1: " + strB1);
		System.out.println("value of strB2: "  + strB2);
		
		
	}// end Main

}
