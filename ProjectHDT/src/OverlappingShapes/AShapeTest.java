package OverlappingShapes;

import junit.framework.TestCase;

public class AShapeTest extends TestCase {
	public void testArea() {
		assertEquals(new Dot(new CartesianPoint(4,3)).area(),0.0,0.1);
		assertEquals(new Square(new CartesianPoint(4,3),30).area(),900,0.1);
		assertEquals(new Circle(new CartesianPoint(5,5),20).area(),1256.6,0.1);
	}
}
