package section7_1;

public class Student {
	//this class field, instance variable
	String name;
	long id;
	int age;

	public void insertData(String s, long l, int i) {
		
		name = s;
		id = l;
		age = i;
	}

	public void displayInfo() {
		
		System.out.println(name + " "+ id + " "+ age);
		
	}

}
