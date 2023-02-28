package section6_2;

public class ContainsReplaceReplaceFirst {
	
	public static void main(String[] args) {
		
		//contains() -> returns boolean, checks if given char sequence(String) of chars is in String or not
		//replace() -> 
		
		String str = "ELM School";
		String str2 = "Hello world. I love this world.";
		boolean bool = str.contains("ELM");
		
		System.out.println(bool);
		System.out.println(str.contains("elm"));	
		System.out.println(str.indexOf("ELM"));
		
		
		//replace(char oldChar, char newChar) -> accepts 2 parameters
		
		//replaceFirst() -> it is similar to replace() but it just affects the first occurance
		str = str.replace('o', '0');
		System.out.println(str);
		
		str2 = str2.replaceFirst("o", "5");

		System.out.println(str2);
	}

}
