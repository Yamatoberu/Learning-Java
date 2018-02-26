import java.lang.Math;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Scanner;

class SortingRandomArray{	
	public static void main(String[] args){
		
		// Prompt the user for how many numbers they want to sorted
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many numbers to sort? ");
		int size = scanner.nextInt();
		
		ArrayList<Integer> randomArray = MakingList.createArray(size);
		
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
		System.out.println("Insertion Sort Duration:");
		System.out.println((endTime.getMinute() - startTime.getMinute()) + ":" + (endTime.getSecond() - startTime.getSecond()) + "." + ((endTime.getNano() - startTime.getNano())/1000000));
	}
}