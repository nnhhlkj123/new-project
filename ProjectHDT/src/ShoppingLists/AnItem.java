package ShoppingLists;

public abstract class AnItem  {
	protected String branchName;
	protected double weight;
	protected double price;
	
	protected AnItem(String branchName, double weight, double price) {
		this.branchName=branchName;
		this.weight=weight;
		this.price=price;
	}
		
}
