package Shape;

import junit.framework.TestCase;

public class CircleTest extends TestCase{
	public void testConstructor() {
		new Circle(new CartesianPoint(0, 0), 30);
	}
}
