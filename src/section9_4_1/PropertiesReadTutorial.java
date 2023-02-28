package section9_4_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadTutorial {

	public static void main(String[] args) {

		// "C:\\Users\\slymn\\OneDrive\\Credentials.properties";

		String folderPath = "C:\\Users\\slymn\\OneDrive\\Documents";
		String fileName = "Credentials.properties";

		Properties properties = new Properties();

		try {
			FileReader reader = new FileReader(folderPath + "\\" + fileName);
			properties.load(reader);
		} catch (FileNotFoundException f) {
			System.out.println("File Not Found");
		} catch (IOException i) {
			System.out.println("IO Exception");
		}
		
		

		System.out.println("Name is: " + properties.getProperty("name"));
		System.out.println("Last name is: " + properties.getProperty("last_Name"));
		System.out.println("Email is: " + properties.getProperty("email"));
		System.out.println("School is: " + properties.getProperty("school"));

	}

}
