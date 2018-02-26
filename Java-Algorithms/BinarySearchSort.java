// Imports that will be used for this exercise
import java.lang.Math;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.lang.Integer;

// Declaration of the class
public class BinarySearchSort{
	// Main method
	public static void main(String[] args){
		// Create the random array
		Scanner scanner = new Scanner(System.in);
		System.out.print("Size: ");
		int size = scanner.nextInt();
		ArrayList<Integer> randomArray = MakingList.createArray(size);
		
		// Creating the tools that will be used
		int randomCounter = 0;
		ArrayList<Integer> sortedArray = new ArrayList();
		
		// Begin Timer
		LocalDateTime startTime = LocalDateTime.now();
		
		// Place first item into new array
		sortedArray.add(randomArray.get(randomCounter));
		randomCounter++;
		
		// Sort second item into new array
		if (randomArray.get(randomCounter) < sortedArray.get(0)){
			sortedArray.add(0, randomArray.get(randomCounter));
		}
		else{
			sortedArray.add(randomArray.get(randomCounter));
		}
		
		System.out.println("Random Array: " + randomArray.toString());
		
		// Begin Sorting
		int first = 0;
		int last = sortedArray.size() - 1;
		int middle = (last + first)/2;
		
		while (randomCounter <= size){
			// Check to see if less than first value
			if (randomArray.get(randomCounter).compareTo(sortedArray.get(0)) < 0){
				sortedArray.add(0,randomArray.get(randomCounter));
			}
			// Check to see if greater than last value
			if (randomArray.get(randomCounter).compareTo(sortedArray.get(sortedArray.size() - 1)) > 0){
				sortedArray.add(randomArray.get(randomCounter));
			}
			// Binary search for proper placement
			while ((first <= last)){
				// If the input is the correct placement
				Integer randomValue = randomArray.get(randomCounter);
				Integer sortedValue = sortedArray.get(middle);
				if(((sortedArray.get(middle - 1).compareTo(randomValue)<0) && (sortedValue.compareTo(randomValue)>0)) || (randomValue.equals(sortedValue))){
					sortedArray.add(middle,randomValue);
					break;
				}
				// If the input is less than middle
				else if(randomValue.compareTo(sortedValue) < 0){
					last = (middle - 1);
					middle = ((last + first) / 2);
				}
				// If the input is greater than middle
				else{
					first = (middle + 1);
					middle = ((last + first) / 2);
				}
			}
			randomCounter++;
		}
		
		// Stop Timer
		LocalDateTime endTime = LocalDateTime.now();
		System.out.println("Sorted Array: " + sortedArray.toString());
		// Display Timer
		System.out.println("Binary Search Sort Duration:");
		System.out.println(Math.abs(endTime.getMinute() - startTime.getMinute()) + ":" + Math.abs(endTime.getSecond() - startTime.getSecond()) + "." + Math.abs((endTime.getNano() - startTime.getNano())/1000000));
	}
}
