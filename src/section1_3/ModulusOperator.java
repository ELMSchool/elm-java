package section1_3;

public class ModulusOperator {
	
	public static void main(String [] args) {
		
		// modulus operator
		int num1 = 10;		
		int num2 = 4;
		
		// 10 / 4 = 2 (2) -> 2 * 4 + 2 = 10
//		System.out.println(num1 % num2);
		
//		System.out.println(5 % 2);
		
		
		num1 = 15;
		num2 = 3;  // 15 / 3 = 5 (0) -> 5*3 + 0 =15
		
		int remainder = num1 % num2;
//		System.out.println(remainder);
		
		
		// division operator
		
		int n1 = 10;
		int n2 = 3;
		int result = n1 / n2;  //3
		int newRemainder = n1 % n2;
//		System.out.println("Answer: " + result);
//		System.out.println("Remainder: " +newRemainder);
		
		
		//special cases
//		System.out.println(5.0 % 2.0); 
//		System.out.println(20.0 / 0.0);
		
		
		//floating point variables
		// float, *double
		
		double d1 = 10;
		double d2 = 5;
		
		//System.out.println(d1 / d2);
		
		
		
		
	}

}
