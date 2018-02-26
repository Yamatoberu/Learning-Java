import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

class BinarySearch{
    public static void main(String[] args){
        // Creating the random array
        ArrayList<Integer> rArray = new ArrayList();
        rArray.add(2);
        rArray.add(5);
        rArray.add(7);
        rArray.add(12);
        rArray.add(28);
        System.out.println(rArray.toString());
        
        // Prompt user for integer that you would like to be found
        Scanner scanner = new Scanner(System.in);
        System.out.print("Integer to find: ");
        int input = scanner.nextInt();
        
        // Begin Binary Search
        int first = 0;
        int last = rArray.size() - 1;
        int middle = (last + first)/2;
        int count = 0;
        while ((first <= last) && (count < 10)){
            System.out.println("First: " + first);
            System.out.println("Middle: " + middle);
            System.out.println("Last: " + last);
            System.out.println("Count: " + count);
            // If the input is less than middle
            if(input < rArray.get(middle)){
                last = (middle - 1);
                middle = ((last + first)/2);
                count++;
            }
            // Number found
            else if(input == middle){
                count++;
                break;
            }
            // Input greater than middle
            else{
                first = (middle + 1);
                middle = ((last + first)/2);
                count++;
            }
        }
        System.out.println(input + " was found at position " + (middle + 1));
	}
	
}
