package introduction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HiCal {

	public static void main(String[] args) {
		
		Meeting m1 = new Meeting(0,1);
		Meeting m2 = new Meeting(2,5);
		Meeting m3 = new Meeting(3,6);
		Meeting m4 = new Meeting(8,9);
		Meeting m5 = new Meeting(4,5);
		
		List<Meeting> unsortedMeetings = new ArrayList<>();
		unsortedMeetings.add(m1);
		unsortedMeetings.add(m2);
		unsortedMeetings.add(m3);
		unsortedMeetings.add(m4);
		unsortedMeetings.add(m5);
		
		List<Meeting> mergedRange = new ArrayList<>();
		mergedRange = mergeRanges(unsortedMeetings);
		
		for(Meeting item:mergedRange) {
			System.out.println("New Meeting("+item.getStartTime()+","+item.getEndTime()+")");
		}
		
	}
	
	public static List<Meeting> mergeRanges(List<Meeting> meetings){
		
		List<Meeting> sortedMeetings = new ArrayList<>();
		
		for(Meeting meeting:meetings) {
			Meeting meetingCopy = new Meeting(meeting.getStartTime(),meeting.getEndTime());
			sortedMeetings.add(meetingCopy);
		}
		
		Collections.sort(sortedMeetings, new Comparator<Meeting>() {

			@Override
			public int compare(Meeting m1, Meeting m2) {
				// TODO Auto-generated method stub
				return m1.getStartTime()-m2.getStartTime();
			}
			
		});
		
		List<Meeting> mergedMeetings = new ArrayList<>();
		
		mergedMeetings.add(sortedMeetings.get(0));
		
		for(Meeting sortedMeeting: sortedMeetings) {
			
			Meeting lastElement = mergedMeetings.get(mergedMeetings.size()-1);
			
			if((lastElement.getEndTime()) > (sortedMeeting.getStartTime())) {
				mergedMeetings.get(mergedMeetings.size()-1).setEndTime(sortedMeeting.getEndTime());
			}
			else {
				mergedMeetings.add(sortedMeeting);
			}
		}
		
		return mergedMeetings;
		
	}

}
