package RunnerLog;

public class Entry {
	private Date date;
	private double distance;
	private int durationInMinutes;
	private String postRunFeeling;
	
	public Entry(Date date, double distance, int durationInMinutes, String postRunFeeling) {
		this.date=date;
		this.distance=distance;
		this.durationInMinutes=durationInMinutes;
		this.postRunFeeling=postRunFeeling;
	}
	public double getDistance() {
		return this.distance;
	}
	public boolean sameMonthInAYear(int month,int year) {
		return(this.date.sameMonthInAYear(month,year));
	}
}
