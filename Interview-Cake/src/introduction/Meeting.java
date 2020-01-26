package introduction;

public class Meeting {
	
	private int startTime;
	private int endTime;
	
	public Meeting(int start, int end) {
		this.startTime = start;
		this.endTime = end;
	}
	
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	
}
