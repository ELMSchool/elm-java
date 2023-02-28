package section2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class MathDemo {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 2;

		// Math.max() -> returns the biggest number out of 2 numbers
		System.out.println(Math.max(num1, num2));

		// Math.min() -> returns the smallest number out of 2 numbers
		int smallest = Math.min(num1, num2);
		System.out.println(smallest);

		// -2 and 7 -2 - 7 = -2 + (-7) = -9
		// -2 -1 0 1 2 3 4 5 6 7
		// Math.abs() -> returns positive version of given number
		int absValue = Math.abs(-2 - 7);
		System.out.println(absValue);

		// Math.pow() -> increase/decrease value to the power
		double toPower = Math.pow(num2, -2);
		System.out.println("To the power: " + toPower);

		// Math.sqrt() -> returns square root value of given number
		double squareRoot = Math.sqrt(10);
		System.out.println("Square root: " + squareRoot);

		// Math.random() -> returns random value in between 0.0 and 1.0
		double random100 = Math.random() * 100;
		System.out.println("Random * 100: " + random100);

		// Math.round()
		long rounded = Math.round(random100);
		System.out.println("Rounded random value: " + rounded);

		System.out.println(Math.round(Math.random() * 100));
	}

}
