package section9_2_1;

public class Employee implements Comparable<Employee>{
	
	String name;
	int dateOfBirth;
	
	public Employee(String name, int dateOfBirth) {
		
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	
	public String toString () {
		
		return this.name + " " + this.dateOfBirth;
		
	}


	
	public int compareTo(Employee emp) {
	
		return (this.dateOfBirth - emp.dateOfBirth == 0) ?
				this.name.compareTo(emp.name) : this.dateOfBirth - emp.dateOfBirth;
	}
}
