package section6_3;

public class StringBuilderMethods {
	
	public static void main(String[] args) {
		
		System.out.println(reverseString("USA"));
		
		
		
		StringBuilder sb1 = new StringBuilder ("java");
		
		
		//append()
		sb1.append(8+9);
		System.out.println(sb1);
		
		//insert()
		sb1.insert(0, "new ");
		System.out.println(sb1);
		
		//replace() 
		sb1.replace(8, 10, "16");
		System.out.println(sb1);
		
		//delete()
		
		
		
		//reverse()
		
		
	}
	public static String reverseString(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		return sb.toString();
	}

}
