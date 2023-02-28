package sections10_3;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		System.out.println(division(6, 0));
		System.out.println("fghdfh");
		
	}
	
	//checked exceptions needs be handled
	public static int division(int a , int b) {
		
		int result = 0;
		
		try {
			
			result = a/b; //exception occurs here (ArithmeticException)
			System.out.println("some code");
			
		}catch(RuntimeException ae) {
			
			System.out.println("Can't divide by 0");
			//ae.printStackTrace();
			
		}
		
		return result;
	}
	

}
