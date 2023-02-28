package section6_2;

public class StringMethodsLenthIndexOf {
	
	public static void main(String[] args) {
		
		
		
		//length() ->   this method returns use the length(int) of given String. 
		
		String str = "ELM School";
		String str2 = "    ";
//		System.out.println(str2.length());
		
		/*indexOf(ch c) ->  returns(int) us index of given char, if it is not there we will receive negative value
		 *indexOf(ch c, int fromIndex) -> will start look for given char from given index ///////////
		 *indexOf(String sbstr)
		 *indexOf(String sbstr, int fromIndex)
		*/
		
		int idx = str.indexOf('l', 2);
		System.out.println(idx);
		
		int idx2 = str.indexOf("ELM", 2);
		System.out.println(idx2);
		
		
	}

}
