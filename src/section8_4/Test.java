package section8_4;

public class Test {
	
	public static void main(String[] args) {
		
		
		Address address = new Address("Elm", 12, "Alexandria", "VA", 25551);
		
		Employee emp = new Employee("Jeff Johnson", 773, address);
		
		System.out.println(emp.toString());
		
	}

}
