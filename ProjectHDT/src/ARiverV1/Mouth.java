package ARiverV1;

public class Mouth extends ARiver{
	private ARiver steam;
	
	public Mouth(Location location,ARiver steam) {
		super(location);
		this.steam=steam;
	}
}
