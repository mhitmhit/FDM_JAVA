package com.fdmgroup.comparisonsExercises;

public class Book {
	
	private String title;
	private int isbn;
	private double price;
	private int numberOfPages;
	private double rating;
	
	public Book(String title, int isbn, double price, int numberOfPages, double rating) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.numberOfPages = numberOfPages;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	public int getIsbn() {
		return isbn;
	}
	
	public double getRating() {
		return rating;
	}
	
}
