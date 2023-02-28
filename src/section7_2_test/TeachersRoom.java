package section7_2_test;

import section7_2_dev.Teacher;

public class TeachersRoom {
	
	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		
	    t1.createAutomatedTeacherCredentials();
		Teacher.printFields(t1);
	
		
/*
 * this.fieldName  - instance variable
 * this.methodName() - methods of class
 * this(param, param) - constructor
 * */
	
		
	}

}
