package Array;

import java.util.ArrayList;

public class plus_one {
	
	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
	    
	    int size;
	    int carry = 1;
	    int num;
	    
	    size = A.size();
	    
	    for (int i = size - 1; i >= 0; i--) {
	        
	        num = A.get(i);
	        num += carry;
	        carry = 0;
	        
	        if (num == 10) {
	            num = 0;
	            carry = 1;
	        }
	        
	        A.set(i, num);
	        
	    }
	    
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    
	    if (carry == 1)
	        res.add(1);
	    
	    for (int x : A) {
	        if (x == 0 && res.size() == 0)
	            continue;
	        res.add(x);
	    }
	    
	    return res;
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
