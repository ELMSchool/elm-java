package section6_1;

public class StringComparision {
	
	public static void main(String[] args) {
		
		//There are 3 ways of comparing Strings
		/*
		 * 1. equals() - 
		 * 	  equalsIgnoreCase() 	
		 * 
		 * 2. ==
		 * 
		 * 3.compareTo
		 * */
		String str1 = "java";
		String str2 = "JAVA";
		System.out.println(str1.equalsIgnoreCase(str2)); //true
		
		String word1 = "hello";
		String word2 = "hello";
		String word3 = new String("hello");
		String word4 = new String("hello");
		
		System.out.println(word1.equals(word2)); //true
		System.out.println(word1 == word2);  	 //true
		System.out.println(word1 == word3);   	 //false
		System.out.println(word1.equals(word3)); //true
		System.out.println(word3 == word4);		 //false
		
		
		String a = "A";
		String b = "A";
		
		System.out.println(b.compareTo(a));
		
	}

}
