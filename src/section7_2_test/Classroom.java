package section7_2_test;

//import section7_2_dev.Student;

//import section7_2_dev.*; //wildcard
import section7_2_dev.Student; // Using class name following package name
import static section7_2_dev.Student.*;
public class Classroom {

	
	public static void main(String[] args) {
	
		section7_2_dev.Student s1 = new section7_2_dev.Student();
		s1.id = 102;
		s1.name = "Kate";
		System.out.println(s1.name);
		System.out.println(s1.id);
		System.out.println(s1.schoolName);
		
		Student s3 = new Student("Jennifer", 305);
		System.out.println(s3.name);
		System.out.println(s3.id);
		System.out.println(s3.schoolName);
		System.out.println();
		
		Student s4 = new Student();
		System.out.println(s4.id);
		System.out.println(s4.name);
		System.out.println(s4.schoolName);
		
		Student s5 = new Student("Leyla", 707, "MIT");
		System.out.println(s5.name + " " + s5.id + " "+ s5.schoolName);
		
		print();
		
	}
}
