package section9_2_1;
import java.util.*;
public class SortingOperations {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> numbers = new ArrayList<>();
		//List has insertion order
		numbers.add(5);
		numbers.add(-1);
		numbers.add(14);
		numbers.add(87);
		numbers.add(41);
		
		System.out.println(numbers);
		
		//Collections.sort(numbers);
		//numbers.sort(Comparator.naturalOrder()); // Aa - Zz    1 - infinty - ascending
		numbers.sort(Comparator.reverseOrder());  // Zz - Aa  100 - 1  descending
		System.out.println(numbers);
		
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		Employee emp1 = new Employee("Frank", 1990);
		Employee emp2 = new Employee("Jack", 1985);
		Employee emp3 = new Employee("Bruce", 1990);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
//		System.out.println(employees);
		
		Collections.sort(employees);
//		employees.sort(Comparator.naturalOrder());
//		System.out.println(employees);
		
		
		Person p1 = new Person("Fred", 30, "Male");
		Person p2 = new Person("Kate", 25, "Female");
		Person p3 = new Person("Brad", 42, "Male");
		Person p4 = new Person("Angelina", 27, "Female");
		Person p5 = new Person("Fred", 30, "Male");
		
		ArrayList <Person> people = new ArrayList<>();
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		
//		System.out.println(people);
//		Collections.sort(people, new ObjectComparator());
//		System.out.println(people);

		System.out.println(p1.equals(new Object()));
		
	}

}
