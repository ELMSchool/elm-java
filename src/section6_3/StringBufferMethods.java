package section6_3;

public class StringBufferMethods {
	
	public static void main(String[] args) {
		
		
		//append() -> this method helps to append given value to the objec
		
		StringBuffer sbf = new StringBuffer("Hello ");
		sbf.append(" World");
		
//		System.out.println(sbf);
		
		//Hello World
		//insert() ->
//		sbf.insert(5,5);
//		System.out.println(sbf);
		
		
		//replace()
		StringBuffer sbf2 = new StringBuffer("Java");
		sbf2.replace(0, 2, "La");
		System.out.println(sbf2);
		
		//delete()
		StringBuffer sbf3 = new StringBuffer("Hello");
		sbf3.delete(0, 4);
		System.out.println(sbf3);
		
		//reverse()
		StringBuffer sbf4 = new StringBuffer("Hello");
		sbf4.reverse();
		System.out.println(sbf4);
		
		//charAt()
		//length()
		//substring()
		
	}

}
