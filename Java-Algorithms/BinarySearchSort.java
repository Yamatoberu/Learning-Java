// Imports that will be used for this exercise
import java.lang.Math;
import java.util.ArrayList;
import java.time.LocalDateTime;

// Declaration of the class
public Class BinarySearchSort{
	// Main method
	public static void main(String[] args){
		// Create the random array
			// Use method that can be called and re-used
		
		// Begin Timer
		LocalDateTime startTime = LocalDateTime.now();
		
		// Place first item into new array
		
		// Sort second item into new array
		
		// Begin Loop
			// Check first item of the array (for smallest)
			// Check last item of the array (for largest)
			// Perform binary search where newArray[middle-1] <= randomArray[n] <= newArray[middle+1]
		// End Loop
		
		// Stop Timer
		LocalDateTime endTime = LocalDateTime.now();
		// Display Timer
		System.out.println("DURATION");
		System.out.println((endTime.getMinute() - startTime.getMinute()) + " minutes");
		System.out.println((endTime.getSecond() - startTime.getSecond()) + " seconds");
		System.out.println((endTime.getNano() - startTime.getNano())/1000000 + " milliseconds");
	}
}
