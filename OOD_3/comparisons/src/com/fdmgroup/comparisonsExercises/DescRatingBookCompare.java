package com.fdmgroup.comparisonsExercises;

import java.util.Comparator;

public class DescRatingBookCompare implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if (o1.getRating() > o2.getRating())
			return -1;
		else if (o1.getRating() < o2.getRating())
			return 1;
		else 
			return 0;
	}

}
