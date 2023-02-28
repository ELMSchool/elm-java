package section5_4;
import java.util.Arrays;
public class ForEachLoopIntro {
	public static void main(String[] args) {
		
		/*
		 * for (Type eachElement : arrayName){
		 * 
		 * 		code to be executed
		 * 		
		 * }
		 * */
		
		String [] names = {"Fred", "Kate", "John", "Sarah"};
		
		for (String name : names) {
			
			System.out.println(name);
			
			
		}
		
		
		int [][] numbers = { {1,2,3} , {5,6,8}, {10,12, 15, 19} };
		
		for (int [] intArr : numbers) {
			
			for (int num : intArr) {
				
				System.out.println(num);
			}
			
		}
		
		
	}

}
