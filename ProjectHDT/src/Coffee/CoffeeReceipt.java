package Coffee;

public class CoffeeReceipt {
	private String kind;
	private double pricePerPound;
	private double weight;

	public CoffeeReceipt(String kind, double pricePerPound, double weight) {
		this.kind = kind;
		this.pricePerPound = pricePerPound;
		this.weight = weight;
	}

	public double sellingCost() {
		return this.pricePerPound * this.weight;
	}

}
