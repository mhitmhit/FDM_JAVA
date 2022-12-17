
public class Checkout {
	
	double totalPrice;
	
	public double calculatePrice(Basket basket) {
		// TODO Auto-generated method stub
		
		for (Book b:basket.getBooksInBasket()) {
			totalPrice = b.getPrice() + totalPrice;
		}
		
		return totalPrice;
	}
}
