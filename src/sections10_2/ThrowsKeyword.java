package sections10_2;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsKeyword {

	public static void main(String[] args) throws Throwable{
		
		
		System.out.println(isOlderEnough(18));

	}

	public static boolean isOlderEnough(int age) throws Exception{

		if (age < 18) {

			throw new IOException(age +" is not enough to have alcohol");  // checked

		}

		if(age>75) {
			
			throw new SQLException();
		}
		
		return true;

	}
}
