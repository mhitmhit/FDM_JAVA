import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BasketTest {
	
	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBookHaveBeenAdded() {
		// Arrange
		Basket basket = new Basket();
		
		// Act
		int numberOfBooksInBasket = basket.getBooksInBasket().size();
		
		// Assert
		assertEquals(numberOfBooksInBasket, 0);
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook() {
		// Arr
		Basket basket = new Basket();
		Book book1 = new Book(9.99);
		
		// Act
		basket.addBookToBasket(book1);
		int numberOfBooksInBasket = basket.getBooksInBasket().size();
		
		// Assert
		assertEquals(numberOfBooksInBasket, 1);
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithOneBook() {
		// Arr
		Basket basket = new Basket();
		Book book1 = new Book(9.99);
		
		// Act
		basket.addBookToBasket(book1);
		basket.addBookToBasket(book1);
		int numberOfBooksInBasket = basket.getBooksInBasket().size();
		
		// Assert
		assertEquals(numberOfBooksInBasket, 2);
	}

}
