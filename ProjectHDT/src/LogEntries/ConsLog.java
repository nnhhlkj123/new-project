package LogEntries;

public class ConsLog extends ALog {
	private Entry first;
	private ALog rest;
	
	public ConsLog(Entry first, ALog rest) {
		this.first=first;
		this.rest=rest;
	}
	
}
