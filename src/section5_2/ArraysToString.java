package section5_2;

import java.util.Arrays;

public class ArraysToString {
	
	public static void main(String[] args) {
		
		//Arrays.toString() - convert given array into String
		int [] a = {1,3,6,21};
		System.out.println(customToString(a));
		System.out.println(Arrays.toString(a));
		
	}
	
	/**
	 * This method converts int [] into String 
	 * @param arr
	 * @return
	 */
	public static String customToString(int [] arr) {
		
		String str = ""; //will be returned, for now initialized as an empty String
		
		str += "[";     // [1, 3, 6, 21]			
		//{1,3,6,21}
		for (int i = 0; i<arr.length; i++) {
			
			if (i == arr.length-1) {
				
				str += arr[i]+ "]"; 
				break;
			}
			
			str += arr[i] + ", "; 
			
		}
		
		return str;
		
	}
}
