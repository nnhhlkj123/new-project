package ShoppingLists;

public class Coffee extends AnItem {
	private String label;
	
	public Coffee(String branchName, double weight, double price, String label) {
		super(branchName,weight,price);
		this.label=label;
	}
}
