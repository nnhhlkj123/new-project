package RunnerLog;

public class ConsLog extends ALog {
	private Entry first;
	private ALog rest;
	
	public ConsLog(Entry first, ALog rest) {
		this.first=first;
		this.rest=rest;
	}
	public double miles() {
		return this.first.getDistance()+this.rest.miles();
	}
	public ALog getLog(int month,int year) {
		if(this.first.sameMonthInAYear(month,year))
			return new ConsLog(this.first,this.rest.getLog(month, year));
		else
			return this.rest.getLog(month, year);
	}
}
