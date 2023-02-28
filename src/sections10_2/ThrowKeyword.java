package sections10_2;

public class ThrowKeyword {
	
	public static void main(String[] args) {
		
		
		System.out.println(isOlderEnough(17));
		
		
	}

	
	public static boolean isOlderEnough(int age) {
		
		if (age<18) {
			
			throw new ArithmeticException(age+" is not enough to have alcohol"); //unchecked
			
		}
		
		return true;
		
		
	}
	
}
