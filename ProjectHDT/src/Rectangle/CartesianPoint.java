package Rectangle;

public class CartesianPoint {
	private int x;
	private int y;
	
	public CartesianPoint(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public double distanceToO() {
		return Math.sqrt(this.x*this.x+this.y*this.y);
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
}
