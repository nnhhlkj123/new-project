package RealAstateAssistant;

import junit.framework.TestCase;

public class TestRealAstateAssistant extends TestCase {
	public void testConstructor() {
		Address A1=new Address(23, "Maple Street", "Brookline");
		Assistant As1=new Assistant("Ranch", "7 rooms", 375000, A1);
		
		Address A2=new Address(5, "Joye Road", "Newton");
		Assistant As2=new Assistant("Colonial", "9 rooms", 450000, A2);
		
		Address A3=new Address(83, "Winslow Road", "Waltham");
		Assistant As3=new Assistant("Cape", "6 rooms", 235000,A3);
	}
}
