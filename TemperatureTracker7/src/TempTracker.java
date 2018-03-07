/* 
File:         TempTracker.java
Created:      2018-03-02 4:37:01 PM 
Author name:  sathesh
*/

/**
 * @author sathesh
 *
 */
public class TempTracker {
	
	
	private int minTemp = Integer.MIN_VALUE;
	private int maxTemp = Integer.MAX_VALUE;
	
	public void insert(int temp)
	{
		minTemp = Math.min(temp, minTemp);
		maxTemp = Math.max(temp, maxTemp);
	}

	
	/**
	 * @return the minTemp
	 */
	public int getMinTemp() {
		return minTemp;
	}

	/**
	 * @param minTemp the minTemp to set
	 */
	public void setMinTemp(int minTemp) {
		this.minTemp = minTemp;
	}

	/**
	 * @return the maxTemp
	 */
	public int getMaxTemp() {
		return maxTemp;
	}

	/**
	 * @param maxTemp the maxTemp to set
	 */
	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
