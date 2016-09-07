package interview_bit;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class max_distance {

	/**
	 * @param args
	 */
	public int maximumGap(final List<Integer> a) {
	       int[] arr=new int[a.size()];
		   Iterator<Integer> iter = a.iterator();
		   for (int i=0; iter.hasNext(); i++) {       
		       arr[i] = iter.next();                
		   }
		   int n= arr.length;
		   int maxDiff=-1;
		   if(n==1){
			   maxDiff=0;
		   }
		   else{
			   int i, j;
  
			   int RMax[] = new int[n];
			   int LMin[] = new int[n];

			   LMin[0] = arr[0];
			   for (i = 1; i < n; i++)
				   LMin[i] = Math.min(arr[i], LMin[i - 1]);

			   RMax[n - 1] = arr[n - 1];
			   for (j = n - 2; j >= 0; j--)
				   RMax[j] = Math.max(arr[j], RMax[j + 1]);
  

			   i = 0; j = 0; maxDiff = -1;
			   while (j < n && i < n) 
			   {
				   if (LMin[i] <= RMax[j]) 
				   {
					   maxDiff = Math.max(maxDiff, j - i);
					   j = j + 1;
				   } 
				   else
					   i = i + 1;
			   }
		   }


     return maxDiff;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
