import java.lang.Math;
import java.util.ArrayList;

class MakingList{	
	public static void main(String[] args){
		ArrayList rArray = new ArrayList();
		int limit = 5;
		for (int x = 1; x <= limit; x++){
			rArray.add((int) (Math.random() * 100));;
		}
		System.out.println(rArray);
	}
}