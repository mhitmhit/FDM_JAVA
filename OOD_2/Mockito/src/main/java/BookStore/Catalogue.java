package BookStore;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {

	ArrayList<Book> books = new ArrayList<Book>();
	ReadItemCommand readItemComman;
	
	public Catalogue(ReadItemCommand readItemCommand) {
		this.readItemComman = readItemCommand;
	}
	
	public Catalogue() {
		
	}
	
	public ArrayList<Book> getAllBooks(ReadItemCommand readItemCommand) {
		//books = readItemCommand.readAll();
		return books;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void addBooks(ArrayList<Book> books) {
		this.books = books;
	}

}
