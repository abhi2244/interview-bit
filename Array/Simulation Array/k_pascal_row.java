package interview_bit;

import java.util.ArrayList;
import java.util.Scanner;

public class k_pascal_row {

	/**
	 * @param args
	 */
	public static ArrayList<Integer> getRow(int rowIndex) {
		
    	ArrayList<Integer> result = new ArrayList<Integer>();
     
    	if (rowIndex < 0)
    		return result;
     
    	result.add(1);
    	for (int i = 1; i <= rowIndex; i++) {
    		for (int j = result.size() - 2; j >= 0; j--) {
    			result.set(j + 1, result.get(j) + result.get(j + 1));
    		}
    		result.add(1);
    	}
    	return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		ArrayList<Integer> res=new ArrayList<>();

		res=getRow(n);
		for(int i:res){
			System.out.println(i);
		}
	}
}

