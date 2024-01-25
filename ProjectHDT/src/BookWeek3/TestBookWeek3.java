package BookWeek3;

import junit.framework.TestCase;

public class TestBookWeek3 extends TestCase{
	public void testConstructor() {
	BookStoreAssistant A1= new BookStoreAssistant("Daniel Defoe", 1670);
	BookWeek3Record B1=new BookWeek3Record(A1, "Robinson Crusoe" , 15.50, 1719);
	
	BookStoreAssistant A2=new BookStoreAssistant("Joseph Conrad",1870);
	BookWeek3Record B2=new BookWeek3Record(A2, "Heart of Darkness", 12.80, 1902);
	
	BookStoreAssistant A3=new BookStoreAssistant("Pat Conroy",1920);
	BookWeek3Record B3=new BookWeek3Record(A3, "Beach Music", 9.50, 1996);
	}
}
