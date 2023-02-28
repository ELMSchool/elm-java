package sections10_2;

import java.io.IOException;

public class Parent {
	
	 int age;
	
	public void setAge(int age){
		
		if (age >=0) {
			
			this.age = age;
		}else {
			
			this.age = 0;
			
		}
	}
	
	
	

}
