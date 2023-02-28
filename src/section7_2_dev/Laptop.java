
package section7_2_dev;
import java.util.Scanner;
public class Laptop {
	
	
	String model;
	long id;
	static String company;
	
	static {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter company name:");
		company = scan.next();//initializing
	}
	
	{
	
		System.out.println("non static block");
		model = "Air";
		id = 1111111111;
		company = "Dell"; //updating
		
	}
	
	public Laptop() {
		
		System.out.println("Constructor");
		
	}

	public Laptop(String m, long i) {
		System.out.println("Contructor");
		model = m;
		id = i; 
	}
	
	
	public static void printLaptop() {
		
		System.out.println("Printing info about laptop");
		
	}
	


}
