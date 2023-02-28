package section6_2;

import java.util.Arrays;

public class ToCharArray {

	public static void main(String[] args) {

		//toCharArray(String str) -> turns into char array and returns us char array

		String str = "selenium";
		
		char [] arr = str.toCharArray();
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(turnToCharArray(str)));
		//			[s, e, l, e, n, i, u, m]
		for(char c : str.toCharArray() ) {
			
			System.out.println(c);
		}
		
		
		
	}

	public static char[] turnToCharArray(String str) {

		char[] chars = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {

			chars[i] = str.charAt(i);

		}

		return chars;

	}

}
