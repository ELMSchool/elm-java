package section2_1;

import java.util.Scanner;

public class SimpleCalculator {
	
	
	public static void main (String []  args) {
		
		int num1;
		int num2;
		int result;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter first number: ");
		num1 = scanner.nextInt();
		
		
		System.out.print("Enter second number: ");
		num2 = scanner.nextInt();
		
		//adding numbers
		result = num1 + num2;
		System.out.println("Here is the sum of these numbers: " + result);
		
		
		//subtracting numbers
		result = num1 - num2;
		System.out.println("Here is the subtraction of these numbers: " + result);
		
		
		//dividing numbers
		result = num1 / num2;
		System.out.println("Here is the division of these numbers: " + result);
		
		//multiplication numbers
		result = num1 * num2;
		System.out.println("Here is the multiplication of these numbers: " + result);
		
		
		//modulus 
		result = num1 % num2;
		System.out.println("Here is the modulus of these numbers: " + result);
		
	}

}
