package section7_1;

public class Tesla {
	
	long vinNumber;
	String model;
    static String origin = "USA";
	
	public void printTesla() {
		
		System.out.println(vinNumber + " " + model + " "+ origin);
	}
// we can not reach non static through static
	public static void accelaration() {
		
		System.out.println("Tesla have the best accelaration, origin of Tesla cars is "+origin);
		
	}
}
