/* 
File:         Meeting.java
Created:      2018-02-22 3:26:29 AM 
Author name:  sathesh
*/

/**
 * @author sathesh
 *
 */
public class Meeting {
	
	private int startTime;
	private int endTime;
	/**
	 * @return the startTime
	 */
	public int getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the endTime
	 */
	public int getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Meeting [startTime=" + startTime + ", endTime=" + endTime + "]";
	}

}
