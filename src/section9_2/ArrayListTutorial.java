package section9_2;
import java.util.*;

public class ArrayListTutorial {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>(); //ArrayList has insertion order. Indexing starts from 0
		
		int num = 10;
		numbers.add(1);
		numbers.add(num);
		numbers.add(55);
		
//		System.out.println(numbers);
		
		
		Car car1 = new Car("Mercedes", "E300", 150);
		Car car2 = new Car("Toyota", "Camry", 145);
		Car car3 = new Car("BMW", "550", 155);
		
		ArrayList <Car> cars = new ArrayList<>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		
		
		
//		System.out.println(cars);
		
		
		//1. For loop
//		for (int i = 0; i< cars.size(); i++) {
//			
//			System.out.println(cars.get(i));
//		}
		
		
		//2. enhance (for each loop)
//		for (Car car : cars) {
//			System.out.println(car);
//		}
		
		
		//3.Iterator
		Iterator it = cars.iterator();
		
		//hasNext(), next(), remove()
		//[car1, car2, car3]
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
