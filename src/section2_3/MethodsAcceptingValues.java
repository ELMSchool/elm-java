package section2_3;

public class MethodsAcceptingValues {
	
	
	public static void main(String[] args) {
		
//		methodWithoutParamater();
//		methodAcceptsStringParameter("Hi");
		printAge(5);
		
	}
	
	
	//public static void methodWithoutParamater() => method signature
	public static void methodWithoutParamater() {
		
		System.out.println("Hi there");
		
	}
	
	public static void methodAcceptsStringParameter(String argument) {
		
		String localString = argument;
		System.out.println(localString);
	}
	
	public static void printAge(int age) {
		
		System.out.println("Persone age: "+ age);
		
	}
	

}
