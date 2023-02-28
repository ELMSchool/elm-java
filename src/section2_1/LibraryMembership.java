package section2_1;

import java.util.Scanner;

public class LibraryMembership {
	
	public static void main (String []  args) {
		
		Scanner scan = new Scanner (System.in);
		
		//name
		String fullName;
		System.out.print("Please enter your full name: ");
		fullName = scan.nextLine();
		
		//gender
		char gender;
		System.out.print("Please enter your gender: ");
		gender = scan.next().charAt(0);
		
		//age
		int age;
		System.out.print("Please enter your age: ");
		age = scan.nextInt();
		
		//phone number
		long phoneNumber;
		System.out.print("Please enter your phone number (only numbers): "); 
		phoneNumber = scan.nextLong();
		
		
		//gpa
		double gpa;
		System.out.print("Please enter your gpa: ");
		gpa = scan.nextDouble();
		
		
		
		
		System.out.println("Your name is: " + fullName);
		System.out.println("Your gender is: " + gender);
		System.out.println("Your age is: " + age);
		System.out.println("Your phone number is: " + phoneNumber);
		System.out.println("Your gpa is: " + gpa);
	}

}
