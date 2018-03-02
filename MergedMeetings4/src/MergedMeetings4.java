import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 
File:         MergedMeetings4.java
Created:      2018-02-22 3:28:10 AM 
Author name:  sathesh
*/

/**
 * @author sathesh
 *
 */
public class MergedMeetings4 {
	

	public static List<Meeting> getMergedMeetings(List<Meeting> input)
	{
		Comparator<Meeting> com = new Comparator<Meeting>() {

			@Override
			public int compare(Meeting o1, Meeting o2) {
				// TODO Auto-generated method stub
				
				if(o1.getStartTime() > o2.getStartTime())
				{
					return 1;
				}
				else
				{
					return -1;
				}
				
			}
		};
		
		// Now the input is sorted on start time
		Collections.sort(input,com);
		
		System.out.println(input);
		
		List<Meeting> mergedMeetingList = new ArrayList<Meeting>();
		mergedMeetingList.add(input.get(0));
		
		
		for(Meeting currentMeeting: input)
		{
			Meeting lastMergedMeeting = mergedMeetingList.get(mergedMeetingList.size()-1);
			
			if(currentMeeting.getStartTime()<=lastMergedMeeting.getEndTime())
			{
				lastMergedMeeting.setEndTime(Math.max(currentMeeting.getEndTime(), lastMergedMeeting.getEndTime()));
			}
			
			else
			{
				mergedMeetingList.add(currentMeeting);
			}
		}
		
	
		return mergedMeetingList;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Meeting> input = new ArrayList<Meeting>();
		Meeting m0 = new Meeting();
		m0.setStartTime(0);
		m0.setEndTime(1);
		input.add(m0);
		Meeting m1 = new Meeting();
		m1.setStartTime(3);
		m1.setEndTime(5);
		input.add(m1);
		Meeting m2 = new Meeting();
		m2.setStartTime(4);
		m2.setEndTime(8);
		input.add(m2);
		Meeting m3 = new Meeting();
		m3.setStartTime(10);
		m3.setEndTime(12);
		input.add(m3);
		Meeting m4 = new Meeting();
		m0.setStartTime(9);
		m0.setEndTime(10);
		input.add(m4);
		
		List<Meeting> output = getMergedMeetings(input);
		
		System.out.println(output);
		

		

	}

}
