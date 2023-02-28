package section3_1;

import java.util.Scanner;

public class SmartScanner {

	
	public static void main(String[] args) {
		
		
		double a;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your number");
		if (!scan.hasNextDouble()) {
			
			System.out.println("Come up with better thing");
			return;
		}
		a = scan.nextDouble();
		
	}
}
