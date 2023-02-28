package section9_4;

import java.util.*;

public class TreeMapTutorial {

	public static void main(String[] args) {
		
		
		TreeMap<String, Integer> carPrices = new TreeMap<>();
		carPrices.put("Mercedes", 60000);
		carPrices.put("BMW", 55000);
		carPrices.put("Toyota", 40000);
		carPrices.put("Bentley", 100000);
		//carPrices.put(null , 1);
		carPrices.put("Chevy" , null);
		carPrices.put("Ford" , null);

		
		System.out.println(carPrices.descendingMap());

		
	}
	
}
