package section7_3;

import static section7_3.Car.*;

public class Showroom  extends Car{
	
	
	public static void main(String[] args) {
		//public (visible from anywhere)
		Car car = new Car();
		
		System.out.println(car.make);
		
		print();
		
//		protected(visible only with same package 
//		and subclasses out of package)
		System.out.println(car.vinNumber);
		
		car.printFields();
		
		
//		default(aka no-access modifier)
//		visible only within same package or same class
		System.out.println(car.keyCode);
		defaultMethods();
		
//		private -> visible only within same class
//		Car car2 = new Car("", 12342, "asdf");
		
	}
	
	

}
