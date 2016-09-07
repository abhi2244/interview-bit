package interview_bit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class largest_number {

	/**
	 * @param args
	 */
	private static String larg_num(int[] a) {
		// TODO Auto-generated method stub
		   int n=a.length;
           String[] arr = new String[a.length];
           for(int i=0; i<a.length; i++){
               arr[i]=String.valueOf(a[i]);
               //System.out.println(arr[i]);
           }
        
           Arrays.sort(arr, new Comparator<String>(){
               public int compare(String a, String b){
                   return (b+a).compareTo(a+b);
               }
           });
        
           StringBuilder sb = new StringBuilder();
           for(String s: arr){
               sb.append(s);
           }
        
           while(sb.charAt(0)=='0'&&sb.length()>1)
               sb.deleteCharAt(0);
        
           return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println(larg_num(a));

	}



}
