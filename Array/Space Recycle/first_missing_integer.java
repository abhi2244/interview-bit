package interview_bit;

import java.util.ArrayList;
import java.util.Iterator;

public class first_missing_integer {

	/**
	 * @param args
	 */
	public int firstMissingPositive(ArrayList<Integer> a) {
	    int[] A=new int[a.size()];
	    int t=0;
		   Iterator<Integer> iter = a.iterator();
		   for (int i=0; iter.hasNext(); i++) {       
		       A[i] = iter.next();                
		   }
	    int n=A.length;
        for(int i=0;i<n;i++){
            if(A[i]>0&&A[i]<=n){
                if(A[i]-1!=i&&A[A[i]-1]!=A[i]){
                    int temp=A[A[i]-1];
                    A[A[i]-1]=A[i];
                    A[i]=temp;
                    i--;
                }
            }
        }
        for(int i=0;i<n;i++)
            if(A[i]!=i+1)
                return i+1;
        return n+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
