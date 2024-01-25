package LogEntries;

import junit.framework.TestCase;

public class TestALog extends TestCase {
	public void testConstructor() {
		ALog e = new EmptyLog();
		Date d1=new Date(5,6,2004);
		Date d2=new Date(6,6,2004);
		Date d3=new Date(23,6,2004);
		Date d4=new Date(28,6,2004);
		Entry e1=new Entry(d1, 15.3, 87, "feeling great");
		Entry e2=new Entry(d2, 12.8, 84, "feeling good");
		Entry e3=new Entry(d3, 26.2, 250, "feeling dead");
		Entry e4=new Entry(d4, 26.2, 150, "good recovery");
		ALog list=new ConsLog(e1,new ConsLog(e2,new ConsLog(e3,new ConsLog(e4,e))));
	
		}
}
