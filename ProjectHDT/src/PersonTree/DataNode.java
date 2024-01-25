package PersonTree;

public class DataNode extends ATree{
	private Personallinfo personallinfo;
	private ATree father;
	private ATree mother;
	
	public DataNode(Personallinfo personallinfo, ATree father, ATree mother) {
		this.personallinfo=personallinfo;
		this.father=father;
		this.mother=mother;
	}
}
