package interview_bit;

import java.util.ArrayList;
import java.util.Collections;

public class hotel_booking {

	/**
	 * @param args
	 */
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int ar=0, de=0, nos=0,satisfy=0;
        while(ar<arrive.size() && de<depart.size()){
            if(arrive.get(ar)<depart.get(de)){
                ar++;
                nos++;
                satisfy= Math.max(nos,satisfy);
            }else{
                de++;
                nos--;
            }
        }
        return (satisfy<=K)?true:false;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
