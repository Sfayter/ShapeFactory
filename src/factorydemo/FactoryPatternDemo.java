package factorydemo;

import factorydemo.factory.ShapeFactory;
import factorydemo.model.Shape;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFac = new ShapeFactory();
		
		Shape circ = shapeFac.getShape("Circle");
		Shape sq = shapeFac.getShape("Square");
		Shape rec = shapeFac.getShape("Rectangle");

		testaForma(circ);
		testaForma(sq);
		testaForma(rec);
	}
	
	public static void testaForma(Shape s) {
		s.draw();
	}

}
