package section6_2;

public class Substring {
	
	public static void main(String[] args) {
		
		//substring(int from(inc), int until(exc))
		//substring(int from)
		
		//take the first name and last and print them
		String email = "ANgELINA.jolie@gmail.com";
		//indexOf()
		//substring()	
		
		String expectedfullName = "ANGELINA JOLIE";
		
		String firstName = email.substring(0, email.indexOf('.'));
		String lastName = email.substring(email.indexOf('.')+1, email.indexOf('@'));
		String actualFullname = firstName + " "+ lastName;
		
		//equalsIgnoreCase() - same as equals() but we are ignoring cases and returns us boolean
		System.out.println(expectedfullName.equalsIgnoreCase(actualFullname));
	
	}

	public static String customSubstring(String str, int from, int until) {
		
		String substr = "";
		
		for (int i = from; i<until; i++) {
			
			char c = str.charAt(i);
			
			substr += c;
		}
		
		return substr;
	}
	
}
