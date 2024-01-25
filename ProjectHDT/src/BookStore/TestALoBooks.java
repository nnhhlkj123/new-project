package BookStore;

import junit.framework.TestCase;

public class TestALoBooks extends TestCase{
	public void testALoBooksContemporary(){
		Author a1=new Author("a1 name",1940,new Empty());
		Author a2=new Author("a2 name",1950,new Empty());
		Book book1=new Book(a1,"aggja",50,1980);
		Book book2=new Book(a2,"agaga",60, 1930);
		Book book3=new Book(a2,"agagahg",40,1985);
		
		ALoBooks l1=new Empty();
		ALoBooks l2=new Cons(book1,l1);
		ALoBooks l3=new Cons(book2,l2);
		ALoBooks l4=new Cons(book3,l3);
		ALoBooks l5=new Cons(book3,l2);
		
		assertEquals(l2.contemporary(),l2);
		assertEquals(l3.contemporary(),l2);
		assertEquals(l4.contemporary(),l5);
	}

}
