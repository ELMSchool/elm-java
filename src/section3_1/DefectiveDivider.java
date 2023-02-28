package section3_1;

public class DefectiveDivider {
	
	public static void main(String[] args) {
		
		//test cases: 6/2, 6/3, 6/4, 1/4, 3/0
		int num1 = 5;
		int num2 = 0;
		if (num2 == 0) {
			System.out.println("You can't divide by 0.");
			return;
		}
		
		divider(3, 0);
		divider(3, 2);
		divider(10, 5);
		divider(15, 3);
		divider(8, 0);

		
	}
	
	
	public static void divider(int num1, int num2) {
		
		if (num2 == 0) {
			System.out.println("You can't divide by 0.");
			return;
		}
	
		System.out.println(num1 + " / " + num2 + " = " + num1/num2);
		System.out.println("Success");
	
	}

}
