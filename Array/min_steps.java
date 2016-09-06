package Array;

import java.util.ArrayList;

public class min_steps {
	
	public static int min_step(ArrayList<Integer> X, ArrayList<Integer> Y){
		int cost=0;
		for(int i=1;i<X.size();i++){
			cost+=Math.max(Math.abs(X.get(i)-X.get(i-1)), Math.abs(Y.get(i)-Y.get(i-1)));
		}
		return cost;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
