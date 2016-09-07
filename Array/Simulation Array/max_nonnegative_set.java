package interview_bit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class max_nonnegative_set {

	/**
	 * @param args
	 */
	public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    long maxSum = 0;
	    long newSum = 0;
	    ArrayList<Integer> maxArray = new ArrayList<Integer>();
	    ArrayList<Integer> newArray = new ArrayList<Integer>();
	    for (Integer i : a) {
	        if (i >= 0) {
	            newSum += i;
	            newArray.add(i);
	        } else {
	            newSum = 0;
	            newArray = new ArrayList<Integer>();
	        }
	        if ((maxSum < newSum) || ((maxSum == newSum) && (newArray.size() > maxArray.size()))) {
	            maxSum = newSum;
	            maxArray = newArray;
	        }
	    }
	    return maxArray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> res=new ArrayList<>();
		for (int index = 0; index < arr.length; index++)
		{
		    al.add(arr[index]);
		}
		res=maxset(al);
		for(int i:res){
			System.out.println(i);
		}
	}

}
