package Shape;

import junit.framework.TestCase;

public class DotTest extends TestCase{
	public void testConstructor() {
		new Dot(new CartesianPoint(100, 200));
	}
}
