package interview_bit;

import java.util.Collections;
import java.util.List;

public class n_3_repeated_number {

	/**
	 * @param args
	 */
	public int repeatedNumber(final List<Integer> A) {
	    int num;
	    int n = A.size();
	    
	    Collections.sort(A);
	    
	    for (int i = 0; i < n;) {
	        int freq = 0;
	        num = A.get(i);
	        
	        while (i < n && A.get(i) == num) {
	            freq++;
	            i++;
	        }
	        
	        if (freq * 3 > n)
	            return num;
	        
	    }

	    return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
