package Walkthrough;

import java.util.ArrayList;
import java.util.List;

public class Farmer<P extends Produce> {
	
	private List<P> produceItems = new ArrayList<P>();
	
	public P getProduce(int index) {
		return produceItems.get(index);
	}
	
	public void addProduce(P produce) {
		produceItems.add(produce);
	}
	
	public void printAllSpecies() {
		for (P p:produceItems) {
			System.out.println(p.getSpecies());
		}
	}
	
}
