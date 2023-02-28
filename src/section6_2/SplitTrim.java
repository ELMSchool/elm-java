package section6_2;
import java.util.Arrays;
public class SplitTrim {
	
	
	public static void main(String[] args) {
		
		//split(regex) -> it splits string based on given regex returns us array
		//split(regex, int limit) -> you can limit the size of array that it will return
		// trim() ->  cleans spaces which leading and trailing the given String
		
		String str = "ELM school provides good studying materials";
		
		String [] words = str.split(" ", 5);
		
//		System.out.println(Arrays.toString(words));
//		
//		for (String word : words) {
//			
//			System.out.println(word);
//		}
		
		
		
		String name = "   Fred     ";
		System.out.println(name.length());
		name = name.trim();
		System.out.println(name.length());
		
	}
	

}
