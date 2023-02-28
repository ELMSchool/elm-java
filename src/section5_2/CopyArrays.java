package section5_2;

import java.util.Arrays;

public class CopyArrays {

	public static void main(String[] args) {
		
		
		//Arrays.copyOf(array, size) -> copies the array with given size
		String [] lessons = {"Java", "Selenium", "SQL", "Api"};
//		System.out.println(Arrays.toString(lessons));
//		System.out.println(Arrays.toString(copyArray(lessons)));
		String [] copiedArray = Arrays.copyOf(lessons,2);
//		System.out.println(Arrays.toString(copiedArray));
		int [] numbers = {10, 20, 30, 40, 50, 60};
		int [] copiedNumbers = Arrays.copyOf(numbers, numbers.length);
//		System.out.println(Arrays.toString(copiedNumbers));
		
		//Arrays.copyOfRange(array, from, until) from is included until is excluded
		int [] copiedRange = Arrays.copyOfRange(numbers, 0,6);
		System.out.println(Arrays.toString(copiedRange));
	
	}

	/**
	 * This methods copies given String array
	 * @param orignal
	 * @return
	 */
	public static String[] copyArray(String[] orignal) {

		String[] copied = new String[orignal.length];

		for (int i = 0; i < orignal.length; i++) {

			copied[i] = orignal[i];
		}

		return copied;
	}

}
