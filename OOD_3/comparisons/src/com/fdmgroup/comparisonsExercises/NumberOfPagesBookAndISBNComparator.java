package com.fdmgroup.comparisonsExercises;

import java.util.Comparator;

public class NumberOfPagesBookAndISBNComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		NumberOfPagesBookComparator pagesComparator = new NumberOfPagesBookComparator();
		IsbnBookComparator isbnComparator = new IsbnBookComparator();
		int resultOfPageCompare = pagesComparator.compare(o1, o2);
		
		if (resultOfPageCompare == 0) {
			return isbnComparator.compare(o1, o2);
		}
		return resultOfPageCompare;
	}
}
