package sections10_2;

public class CustomExceptionTutorial {
	
	public static void main(String[] args) {
		
		isValidAge(-1);
	}
	
	
	public static void isValidAge(int age)  {
		
		if (age< 0) {
			
			throw new AgeException("Invalid Age");
			
		}else {
			
			System.out.println("Valid");
		}
		
	}

}
