package playground_factory;

public class FactoryDriver {

	public static void main(String[] args) {
		
		ShapeFactory factory = new ShapeFactory();
		
		factory.createObjectOf("circle");
		
		

	}

}
