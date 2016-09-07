package interview_bit;

import java.util.ArrayList;

public class find_permutation {

	/**
	 * @param args
	 */
    public ArrayList<Integer> findPerm(final String A, int B) {
    	ArrayList<Integer> res=new ArrayList<>();
    	int d=0,i;
    	for(int j=0;j<A.length();j++){
    		if(A.charAt(j)=='D')d++;
    	}
    	i=d+1;
    	res.add(i++);
    	for(int j=0;j<A.length();j++){
    		if(A.charAt(j)=='I'){
    			res.add(i++);
    		}
    		else{
    			res.add(d--);
    		}
    	}
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
