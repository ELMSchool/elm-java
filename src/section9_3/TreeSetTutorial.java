package section9_3;
import java.util.*;

public class TreeSetTutorial {
	
	
	public static void main(String[] args) {
		
		//TreeSet allows only unique values like HashSet and LinkedHashSet
		//TreeSet doesn't allow any null values unlike HashSet and LinkedHashSet
		//TreeSet maintains ascending order unlike HashSet and LinkedHashSet
		
		
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(5);
		numbers.add(-6);
		numbers.add(13);
		numbers.add(94);
		numbers.add(8);
		numbers.add(8);
		numbers.add(8);
		

		

		
		
		System.out.println(numbers.descendingSet());
	}

}
