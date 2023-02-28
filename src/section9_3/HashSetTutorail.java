package section9_3;
import java.util.*;
public class HashSetTutorail {
	
	public static void main(String[] args) {
		
		//HashSet doesn't allow duplicates and it accepts only 1 null value
		HashSet<Integer> set = new HashSet<>();
		
		set.add(-5);
		set.add(81);
		set.add(81);
		set.add(81);
		set.add(1);
		set.add(0);
		set.add(24);
		set.add(1);
		set.add(null);
		set.add(null);
		set.add(null);
		
		System.out.println(set);
	
		
		//1.enahnce loop - for each loop
		
//		for (Integer num : set) {
//			
//			System.out.println(num);
//		}
//		
		//2. iterator
		Iterator it = set.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
	}

}
