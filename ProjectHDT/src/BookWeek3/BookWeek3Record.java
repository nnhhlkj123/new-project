package BookWeek3;

public class BookWeek3Record {
	private BookStoreAssistant AssistantBook;
	private String Title;
	private double Price;
	private double PublicationYear;
	
	public BookWeek3Record (BookStoreAssistant AB, String T, double P, double PY)
	{
		this.AssistantBook= AB;
		this.Title= T;
		this.Price= P;
		this.PublicationYear= PY;
	}
}
