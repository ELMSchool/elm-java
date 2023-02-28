package section7_2_dev;

public class Teacher {

	String name;
	String speciality;
	static String school;

	public Teacher() {// number1

	}

	public Teacher(String name) {// number 2
		this.name = name;
	}

	public Teacher(String name, String speciality) {// number 3
		this(name);
		this.speciality = speciality;
	}

	public Teacher(String name, String speciality, String school) {// number 4
		this(name, speciality);
		this.school = school;
		printFields(this);
	}

	public static void print() {
		System.out.println("This static method prints ....");
	}
	
	public static void printFields(Teacher t) {
		
		System.out.println(t.name);
		System.out.println(t.speciality);
		System.out.println(t.school);
	}
	
	public Teacher createAutomatedTeacherCredentials() {
		
		this.name = "Fuad";
		this.speciality = "Java";
		this.school ="ELM";
		
		return this;
	}

}
