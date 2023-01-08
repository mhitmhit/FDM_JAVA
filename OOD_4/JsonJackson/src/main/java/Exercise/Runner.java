package Exercise;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Runner{

	public static Book[] readFromJson(File file) {
		ObjectMapper mapper = new ObjectMapper();
		Book[] returnedBooksList = null;
		ArrayList<Book> retBooks = new ArrayList<Book>();
		
		try {
			returnedBooksList = mapper.readValue(file, Book[].class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Book b:returnedBooksList){
			System.out.println(b.getTitle());
		}
		return returnedBooksList;
	}
	
	
	
	public static void writeToJsonFileInAlphabeticalOrder(Book[] bookList) {
		
		ArrayList<Book> books = new ArrayList<Book>();
		for (Book b:bookList) {
			books.add(b);
		}
		NameBookComparator comparator = new NameBookComparator();
		
		Collections.sort(books, comparator);
		
		ObjectMapper mapper = new ObjectMapper();
		File file = new File("sorted-books.json");
		try {
			mapper.writerWithDefaultPrettyPrinter().writeValue(file, books);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("books.json");
		//readFromJson(file);
		
		writeToJsonFileInAlphabeticalOrder(readFromJson(file));
		
		
	}// end of main

}
