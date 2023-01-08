package Exercise;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book implements Comparable<Book>, Serializable{
	
	private String title;
	private String author;
	
	@JsonProperty("isbn-10")
	private String isbn;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}
	
	public Book() {
		
	}

	
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}
	
	public int compareTo(Book book) {
		return this.getTitle().compareTo(book.getTitle());
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
	}
	
	
}
