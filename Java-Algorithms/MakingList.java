import java.lang.Math;
import java.util.ArrayList;
import java.lang.Integer;

class MakingList{	
	public static ArrayList createArray(int size){
		// Initializing the array
		ArrayList<Integer> rArray = new ArrayList();
		
		// Create the array with random integers
		for (int x = 1; x <= size; x++){
			rArray.add((int) (Math.random() * 100));
		}
		
		// Returning the array
		return rArray;
	}
}