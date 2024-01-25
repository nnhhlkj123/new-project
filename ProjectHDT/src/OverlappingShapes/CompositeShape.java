package OverlappingShapes;

public class CompositeShape extends AShape{
	private AShape top;
	private AShape bottom;
	
	public CompositeShape(AShape top, AShape bottom) {
		this.top=top;
		this.bottom=bottom;
	}
	public double distanceToO() {
		return Math.min(this.top.distanceToO(),this.bottom.distanceToO());
	}
	public boolean contains (CartesianPoint point) {
		return this.top.contains(point)||this.bottom.contains(point);
	}
	public 
}
