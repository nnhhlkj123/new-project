package ShoppingLists;

public class Juice extends AnItem {
	private String flavor;
	private String packagej;
	
	public Juice(String branchName, double weight, double price, String flavor, String packagej) {
		super(branchName,weight,price);
		this.flavor=flavor;
		this.packagej=packagej;
	}
}
