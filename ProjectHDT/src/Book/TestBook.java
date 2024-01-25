package Book;

import junit.framework.TestCase;

public class TestBook extends TestCase {
	public void testConstructor() {
		new BookRecord("Daniel Defoe", "Robinson Crusoe" , 15.50, 1719);
		new BookRecord("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
		new BookRecord("Pat Conroy", "Beach Music", 9.50, 1996);
	}
}
