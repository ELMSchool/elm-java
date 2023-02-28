package section7_2_dev;

public class Test {
	
	public static void main(String[] args) {
		
		//Static blocks get executed once and before anything else
		//non-static get executed every time we create an object of class 
		Laptop laptop1 = new Laptop("Mackbook Pro", 87441518);	
//		System.out.println(laptop1.id);
//		System.out.println(laptop1.model);
//		System.out.println(Laptop.company);
//		
		Laptop laptop2 = new Laptop("Mackbook Air", 18748741);
//		System.out.println(laptop2.id);
//		System.out.println(laptop2.model);
//		System.out.println(Laptop.company);
		
		Laptop laptop3 = new Laptop();
//		System.out.println(laptop3.id);
//		System.out.println(laptop3.model);
		
		
		Laptop laptop4 = new Laptop();
	}

}
