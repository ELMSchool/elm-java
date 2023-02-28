package section1_3;

public class PrecisionErrors {
	
	public static void main(String [] args) {
		
		
		//float -> single precision
		//double -> double precision
		
//		System.out.println(1.0 / 10.0);
		
		// 1 = 0.1 + 0.1 + 0.1 + ..... + 0.1;
		
//		System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1); //rounding error
		
//		System.out.println(11.0F / 3.0F);
		
		//Don't use float or double for precision calculations 
		
		int accountBalance = 1249; // $12.49 -> 1,249 cents
		int deposite1 = 559;       // $5.59  -> 559 cents
		int deposite2 = 3;         // $0.03	 -> 3 cents
		int withdrawal = 3199;	   // $31.99 -> 3,199 cents
		
		int result = accountBalance + deposite1 + deposite2 - withdrawal;
		
		System.out.println(result / 100.0);
		
		double balance = 12.49;
		double dep1 = 5.59;
		double dep2 = 0.03;
		double withdraw = 31.99;
		
		double output = balance + dep1 + dep2 - withdraw;
		System.out.println(output);
		
	}

}
