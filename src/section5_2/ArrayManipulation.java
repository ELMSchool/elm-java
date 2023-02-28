package section5_2;
import java.util.Arrays;
public class ArrayManipulation {
	
	public static void main(String[] args) {
		
		/*
		 * Given a double array
		 * Write a code that increase each element of given array to square of it
		 * Then assign those to corresponding indexes
		 * */
		//       		  0		1	 2	  3			
		double [] arr = {3.0, 5.0, -8.0, 10};
		
		for (int i = 0; i<arr.length; i++) {
			
			arr[i] = Math.pow(arr[i], 2);
			
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	
		
	}

}
