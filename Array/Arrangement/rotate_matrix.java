package interview_bit;

import java.util.ArrayList;

public class rotate_matrix {

	/**
	 * @param args
	 */
	public void rotate(ArrayList<ArrayList<Integer>> A) {
		
        int n = A.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = A.get(i).get(j);
                A.get(i).set(j, A.get(j).get(i));
                A.get(j).set(i, temp);

            }
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = A.get(j).get(i);
                A.get(j).set(i, A.get(j).get(n - i - 1));
                A.get(j).set(n - i - 1, tmp);
            }
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
