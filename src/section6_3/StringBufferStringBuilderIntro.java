package section6_3;

public class StringBufferStringBuilderIntro {
	
	public static void main(String[] args) {
		
		/*
		 * 1. String (Immutable), concat(), + , overrides equals()
		 * 2. StringBuffer (Mutable) (Faster) append() | Synchronized
		 * 3. StringBuilder: non-synchronized 
		 * */
		//String concat(10000 times) execution time - 317ms
		//StringBuffer concat(10000 times) execution time - 1 ms
		
		
		//String concat(100000 times) execution time - ??
		//StringBuffer concat(100000 times) execution time - 40 ms
		//StringBuilder concat(100000 times) execution time - 5 ms
		
		long startTime = System.currentTimeMillis();
		concatWithStringBuilder();
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println(executionTime);
		
	}
	
	public static void concatWithString () {
		
		String str = "ELM School";
		
		for (int i =0; i<100000; i++) {
			
			str = str + " is the best";
			
		}
		
	}
	
	public static String concatWithStringBuffer () {
		
		StringBuffer sbf = new StringBuffer("ELM School");
		
		for (int i =0; i<1000000; i++) {
			
			sbf.append(" is the best");
			
		}
		return sbf.toString();
	}
	
	public static String concatWithStringBuilder () {
		
		StringBuffer sbf = new StringBuffer("ELM School");
		
		for (int i =0; i<1000000; i++) {
			
			sbf.append(" is the best");
			
		}
		return sbf.toString();
	}

}
