package section6_2;

public class LastInexOf {

	
	public static void main(String[] args) {
		
		
		
		String str = "Hello World";
		
		System.out.println(str.length());
		System.out.println(str.indexOf('e')); //2
		
		//lastIndexOf(char c) -> it returns us the index of last occurance of given char 
		//lastIndexOf(char c, untilIndex) """""""""""" it will only look for until given index
		//lastIndexOf(String substr) it returns us the index of last occurance of substring  
		//lastIndexOf(String substr, untilIndex)  it returns us the index of last occurance of substring until given index
		
		System.out.println(str.lastIndexOf('e')); //9
		
		System.out.println(str.lastIndexOf("l", 12));
		
		/*
		 * Write a program that finds if any of character is duplicated
		 * Create a method which accpets String and returns boolean
		 * */
		System.out.println(isDuplicated("abcdef"));
		
	}
	
	public static boolean isDuplicated (String str) {
		//java					//4
		for (int i = 0; i < str.length(); i++) {
			
			char c = str.charAt(i); //a
					//1					//3
			if (str.indexOf(c) != str.lastIndexOf(c)) {
				return true;
			}
			
		}
		
		return false;
	}
	

	
}
