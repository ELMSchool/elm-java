package section3_1;

public class CheckPositivity {

	public static void main(String[] args) {

		positiveOrNegative3(54); // 0

	}

	/**
	 * This method checks if given number is positive or negative
	 * 
	 * @param number
	 */
	public static void positiveOrNegative(int number) {
		// Check given number if it is positive or negative

		// if condition works based on true or false
		if (number > 0) {
			System.out.println(number + " is a positive number!");
		} else if (number == 0) {
			System.out.println(number + " is zero!");
		} else {
			System.out.println(number + " is a negative number!");
		}

//		if (number > 0) {
//			System.out.println(number + " is a positive number!");
//		}
//		
//		if (number < 0) {
//			System.out.println(number + " is a negative number!");
//		}
//		
//		if (number == 0) {
//			System.out.println(number + " is zero!");
//		}

	}

	public static void positiveOrNegative2(int number) {

		if (number > 0) {

			System.out.println(number + " is a positive number!");

		} else {
			// if it is zero
			// if it is negative
			if (number == 0) {
				System.out.println(number + " is a zero!");
			} else {
				System.out.println(number + " is a negative number!");

			}
		}

	}

	public static void positiveOrNegative3(int number) {

		if (number >= 0) {
			//if it is greater than 0
			//if it is equal to zero
			if(number > 0) {
				System.out.println(number + " is a positive number!");
	
			}else {
				System.out.println(number+ " is a zero!");
			}

		}else {
			System.out.println(number + " is a negative number!");
		}

	}
}
