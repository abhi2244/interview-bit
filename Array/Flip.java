package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Flip {
    public static ArrayList<Integer> flip(String A) {
    	
        int n = A.length();

        //build new array of 1s and -1s
        ArrayList<Integer> B=new ArrayList();
        for(int i = 0; i < n; i ++)
                if(A.charAt(i) == '1') B.add(-1);
                else B.add(1);

        //pair storing the answer
        ArrayList<Integer> ans = new ArrayList<>();

        int best_till_now = 0,best_ending_here = 0, l = 0;
        for(int i = 0; i< n; i++) {
                if (best_ending_here + B.get(i) < 0) {
                        l = i + 1;
                        best_ending_here = 0;
                }
                else best_ending_here += B.get(i);
                if (best_ending_here > best_till_now) {
                        best_till_now = best_ending_here;
                        ans.add(l);
                        ans.add(i);
                }
                else
                	ans.add(Integer.MAX_VALUE);
                	ans.add(Integer.MAX_VALUE);
                
        }
        ArrayList<Integer> res = new ArrayList<>();
        if(ans.get(0)==Integer.MAX_VALUE){
        	res.add(0);
        	res.add(0);
        }
        else
        	res.add(ans.get(0)+1);
        	res.add(ans.get(1)+1);
        res.remove(2);
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		ArrayList<Integer> res=flip(s);
		//System.out.println(res.size());
		for(int i:res){
			System.out.println(i);
		}
	}

}
