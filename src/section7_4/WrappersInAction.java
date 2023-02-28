package section7_4;

public class WrappersInAction {
	
	public static void main(String[] args) {
		
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		System.out.println("max = "+ max);
		System.out.println("min = "+ min);
		
		//valueOf and parseInteger, parseShort etc.
		String a = "512";
		int num = Integer.parseInt(a);
		System.out.println(num);
		
		//min() max()
 		System.out.println(Integer.max(15, 12));
		
 		
 		//isAlphabetic() ,  isDigit()
 		char ch = '9';
 		
		boolean b = Character.isAlphabetic(98); //a
		System.out.println(b);
		
		
		boolean bool = Boolean.parseBoolean("true");
//		System.out.println(bool);
	}

}
