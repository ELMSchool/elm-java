package section9_4;

import java.util.*;

public class HashMapTutorial {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("Lesson1", "Java");
		map.put("Lesson2", "Selenium");
		map.put("Lesson3", "SQL");
		
		map.putIfAbsent("Lesson1", "API");
		
		System.out.println(map.get("Lesson2"));	
		
		//map.remove("Lesson1");
		System.out.println(map);
		
		Set <String> keys = map.keySet();
		System.out.println(keys);
		
//		map.clear();
		
		
		System.out.println(map.containsKey("Lesson3"));
		
		map.replace("Lesson3", "Ruby");
		
		
		map.replace("Lesson1", "Java", "Python");
		System.out.println(map);
		
		
		Collection <String> values = map.values();
		System.out.println(values);
		
		System.out.println(map.size());
	}

}
