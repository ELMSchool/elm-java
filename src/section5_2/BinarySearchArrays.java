package section5_2;

import java.util.Arrays;

public class BinarySearchArrays {

	public static void main(String[] args) {

		//If you want to run binarySearch on an array. That Array must be sorted
		//If value is in given array this method will return position(index) of value
		//Otherwise it will return a negative value
		//Formula for missing value index return from array => -possibleIndex - 1 : (possibleIndex + 1) * -1
		//Full search - Arrays.binarySearch(array, value)
		//Partial search - Arrays.binarySearch(array, from(in), until(ex), value) 
		
		int[] numbers = { 4, 12, 3, 12, 12,61, 17, -9 };
		Arrays.sort(numbers);
		//[-9, 3, 4, 12, 17, 18, 61]
		int index = Arrays.binarySearch(numbers,12);
		System.out.println(index);
		
		
		
		System.out.println(Arrays.toString(numbers));
		//[-15, -9, 3, 4, 12, 17, 61]
//		System.out.println(Arrays.binarySearch(numbers, -15));
       // -6 -1 = -6 + (-1) = -7   :    (6+1) * -1 = > -7
		
	}

	public static int search(int [] arr, int target) {
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == target) {
				
				return i;
			}
		}

		return -1;
	}
}
