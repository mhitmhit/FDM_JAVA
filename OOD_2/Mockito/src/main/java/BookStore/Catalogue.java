package BookStore;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {

	ArrayList<Book> books = new ArrayList<Book>();
	ReadItemCommand readItemCommand;
	
	public Catalogue(ReadItemCommand readItemCommand) {
		this.readItemCommand = readItemCommand;
	}
	
	public Catalogue() {
	}
	
	public ArrayList<Book> getAllBooks() {
		//readItemCommand.readAll();
		this.books = readItemCommand.readAll();
		return books;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void addBooks(ArrayList<Book> books) {
		this.books = books;
	}

}
