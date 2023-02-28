package section9_2_1;

import java.util.Comparator;

public class ObjectComparator implements Comparator<Object>{

	
	public int compare(Object o1, Object o2) {
		
		if (o1 instanceof Person && o2 instanceof Person) {
			
			Person p1 = (Person) o1;
			Person p2 = (Person) o1;
			
			return p1.name.compareTo( p2.name);
		}
		
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		
		return e1.dateOfBirth - e2.dateOfBirth;
	}
}
