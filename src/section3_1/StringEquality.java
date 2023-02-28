package section3_1;

public class StringEquality {
	
	
	public static void main(String[] args) {
		
		
		//System.out.println(3 > 5); // false
		// ==
		// !=
		
		String lesson1 = "java";
		String lesson2 = "selenium";
		
		System.out.println(lesson1 == lesson2); //false
		System.out.println(lesson1 != lesson2);	//true
		
		//equals()
		System.out.println(lesson1.equals(lesson2)); //false
		System.out.println(!lesson1.equals(lesson2)); //true
		
		String lesson1_2 = "java";
		
		System.out.println(lesson1.equals(lesson1_2));
		
	}

}
