package interview_bit;

import java.util.ArrayList;

public class next_permutation {

	/**
	 * @param args
	 */
    private void swap(ArrayList<Integer> array, int i, int j) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }
	public void nextPermutation(ArrayList<Integer> A) {
        int start = A.size() - 1;
        while (start > 0 && A.get(start - 1) >= A.get(start)){
            start--;
        }
        if (start > 0) {
            int end = A.size() - 1;
            while (A.get(end) <= A.get(start - 1)) {
                end--;
            }
            swap(A, start - 1, end);
        }
        for (int i = start; i < (start + A.size()) / 2; i++) {
            swap(A, i, A.size() - 1 + start - i);
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
