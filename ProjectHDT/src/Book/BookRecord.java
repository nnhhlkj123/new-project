package Book;

public class BookRecord {
	private String AthourName;
	private String Title;
	private double Price;
	private double PublicationYear;
	
	public BookRecord (String AN, String T, double P, double PY)
	{
		this.AthourName= AN;
		this.Title= T;
		this.Price= P;
		this.PublicationYear= PY;
	}
}
