package playground_factory;

import playground_shapes.Circle;
import playground_shapes.Rectangle;
import playground_shapes.Square;

public class ShapeFactory {

	public Object createObjectOf(String value){
		
		if (value == "Circle") {
				return new Circle();
		}
		
		if (value == "Square") {
				return new Square();
		}
		
		if (value == "rectangle") {
				return new Rectangle();
		}
		
		return null;
	}
	
}
