package BookStore;

public class Author {
	private String name;
	private int birthYear;
	private ALoBooks books;
	
	public Author(String name, int birthYear, ALoBooks books) {
		this.name=name;
		this.birthYear=birthYear;
		this.books=books;
	}
	public void addBook(Book book) {
		books=new Cons(book,this.books);
	}
	public int numberOfBooks() {
		return this.books.count();
	}
	public boolean contemporary() {
		return (this.birthYear>1940);
	}
}
