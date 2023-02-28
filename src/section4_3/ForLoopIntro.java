package section4_3;

import javax.sql.rowset.FilteredRowSet;

public class ForLoopIntro {

	public static void main(String[] args) {

		/*
		 * INITIALIZER STATEMENT runs only once before loop starts optional
		 */

		/*
		 * CONDITIONAL STATMENT is checked every time before an iteration the for block
		 * will ONLY run if the condition is TRUE optional
		 */

		/*
		 * UPDATE STATEMENT aka POST ITERATION STATEMENT Runs after each iteration used
		 * to update the value to be checked against condition optional
		 */

		
		for (int i = 5; i < 10; i++) {

//			int value = 50;
			System.out.println(i);
		}

		System.out.println("outside of for block");
//		System.out.println(value);
		
	}

	public static void countDown() {

		// create a loop that counts down from given number
		// once it reaches to zero print out Happy New Year

		// Only once
		// 1. initializer 2.cond. check 4.update the value of var go to second step
		for (int i = 3; i > 0; i--) {

			System.out.println(i); // 3.execute the body/code block
		}
		System.out.println("Happy New Year!");
	}
}
