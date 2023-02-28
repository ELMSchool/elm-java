package section9_3;

import java.util.*;

public class LinkedHashSetTutorial {

	public static void main(String[] args) {
		
		//Allows only unique values like HashSet
		//Allows only single null value HashSet
		//LinkedHashSet maintains insertion order unlike HashSet
		
		
		LinkedHashSet<String> lessons = new LinkedHashSet<>();
		
		lessons.add("java");
		lessons.add("python");		
		lessons.add("selenium");
		lessons.add("javascript");
		lessons.add("java");
		lessons.add(null);
		lessons.add(null);
		ArrayList <String> list  = new ArrayList<>(lessons);
		
		System.out.println(list);
	}

}
