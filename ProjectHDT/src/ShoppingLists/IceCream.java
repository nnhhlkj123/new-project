package ShoppingLists;

public class IceCream extends AnItem{
	private String flavor;
	private String packagec;
	
	public IceCream(String branchName, double weight, double price, String flavor,String packagec ) {
		super(branchName,weight,price);
		this.flavor=flavor;
		this.packagec=packagec;
	}
}
