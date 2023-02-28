package sections10_3;
import java.io.FileReader;
import java.util.*;
public class NestedTryCatch {
	
	
	public static void main(String[] args) {
		
		
		String folderPath = "C:\\Users\\slymn\\OneDrive\\Documents";
		String fileName = "Lessons.properties";
		
		/*
		 * read the file 
		 * take the lesson names, add them into ArrayList and print out 5th index of each lesson
		 * */
		
		
		Properties properties = new Properties();
		
		ArrayList <String> list = new ArrayList<>();
		
		try {
			FileReader reader = new FileReader(folderPath + "\\"+ fileName);
			properties.load(reader);
			
			for (Object k : properties.keySet()) {
				
				String key = (String) k;
				list.add(properties.getProperty(key));
			}
			
			try {
				for (String str : list) {
					
					System.out.println(str.charAt(5));
				}
			}catch(ArithmeticException s) {
				
				System.out.println("There is no 5th index here");
				System.out.println("Inner catch block");
			}
			
		}catch(Exception e) {
			System.out.println("Outer catch");
		}
		
		System.out.println(list);
		
	}
	

}
