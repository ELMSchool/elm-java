package section9_4_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesWriteTutorial {

	public static void main(String[] args) throws IOException {

		String folderPath = "C:\\Users\\slymn\\OneDrive\\Documents";
		String fileName = "NewCredentials.properties";
		
		Properties properties = new Properties();
		
		properties.setProperty("name", "Helen");
		properties.setProperty("lastName", "Johnson");
		properties.setProperty("email", "jhelen@elm.academy");
		properties.setProperty("school", "ELM School");
		
		FileWriter writer = new FileWriter(folderPath + "\\" + fileName);
		
		properties.store(writer, "Example of how to write Properties to a file");
		

	}

}
