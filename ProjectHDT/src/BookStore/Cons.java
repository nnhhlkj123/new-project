package BookStore;

public class Cons extends ALoBooks {
	private Book first;
	private ALoBooks rest;
	
	public Cons(Book first, ALoBooks rest) {
		this.first=first;
		this.rest=rest;
	}
	public int count() {
		return 1+this.rest.count();	
	}
	public ALoBooks contemporary() {
		if(this.first.contemporary()) 
			return new Cons(this.first,this.rest.contemporary());

		else
			return this.rest.contemporary();
	}
	
	
}
