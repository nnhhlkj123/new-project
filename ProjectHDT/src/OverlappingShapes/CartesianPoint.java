package OverlappingShapes;

public class CartesianPoint {
	private int x;
	private int y;
	
	public CartesianPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public double distanceToO() {
		return Math.sqrt(this.x*this.x+this.y*this.y);
	}
	public double distanceTo(CartesianPoint that) {
		double diffX=this.x-that.x;
		double diffY=this.y-that.y;
		return Math.sqrt(diffX*diffX+diffY*diffY);
	}
	public boolean equalsTF(Object obj) {
		if(!(obj instanceof CartesianPoint))
			return false;
		else {
			CartesianPoint that=(CartesianPoint)obj;
			return (this.x==that.x)&&(this.y==that.y);
		}
	}
	
	public CartesianPoint translate(int deltaX, int deltaY) {
		return new CartesianPoint(this.x+deltaX,this.y+deltaY);
	}
}