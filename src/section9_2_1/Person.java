package section9_2_1;

public class Person {
	
	String name;
	int age;
	String gender;
	
	
	public Person (String name, int age, String gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	
	}
	
	
	public String toString() {
		
		return this.name + " " + this.age+ " " + this.gender;  
		
	}
	
	public boolean equals(Object o) {
		
		if(this == o) {
			
			return true;
		}
		
		if (o == null || getClass() != o.getClass()) {
			
			return false;
		}
		
		Person other = (Person) o;
		
		return this.name.equals(other.name) && 
				this.age == other.age && 
				this.gender.equals(other.gender);
		
	}
	

}
