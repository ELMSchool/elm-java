package section9_4;

import java.util.*;

public class HashMapExamples {

	public static void main(String[] args) {

		HashMap<String, Integer> carPrices = new HashMap<>();
		carPrices.put("Mercedes", 60000);
		carPrices.put("BMW", 55000);
		carPrices.put("Toyota", 40000);
		carPrices.put("Bentley", 100000);
		carPrices.put(null , 1);
		System.out.println(carPrices);
		//Find the average price for all cars	
		int sum = 0;
		//					[Mercedes, BMW, Toyota, Bentley]
		for (String key : carPrices.keySet()) {
			
			sum += carPrices.get(key); 
		}

		int averagePrice = sum/carPrices.size();
		System.out.println(averagePrice);


	}

}
