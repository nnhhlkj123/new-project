package AShape;

public class Square extends AShape{
	private int side;
	public Square(CartesianPoint location, int side) {
		super(location);
		this.side=side;
	}
	public double area() {
		return this.side*this.side;
	}
	public boolean contains(CartesianPoint point) {
		int thisX=this.location.getX();
		int thisY=this.location.getY();
		return between(thisX, point.getX(),thisX+this.side)&&
			   between(thisY, point.getY(), thisY+this.side);	
	}
	public boolean between(int left, int mid, int right) {
		return (left <= mid)&&(mid <= right);
	}
	public Square boundingBox() {
		return this;
	}
}
