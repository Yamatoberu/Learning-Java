import java.lang.Math;
import java.util.ArrayList;
import java.time.LocalDateTime;

class SortingRandomArray{	
	public static void main(String[] args){
		ArrayList<Integer> randomArray = new ArrayList();
		int limit = 1000000;
		for (int x = 1; x <= limit; x++){
			randomArray.add((int) (Math.random() * 100));;
		}
		
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
		
		// Getting the end time
		LocalDateTime endTime = LocalDateTime.now();
		
		// Displaying the duration
		System.out.println("DURATION");
		System.out.println((endTime.getMinute() - startTime.getMinute()) + " minutes");
		System.out.println((endTime.getSecond() - startTime.getSecond()) + " seconds");
		System.out.println((endTime.getNano() - startTime.getNano())/1000000 + " milliseconds");
	}
}