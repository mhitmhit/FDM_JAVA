package Collections_Exercise;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class problem_2_hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Color> myMap = new HashMap();
		
		myMap.put("blue", Color.BLUE);
		myMap.put("yellow", Color.YELLOW);
		myMap.put("red", Color.RED);
		System.out.println(
		myMap.get("yellow")
		);
	}

}
