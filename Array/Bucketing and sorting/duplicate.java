package interview_bit;

import java.util.Iterator;
import java.util.List;

public class duplicate {

	/**
	 * @param args
	 */
	public int repeatedNumber(final List<Integer> a) {
	       int[] arr=new int[a.size()];
		   Iterator<Integer> iter = a.iterator();
		   int t=0;
		   for (int i=0; iter.hasNext(); i++) {       
		       arr[i] = iter.next();                
		   }
	        for(int i = 0; i < arr.length; i++)
	        {
	            if(arr[Math.abs(arr[i])-1] > 0)
	                arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
	            else
	                t=Math.abs(arr[i]);
	        }
	        return t;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
