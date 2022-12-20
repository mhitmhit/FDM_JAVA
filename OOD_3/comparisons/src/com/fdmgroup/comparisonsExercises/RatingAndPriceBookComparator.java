package com.fdmgroup.comparisonsExercises;

import java.util.Comparator;

public class RatingAndPriceBookComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		DescRatingBookCompare ratingComparator = new DescRatingBookCompare();
		PriceBookComparator priceComparator = new PriceBookComparator();
		int resultOfRatingCompare = ratingComparator.compare(o1, o2);
		
		if (resultOfRatingCompare == 0) {
			return priceComparator.compare(o1, o2);
		}
		return resultOfRatingCompare;
	}
}
