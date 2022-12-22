package com.fdmgroup.comparisonsExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("learn java", 		45678, 19.99, 500, 4.3);
		Book book2 = new Book("learn unix", 		65432, 17.5, 650, 4.3);
		Book book3 = new Book("learn sql",  		87956, 9.75, 220, 4.4);
		Book book4 = new Book("learn agile",		35367, 25.5, 500, 4.4);
		Book book5 = new Book("learn react",   		55676, 28.75, 490, 4.8);
		Book book6 = new Book("learn javascript", 	34343, 14.99, 300, 4.4);
		Book book7 = new Book("learn python", 		65767, 17.25, 500, 4.1);
		
		List<Book> bookList = new ArrayList<Book>(Arrays.asList(book1, book2, book3, book4, book5, book6, book7));
		System.out.println("---------------");
		System.out.println("before sorting the array is: ");
		for (Book b:bookList) {
			System.out.println(b.getTitle());
		}
		
		System.out.println("---------------");
		System.out.println("sorting by price");
		PriceBookComparator priceBookComparator = new PriceBookComparator();
		Collections.sort(bookList, priceBookComparator);
		for (Book b:bookList) {
			System.out.println(b.getTitle());
		}
		
		System.out.println("---------------");
		System.out.println("sorting by price");
		NameBookComparator nameBookComparator = new NameBookComparator();
		Collections.sort(bookList, nameBookComparator);
		for (Book b:bookList) {
			System.out.println(b.getTitle());
		}
		
		System.out.println("---------------");
		System.out.println("sorting by Desc Rating then by Asce Price");
		RatingAndPriceBookComparator ratAndPricecompare = new RatingAndPriceBookComparator();
		Collections.sort(bookList, ratAndPricecompare);
		for (Book b:bookList) {
			System.out.println(b.getTitle());
		}
		
		System.out.println("---------------");
		Set<Book> bookSet = new TreeSet<Book>(ratAndPricecompare);
		bookSet.add(book1);
		bookSet.add(book2);
		bookSet.add(book3);
		bookSet.add(book4);
		bookSet.add(book5);
		bookSet.add(book6);
		bookSet.add(book7);
		
		for (Book b:bookSet) {
			System.out.println(b.getRating() +" "+b.getPrice());
		}
		
		System.out.println("---------------");
		doubleBuiltInComparator doubleCompare = new doubleBuiltInComparator();
		
		doubleCompare.addToQueue(6.0);
		doubleCompare.addToQueue(1.0);
		doubleCompare.addToQueue(3.0);
		doubleCompare.addToQueue(7.0);
		
		for (Double b: doubleCompare.getQueue()) {
			System.out.println(b);
		}
		
	}

}
