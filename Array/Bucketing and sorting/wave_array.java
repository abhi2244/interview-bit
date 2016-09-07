package interview_bit;

import java.util.ArrayList;
import java.util.Collections;

public class wave_array {

	/**
	 * @param args
	 */
	private void swap(ArrayList<Integer> A, int i, int j) {
	    int temp = A.get(i);
	    A.set(i, A.get(j));
	    A.set(j, temp);
	}
	
	public ArrayList<Integer> wave(ArrayList<Integer> A) {    
	    Collections.sort(A);
	    int n = A.size();
	    
	    for (int i = 2; i <= n; i += 2) {
	        swap(A, i - 2, i - 1);
	    }
	    
	    return A;    
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
