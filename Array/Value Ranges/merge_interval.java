package interview_bit;

import java.util.ArrayList;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class merge_interval {

	/**
	 * @param args
	 */

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<>();
        for (int i = 0; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (interval.end < newInterval.start) {
                // interval    newInterval
                // [      ] |
                //          | [      ]
                result.add(interval);
            } else if (newInterval.end < interval.start) {
                // newInterval   interval
                // [      ]    |
                //             | [      ]
                result.add(newInterval);
                result.addAll(intervals.subList(i, intervals.size()));
                return result;
            } else {
                // overlapping, enlarge newInterval to merge overlapping intervals
                int start = Math.min(newInterval.start, interval.start);
                int end = Math.max(newInterval.end, interval.end);
                newInterval.start = start;
                newInterval.end = end;
            }
        }
        result.add(newInterval);
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
