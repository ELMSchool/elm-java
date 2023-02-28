package section6_2;

public class StartsWithEndsWith {
	
	
	public static void main(String[] args) {
		
		
		//stratsWith(String prefix) -> checks if given String starts with given value and returns boolean 
		//stratsWith(String prefix, int offset) -> it will check for prefix strating from offset
		//endsWith(String suffix)   -> checks if given String ends with given value	"" "" ""
		
		String str = "I love Java";
		boolean bool = str.startsWith("I love");
		System.out.println(bool);
		
		System.out.println(str.startsWith("ava",8));
		
		
		boolean bool2 = str.endsWith("I love Java");
		System.out.println(bool2);
		
	}

}
