package Data_Types;

public class OOD_Module_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.1
		System.out.println(1.1);
		String message = "hello, welcome to Java class";
		System.out.println(message);
		
		//1.2
		System.out.println(1.2);
		String firstName = "Yassine";
		String lastName = "Elkabaili";
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		
		//1.3
		System.out.println(1.3);
		String name = "Eric";
		System.out.println("Hello "+name+" welcome to the Java class");
		
		//1.4
		System.out.println(1.4);
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(name.length()-1));
		System.out.println();
		
		//1.5
		System.out.println("1.5");
		String text = "this is a sentence";
		System.out.println(text.indexOf(" "));
		System.out.println(text.lastIndexOf(" "));
		System.out.println(text.indexOf("x"));
		System.out.println(text.substring(0, 4));
		System.out.println(text.substring(10));
		System.out.println(text.substring(5,9));
		System.out.println(text.contains("a"));
		System.out.println(text.contains("x"));
		text = "is "+ text + "?";
		System.out.println(text);
		System.out.println(text.replaceFirst("t", "T"));
		
		System.out.println(2.1);
		int myFavoriteNumber = 7;
		System.out.println("my favorite number is: " + myFavoriteNumber );
		
		System.out.println(2.2);
		int number1 = 3;
		int number2 = 5;
		System.out.println("result of adding: " + (number1+number2) );
		
		System.out.println(2.3);
		int counter = 0;
		counter = counter + 1;
		counter = counter + 5;
		counter = counter -1;
		counter = counter -2;
		counter = counter * 2;
		System.out.println("counter value is: "+ counter );

		System.out.println(2.4);
		int a = 5;
		int b = 2;
		double c = 5;
		double d = 2;
		System.out.println(a/b);
		System.out.println(c/d);
		System.out.println(c/b);
		System.out.println(a/d);
		
		System.out.println(3.1);
		char letter = 'a';
		int code = 98;
		System.out.println((int)letter);
		System.out.println((char)code);
		System.out.println((char)36);
		
		System.out.println(3.2);
		System.out.println('c'-'a');
		
		System.out.println(3.3);
		char char1 = 'x';
		char char2 = 'y';
		char char3 = 'z';
		String string1 = "z";
		String string2 = "y";
		System.out.println(char1 + char2 + char3);
		System.out.println(char1 + char2 + string2);
		System.out.println(char1 + string1 + char3);
		
		System.out.println(4.1);
		String number_1 = "5";
		String number_2 = "3";
		System.out.println(Integer.parseInt(number_1) + Integer.parseInt(number_2));
		
		System.out.println(4.2);
		number_1 = "5.3";
		number_2 = "3.2";
		System.out.println(Double.parseDouble(number_2)+Double.parseDouble(number_1));
		
		System.out.println(4.3);
		String string_1 = "abc11";
		String string_2 = "9xyz";
		String string_3 = "abc7xyz";
		System.out.println(
			Integer.parseInt(string_1.substring(3))
			+ Integer.parseInt(string_2.substring(0,1))
			+ Integer.parseInt(string_3.substring(3,4))
				);
		
		
		
	}

}
