package section9_2_1;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{

	
	public int compare(Person p1, Person p2) {
		return p1.name.compareToIgnoreCase(p2.name);
	}

}
