package interview_bit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class Interval {
//    int start;
//    int end;
//    Interval() { start = 0; end = 0; }
//    Interval(int s, int e) { start = s; end = e; }
//}

public class merge_overlaping_intervals {

	/**
	 * @param args
	 */
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> result = new ArrayList<>();
        
        Collections.sort(intervals, new Comparator<Interval>(){

            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start != o2.start) {
                    return o1.start - o2.start;
                } else {
                    return o1.end - o2.end;
                }
            }
        });
        
        for (int i = 0; i < intervals.size() - 1; i++) {
            Interval i1 = intervals.get(i);
            Interval i2 = intervals.get(i + 1);
            if (i1.end < i2.start) {

                result.add(i1);
            } else {

                i1.start = Math.min(i1.start, i2.start);
                i1.end = Math.max(i1.end, i2.end);
                intervals.remove(i + 1);
                i--;
            }
        }

        result.add(intervals.get(intervals.size() - 1));
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
