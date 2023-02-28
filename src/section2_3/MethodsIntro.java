package section2_3;
import section2_2.MethodComposition;
public class MethodsIntro {
	
	//this is the first method JVM(Java Virtual Machine) runs
	public static void main (String [] args ) {
		Math.max(5, 10);		
		System.out.println("Line number 8");
		MethodsIntro.myFirstMethod(); //redundant- no need extra wording
		myFirstMethod(); //if we are calling method within same class we don't need provide class name
		
		System.out.println("Line number 12");

		MethodComposition.main(null);
	}
	//this method has void return type
	public static void myFirstMethod() {
		
		System.out.println("This is my first method");
		
	}
	

}
