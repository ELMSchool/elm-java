package section6_1;

public class StringConcatenation {
	
	public static void main(String[] args) {
		
		// + / concat() - 
		
		String str = "java";		
		System.out.println(str);
		
		
		
		str = str.concat(" is the best!").concat(" And I love it");
		
		System.out.println(str);		
		
		//substring() 
		
		String str2 = "The weather is beautiful.";
		
		String a = str2.substring(4,11);
		System.out.println(a);
		
	}

}
