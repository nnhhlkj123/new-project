package Bai611;

public class Package {
	private BoxSize boxSize;
	private double weight;
	private Person sender;
	private Person recipient;
	private String url;
	
	public Package(BoxSize boxSize, double weight, Person sender, Person recipient, String url) {
		this.boxSize=boxSize;
		this.weight=weight;
		this.sender=sender;
		this.recipient=recipient;
		this.url=url;
	}
}
