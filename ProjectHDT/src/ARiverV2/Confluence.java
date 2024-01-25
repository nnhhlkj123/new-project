package ARiverV2;

public class Confluence extends ARiver{
	private ARiver left;
	private ARiver right;
	
	public Confluence (Location location, ARiver left, ARiver right) {
		super(location);
		this.left=left;
		this.right=right;
	}
}
