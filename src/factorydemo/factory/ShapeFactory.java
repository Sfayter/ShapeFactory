package factorydemo.factory;

import factorydemo.model.Circle;
import factorydemo.model.Rectangle;
import factorydemo.model.Shape;
import factorydemo.model.Square;

public class ShapeFactory {

	public Shape getShape(String type) {
		if(type == null) {
			return null;
		}
		if(type == "Circle") {
			return new Circle();
		}
		if(type == "Rectangle") {
			return new Rectangle();
		}
		if(type == "Square") {
			return new Square();
		}
		return null;
	}
}
