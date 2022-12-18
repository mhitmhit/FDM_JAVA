package BookStore;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {

	ArrayList<Book> books = new ArrayList<Book>();
	ReadItemCommand readItemCommand;
	WriteItemCommand writeItemCommand;
	
	public Catalogue(ReadItemCommand readItemCommand) {
		this.readItemCommand = readItemCommand;
	}
	
	public Catalogue() {
	}
	
	public Catalogue(WriteItemCommand writeItemCommand) {
		this.writeItemCommand = writeItemCommand;
	}
	
	public ArrayList<Book> getAllBooks() {
		//readItemCommand.readAll();
		this.books = readItemCommand.readAll();
		return books;
	}
	
	public void addBook(Book book) {
		writeItemCommand.insertItem(book);
	}
	
	public void addBooks(ArrayList<Book> books) {
		this.books = books;
	}

}
