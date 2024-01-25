package Restaurant;

public class Intersection {
	private int avenue;
	private int street;
	
	public Intersection(int avenue, int street) {
		this.avenue=avenue;
		this.street=street;
	}
	public boolean closeTo(Intersection that) {
		return ((Math.abs(this.avenue-that.avenue)<=1)&&(Math.abs(this.street-that.street)<=1));
	}
}
