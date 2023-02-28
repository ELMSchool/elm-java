package sections10_1;

import java.io.IOException;

public class ExceptionTutorial {
	
	 public static void main(String[] args) {
//	        System.out.println("Testing our 'throw' keyword.");
//	       is18OrOlder( 18 );
//	     System.out.println("Testing whether this will print out when Exception is thrown");
	    }
	       
	    public static boolean is18OrOlder(int age) {
	  if (age < 18) {
	            throw new ArithmeticException();
	 }
	      return true;
	    }

}
