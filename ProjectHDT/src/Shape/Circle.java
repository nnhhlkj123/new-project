package Shape;

public class Circle extends AShape{
	private int radius;
	
	public Circle(CartesianPoint point, int radius) {
		super(point);
		this.radius=radius;
	}
}
