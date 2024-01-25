package BookStore;

import java.util.Objects;

public class Book {
	private Author author;
	private String title;
	private double price;
	private int publicationYear;
	

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& publicationYear == other.publicationYear && Objects.equals(title, other.title);
	}
	public Book(Author author, String title, double price, int publicationYear) {
		this.author=author;
		this.title=title;
		this.price=price;
		this.publicationYear=publicationYear;
		this.author.addBook(this);
	}
	public boolean contemporary() {
		return this.author.contemporary();
	}
	
}
