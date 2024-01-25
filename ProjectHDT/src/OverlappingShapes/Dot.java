package OverlappingShapes;

public class Dot extends ASingleShape {
	public Dot(CartesianPoint location) {
		super(location);
	}
	public double area() {
		return 0.0;
	}
	public boolean contains(CartesianPoint point) {
		return this.location.equals(point);
	}
	public Square boundingBox() {
		return new Square(this.location,0);
	}
}
