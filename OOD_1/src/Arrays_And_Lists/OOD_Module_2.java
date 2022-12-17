package Arrays_And_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class OOD_Module_2 {

	public static void main(String[] args) {
		//1.1
		System.out.println(1.1);
		String[] friends = {"oner", "twoer", "threere", "fourer", "fivver"};
		System.out.println(friends[0] +" "+ friends[1]);
		friends[4] = "newFiverr";
		System.out.println(friends[4]);
		//friends[2] = null;
		System.out.println(friends[2]);
		Arrays.sort(friends);
		System.out.println(friends[0]);
		
		System.out.println(1.2);
		String[] pokerHand = new String[5];
		pokerHand[0] = "Queen of hearts";
		System.out.println(pokerHand[1]);
		System.out.println(pokerHand[0]);
		
		System.out.println(2.1);
		ArrayList<String> shoppingBasket = new ArrayList<String>();
		shoppingBasket.add("milk");
		System.out.println(shoppingBasket.size());
		shoppingBasket.remove("milk");
		shoppingBasket.remove("milk");
		System.out.println(shoppingBasket.size());
		Collections.sort(shoppingBasket);
		
		System.out.println(2.2);
		ArrayList<Integer> salaries = new ArrayList<Integer>();
		salaries.add(75000);
		salaries.add(1000);
		salaries.add(100000);
		System.out.println(Collections.max(salaries));
		System.out.println(Collections.frequency(salaries, 1000));
		Collections.sort(salaries);
		System.out.println(salaries);
		Collections.reverse(salaries);
	}// end of Main

}
