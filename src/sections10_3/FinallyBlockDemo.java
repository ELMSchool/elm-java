package sections10_3;

public class FinallyBlockDemo {
	
	
	public static void main(String[] args) {
		
	//1. JVM crashes
	//2. System.exit(0)	
		
		
		try {
			
			System.out.println(5/1);
			System.exit(0);
		}catch(ArithmeticException ae) {
			
			System.out.println("Catch block");
			
		}finally {
			
			System.out.println("This is a finally block");
		}
		
		
		System.out.println("Code out of try catch");
	}

}
