package section2_1;

import java.util.Scanner;

public class ScannerDef {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		short age = scan.nextShort();
		
		scan.nextLine();
		
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		
		
	
		
		System.out.println("Hi " + name + ", your age is "+age);

	}

}
