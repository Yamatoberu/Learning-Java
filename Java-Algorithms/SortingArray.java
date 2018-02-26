import java.util.ArrayList;
import java.lang.Math;
import java.time.LocalDateTime;

class SortingArray{
	public static void main(String[] args){
		// Creating the array that will be sorted\
		ArrayList<Integer> randomArray = new ArrayList();
		randomArray.add(5);
		randomArray.add(3);
		randomArray.add(2);
		randomArray.add(6);
		randomArray.add(9);
		randomArray.add(12);
		
		// Displaying the old array
		System.out.println("Randomized Array: " + randomArray.toString());
		
		// Getting the start time
		LocalDateTime startTime = LocalDateTime.now();
		
		// Creating the new ArrayList that will be willed with the sorted value
		ArrayList<Integer> newArray = new ArrayList();
		
		// Placing the first item into the New Array
		newArray.add(randomArray.get(0));
		
		// Setting boolean to show if the item needs to be placed at the end of the array
		boolean isFound = false;
		
		for(int randomCount = 1; randomCount < randomArray.size(); randomCount++){
			isFound = false;
//			System.out.println("Random Value: " + randomArray.get(randomCount));
			for(int newCounter = 0; newCounter < newArray.size(); newCounter++){
//				System.out.println("New Value: " + newArray.get(newCounter));
				if (newArray.get(newCounter) >= randomArray.get(randomCount)){
					newArray.add(newCounter,randomArray.get(randomCount));
					isFound = true;
					break;
				}
			}
			if (!isFound){
				newArray.add(randomArray.get(randomCount));
			}
		}
		System.out.println("New Array: " + newArray.toString());
		
		// Getting the end time
		LocalDateTime endTime = LocalDateTime.now();
		
		// Displaying the duration
		System.out.println("Duration: " + (endTime.getNano() - startTime.getNano())/1000000 + " milliseconds");
	}
}