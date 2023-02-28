package section3_3;

public class UnaryDemo {
	
	
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		int temp;
		
		//Demo of postfix Increment / Decrement 
		num1++;
		System.out.println("Post increment: "+ num1);
		System.out.println("Post increment in println: " + num1++);
		System.out.println("After post increment in println "+ num1);
		
		//Demo of prefix Increment / Decrement
		++num2;
		System.out.println("Pre increment: " + num2);
		System.out.println("Pre increment in println: " + ++num2);
		
		//       7    +     13
		temp  =  num1++ + ++num2; 
		System.out.println("Value of temp: "+temp);
		
		//8					13
		if (num1 < 7 & ++num2 < 12) {   //bitwise  - | , &
			System.out.println("Hello");
		}
		
		System.out.println("num1: "+ num1);
		System.out.println("num2: "+ num2);

	}

}
