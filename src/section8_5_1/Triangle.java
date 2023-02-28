package section8_5_1;

public class Triangle extends Shape implements Drawable{
	
	
	public  void perimeter() {
		
		System.out.println("this method calculates perimeter..");
	}

	 public void defaultMethod() {
		System.out.println("overriden default method");
	}
	public  void area() {
		
		System.out.println("this method calculates area..");
	}

	public static void staticMethodAbs() {
		System.out.println("dsaf");
	}
	

	 public static void staticMethod() {
		 
		 System.out.println("this is a static method comes from Triangle");
		 
	 }
	
	public void draw() {
		System.out.println("   *");
		System.out.println("  ***");
		System.out.println(" *****");
		System.out.println("*******");
		
	}
	

}
