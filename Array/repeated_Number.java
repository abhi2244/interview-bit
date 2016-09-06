package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class repeated_Number {
	public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
	    
	    ArrayList<Integer> res = new ArrayList<>();
	    
	    Collections.sort(A);
	    int n = A.size();
	    int rep = -1;
	    int miss = -1;
	    long sum = A.get(0);
	    
	    for (int i = 1; i < n; i++) {
	        if (A.get(i).intValue() == A.get(i - 1).intValue()) {
	            rep = A.get(i);
	        }
            sum += A.get(i);
	    }
	    
	    miss = (int) ((1L * n * (1L * n + 1)) / 2 - sum + rep);
	    
	    res.add(rep);
	    res.add(miss);
	    
	    return res;	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
