package section9_4;

import java.util.*;

public class LinkedHashMapTutorial {
	
	public static void main(String[] args) {
		
		LinkedHashMap <String, Integer> carPrices = new LinkedHashMap<>();
		carPrices.put("Mercedes", 60000);
		carPrices.put("BMW", 55000);
		carPrices.put("Toyota", 40000);
		carPrices.put("Bentley", 100000);
		carPrices.put(null , 1);
		
		
		System.out.println(carPrices);
		
		
	}

}
