package section7_3;

public class Car {
	
	public String make = "Mercedes";
	
	protected int vinNumber = 10001;
	
	String keyCode ="A007";
	
	private long serialNumber = 2126487920; 
	
	public Car() {
		printCar();
	}
	
	private Car (String make, int vinNumber, String keyCode) {
		this.make = make;
		this.vinNumber = vinNumber;
		this.keyCode = keyCode;
	}

	protected void  printFields() {
		
		System.out.println("Fields");
	}
	
	public static void print() {
		
		System.out.println("Public static method print");
		
	}
	
	static void defaultMethods() {
		System.out.println("This default method");
	}
	
	private void printCar() {	
		System.out.println(this.make);
		System.out.println(this.vinNumber);
		System.out.println(this.keyCode);
		System.out.println(this.serialNumber);
	}
	
}
