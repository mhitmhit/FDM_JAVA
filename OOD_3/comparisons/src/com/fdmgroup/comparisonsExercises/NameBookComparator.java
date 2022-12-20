package com.fdmgroup.comparisonsExercises;

import java.util.Comparator;

public class NameBookComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		String title1 = o1.getTitle();
		String title2 = o2.getTitle();
		
		if (title1.compareTo(title2) < 0)
			return -1;			
		else if (title1.compareTo(title2) > 0) 
			return 1;
		else 
			return 0;
	}

}
