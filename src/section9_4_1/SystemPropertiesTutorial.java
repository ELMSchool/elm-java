package section9_4_1;

import java.util.*;

public class SystemPropertiesTutorial {
	
	public static void main(String[] args) {
		
		
		Properties properties = System.getProperties();
		
		Set<Object> systemPropertyKeys = properties.keySet();
		
		for (Object propertyKey : systemPropertyKeys) {
			
			System.out.println(propertyKey + " - " +  properties.get(propertyKey));
			
		}
	}

}
