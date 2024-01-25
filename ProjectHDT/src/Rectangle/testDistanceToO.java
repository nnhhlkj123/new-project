package Rectangle;

import junit.framework.TestCase;
public class testDistanceToO extends TestCase{
	public void testConstructor() {
		CartesianPoint a=new CartesianPoint(3,4);
		Rectangle r=new Rectangle(a,5,11);
		assertEquals(r.distanceToO(),5,0.1);
		
		a=new CartesianPoint(5,12);
		r=new Rectangle(a,10,10);
		assertEquals(r.distanceToO(),13,0.1);
	}
}
