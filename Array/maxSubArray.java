package Array;

import java.util.List;

public class maxSubArray {
	private static int maxSubArray(final List<Integer> A){
		int sum=Integer.MIN_VALUE;
		int l_sum=0;
		for(int i:A){
			l_sum+=i;
			sum=Math.max(sum, l_sum);
		}
		if(l_sum<0){
			l_sum=0;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
