package RunnerLog;

import junit.framework.TestCase;

public class TestLogMiles extends TestCase{
	public void testMiles() {
		Date d1=new Date(5,5,2005);
		Date d2=new Date(6,6,2005);
		Date d3=new Date(23,6,2005);
		
		Entry e1=new Entry(d1,5.0,25,"Good");
		Entry e2=new Entry(d2,3.0,25,"Tired");
		Entry e3=new Entry(d3,26.0,156,"Great");
		
		ALog l1=new MTLog();
		ALog l2=new ConsLog(e1,l1);
		ALog l3=new ConsLog(e2,l2);
		ALog l4=new ConsLog(e3,l3);
		
		assertEquals(l1.miles(),0.0,0.01);
		assertEquals(l2.miles(),5.0,0.01);
		assertEquals(l3.miles(),8.0,0.01);
		assertEquals(l4.miles(),34.0,0.01);
		//assertEquals
	}
}
