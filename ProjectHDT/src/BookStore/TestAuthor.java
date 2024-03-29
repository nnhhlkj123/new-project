package BookStore;

import junit.framework.TestCase;

public class TestAuthor extends TestCase {
	public void testNumberOfBOoks() {
		Author a1=new Author("a1 name",1940,new Empty());
		Author a2=new Author("a2 name",1950,new Empty());
		Book book1=new Book(a1,"aggja",50,1980);
		Book book2=new Book(a2,"agaga",60, 1990);
		Book book3=new Book(a2,"agagahg",40,1985);
		assertEquals(a1.numberOfBooks(),1,0.01);
		assertEquals(a2.numberOfBooks(),2,0.01);
	}
}
