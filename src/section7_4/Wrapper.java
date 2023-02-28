package section7_4;

public class Wrapper {
	
	public static void main(String[] args) {
		
		int year = 0;
		
		String str = new String("java");
		
		//Wrapper Classes
		//Which are object representations of primitives
		
		
		//Find out when academic year ends 
		//It ends 1 year after it start
		String str1 = "Academic year starts in 2022";
		String str2 = "Academic year ends in";
		System.out.println(str1);
		System.out.println(str2 + " "+ findYear(str1));
		
	}
	
	public static int findYear(String str) {
		
		String giveYear = str.substring(str.length()-4);
		
		int year = Integer.parseInt(giveYear);
		
		return year+1;
		
	}

}
