package section1_3;

public class StringOperators {
	
	public static void main(String [] args) {
		
		int num1 = 10;
		int num2 = 4;
		
//		System.out.println(num1 + num2); //14
//		System.out.println(num1 - num2); //6
//		System.out.println(num1 * num2); //40
//		System.out.println(num1 / num2); //2
//		System.out.println(num1 % num2); //2
		
		char c1 = 'a'; //97
		char c2 = 'b'; //98
		
//		System.out.println(c1 % c2);
		
		//String (non-primitive) -> starts with capital letter (Upper case)
		
		String firstName = "Will";
		String lastName = "Smith";
		
		//doesn't compile 
//		System.out.println(firstName - lastName);
//		System.out.println(firstName * lastName);
//		System.out.println(firstName / lastName);
//		System.out.println(firstName % lastName);
		
		// + -> overloaded operator. overload -> same function(operator) but different action
		// + -> helps us to concatenate Strings
		
		
		System.out.println(firstName + " " + lastName + '!'); //Will Smith
		
		System.out.println("His first name is " + firstName); //"His first name is Will"
		System.out.println("His full name is " + firstName + " " + lastName); //His full name is Will Smith

		
		//Any primitive type that follows String becomes String
		System.out.println("His age is " + 25); // "His age is " + "25"
		System.out.println("Year " + 2000 + 22); //"Year " + "2000" + "22"
		System.out.println("Year " + 20 + 22); //"Year " + "20" + "22"
		System.out.println("Year " + (2000 + 22) ); //"Year " + "2022"
		
		//-----------------------------------------------------------------
		
		System.out.println(1997 + " is his birth year");
		System.out.println(19 + 97 + " is his birth year"); //116 is his birth year
		System.out.println(1900 + 97 + " is his birth year"); //1997 is his birth year
		
		System.out.println(2022 - 1997 + " is his age");
		System.out.println(2022 % 1997 + " is his age");
		
		
	}

}
