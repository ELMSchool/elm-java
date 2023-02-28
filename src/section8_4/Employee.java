package section8_4;

public class Employee {
	
	String fullName;
	int id;
	Address address;
	
	public Employee(String fullName, int id, Address address) {
		
		this.fullName = fullName;
		this.id = id;
		this.address = address;
		
	}
	
	
	public String toString() {
		
		return this.fullName + "\n"+
			   this.id + "\n" +
			   this.address.toString();
		
	}
}
