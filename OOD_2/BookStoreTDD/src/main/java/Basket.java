import java.util.ArrayList;

public class Basket {
	ArrayList<Book> booksInBasket = new ArrayList<Book>();
	
	public ArrayList<Book> getBooksInBasket(){
		return booksInBasket;
	}
	
	public void addBookToBasket(Book book) {
		booksInBasket.add(book);
	}
	
}
