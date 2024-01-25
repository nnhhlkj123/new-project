package Shape;

public class Square extends AShape {
	private int length;
	
	public Square(CartesianPoint point, int length) {
		super(point);
		this.length=length;
	}	
}
