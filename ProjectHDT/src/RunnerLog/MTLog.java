package RunnerLog;

public class MTLog extends ALog {
	public double miles() {
		return 0.0;
	}
	public ALog getLog(int month,int year) {
		return new MTLog();
	}
}
