import java.util.ArrayList;
import java.lang.Math;

class SortingArray{
	public static void main(String[] args){
		// Creating the array that will be sorted\
		ArrayList randomArray = new ArrayList();
		randomArray.add(5);
		randomArray.add(3);
		randomArray.add(2);
		randomArray.add(6);
		randomArray.add(9);
		randomArray.add(12);
		
		// Creating the new ArrayList that will be willed with the sorted value
		ArrayList newArray = new ArrayList();
		
		// Placing the first item into the New Array
		newArray.add(randomArray.get(0));
		int randLength = randomArray.size();
		for(int randomCount = 1; randomCount < randLength; randomCount++){
			boolean found = false;
			int newLength = newArray.size();
			System.out.println("New Array Size: " + newLength);
			for(int newCount = 0; newCount < newLength; newCount++){
				int check1 = (int) randomArray.get(randomCount);
				int check2 = (int) newArray.get(newCount);
				System.out.println("Check 1: " + check1);
				System.out.println("Check 2: " + check2);
				if(check1 <= check2){
					newArray.add(newCount,randomArray.get(randomCount));
					System.out.println("TRUE");
					found = true;
				}
			}
			if (found = false){
				newArray.add(randomArray.get(randomCount));
			}
		}
	}
}

//WHY ISN'T NEWCOUNT ITERATING?!?!?!?!?!?!?!?!??!?!
