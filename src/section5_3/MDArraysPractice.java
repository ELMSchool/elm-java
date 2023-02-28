package section5_3;
import java.util.Arrays;
public class MDArraysPractice {
	
	
	public static void main(String[] args) {
		
		//deepToString() - helps to convert multi-dimensional arrays to String 
		
		int [][] numbers = new int [2][];
		
		int [] oddNumbers = {1, 3, 5};
		int [] evenNumbers =  {2, 4, 6, 8};
		int [] negativeNumbers = {-1,-10, -5};
		
		numbers [0] = evenNumbers;
		numbers [1] = oddNumbers;
		
		for (int i = 0; i<numbers.length; i++) {
			
			System.out.println(Arrays.toString(numbers[i]));
			
		}
		
		
		
		
	}

}
