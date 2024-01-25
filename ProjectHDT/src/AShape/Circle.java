package AShape;

public class Circle extends AShape{
	private int radius;
	public Circle(CartesianPoint location, int radius) {
		super(location);
		this.radius=radius;
	}
	public double area() {
		return Math.PI*this.radius*this.radius;
	}
	public boolean contains(CartesianPoint point) {
		return this.location.distanceTo(point)<=this.radius;
	}
	public Square boundingBox() {
		return new Square(this.location.translate(-this.radius,-this.radius),this.radius*2);
	}
}
