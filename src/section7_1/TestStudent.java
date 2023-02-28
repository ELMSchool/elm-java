package section7_1;

public class TestStudent {
	
	
	public static void main(String[] args) {
		
		//Initializing through reference
		Student s1 = new Student();
		
		s1.name = "John";
		s1.id = 11111111;
		s1.age = 17;
		
		Student s2 = new Student();
		s2.name = "Kate";
		s2.id = 2222222;
		s2.age = 16;
		
		
		System.out.println(s1.name +" "+ s1.id + " "+ s1.age);
		
		System.out.println(s2.name +" "+ s2.id + " "+ s2.age);
		
		//Initializing through method
		Student s3 = new Student();
		s3.insertData("Joshua", 333333333, 18);
		s3.displayInfo();
		
		
		
	}

}
