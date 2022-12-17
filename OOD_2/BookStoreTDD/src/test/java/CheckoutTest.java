import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckoutTest {

	@Test
	void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		// arrange
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
			
		// act
		double totalPrice = checkout.calculatePrice(basket);
		
		// assert
		assertEquals(totalPrice, 0.0);
	}

	@Test
	void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {
		// arrange
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		double bookPrice = 9.99;
		Book book1 = new Book(bookPrice);
		
		// act
		basket.addBookToBasket(book1);
		double totalPrice = checkout.calculatePrice(basket);
		
		// assert
		assertEquals(totalPrice, 9.99);
	}
	
}
