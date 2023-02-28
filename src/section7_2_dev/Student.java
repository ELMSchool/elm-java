package section7_2_dev;

public class Student {
	
	public String name;
	public int id;
	public static String schoolName = "ELM School";
	
	//default constructor / non-arg constructor
	public Student() {
		
		System.out.println("We are setting our default constructor");
		name = "John";
		id = 101;
		schoolName = "Best School";
		
	}
	
	//parameterized constructor
	public Student(String n, int i) {
		
		name = n;
		id = i;
	}
	
	//overloaded constructor
	public Student(String n, int i, String s) {
		name = n;
		id = i;
		schoolName = s;
		
	}
	
	public static void print() {
		System.out.println("This is coming from static method");
	}


}
