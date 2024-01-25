package OverlappingShapes;

public abstract class ASingleShape extends AShape{
	protected CartesianPoint location;
	protected ASingleShape(CartesianPoint location) {
		this.location=location;
	}
	public abstract double area();
	public double distanceToO() {
		return this.location.distanceToO();	
	}
	public abstract boolean contains(CartesianPoint point);
	public boolean isInside(ASingleShape shape) {
		return shape.contains(this.location);
	}
	public abstract Square boundingBox();
}
