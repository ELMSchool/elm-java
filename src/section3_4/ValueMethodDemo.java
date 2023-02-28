package section3_4;

public class ValueMethodDemo {
	
	
	public static void main(String[] args) {
		
//		System.out.println(Math.max(0, -3)); 
//		System.out.println(findTheLargest(0, -3));
		System.out.println(positiveOrNegative(1));
	}
	
	public static int findTheLargest(int num1, int num2) {
		
		int largest;
		
		if (num1> num2) {
			
			largest = num1;
		}else {
			
			largest = num2;
			
		}
		
		
		return largest;
	}
	
	public static String positiveOrNegative(int number) {
		
		if (number > 0) {
			
			return "positive";
		}else {
			return "negative";
		}
		
	}

}
