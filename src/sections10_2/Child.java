package sections10_2;

import java.io.IOException;

public class Child extends Parent{
	
	
	public void setAge(int age)  {
		
		if (age >=0) {
			
			this.age = age;
		}else {
			
			this.age = 0;
			throw new RuntimeException();
		}
	}

	//1. Sub class can throw the exact same exception
	//2. Sub class method can choose NOT to thrown an Exception
	//3. Sub class method can't throw parent Exception of the Exception being thrown in Super Class method
	//4. If Super class method doesn't throw any exception sub class method can throw only unchecked Exception
}
