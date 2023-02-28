package section2_2;

public class MethodComposition {
	
	public static void main (String [] args) {
		
		//find the max of given two numbers
		//increase the min number to the power of max
		//get square root of result 
		//print out the answer
		//do all these operations in single statement
		
		int num1 = 3;
		int num2 = 5;
														
		System.out.println (Math.round( Math.sqrt(	Math.pow ( Math.min(num1, num2),  Math.max(num1, num2)  ) ) ) );
		
		System.out.println(Math.max(num1, num2));
		
		
	}

}
