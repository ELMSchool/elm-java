package section6_1;

public class StringMethodsIntro {
	
	
	public static void main(String[] args) {
		
		//toUpperCase()  -> helps us to change all letters of String object to Upper case
		//toLowerCase()	 -> helps us to change all letters of String object to Lower case	
		//replace()		 -> it finds and replace instances of one String within another one	
		
		String str = "java";
		
		str.toUpperCase();   //=> "JAVA" -> Wrong!!! -> "java"
		str.replace("a", ""); // => jv  -> Wrong!!! -> "java"
		
		System.out.println(str);
		
//		str = str.toUpperCase();   //=> "JAVA" -> Wrong!!! -> "java"
		str = str.replace("a", ""); // => jv  -> Wrong!!! -> "java"
		System.out.println(str);
	}

}
