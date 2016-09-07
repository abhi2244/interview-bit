package interview_bit;

import java.util.ArrayList;

public class anti_diagonals {

	/**
	 * @param args
	 */
	public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
	    int l = A.size();
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 2 * l - 1; ++i) {
    	    int offset =0;
    	    if(i < l)
    	    	offset= 0;
    	    else
    	    	offset=i - l + 1;
	        ArrayList<Integer> row = new ArrayList<Integer>();
    	    for (int j = offset; j <= i - offset; ++j) {
		        row.add(A.get(j).get(i - j));
    	    }
	        res.add(row);
        }
        return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
