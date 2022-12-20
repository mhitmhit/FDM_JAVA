package Walkthrough;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Farmer<Produce> numberFarmer = new Farmer<Produce>();
		
		numberFarmer.addProduce(new Banana("imported Banana"));
		numberFarmer.addProduce(new Banana("local Banana"));
		numberFarmer.addProduce(new Banana("peruvian Banana"));
		numberFarmer.addProduce(new Apple("red apple"));
		numberFarmer.addProduce(new Banana("green apple"));
		
		numberFarmer.printAllSpecies();
		//System.out.println("the farmer is farming: " + numberFarmer.getProduce(0));
		
		
	}

}
