package section3_1;

public class Flags {

	public static void main(String[] args) {

		checker(-88);

	}

	// create a method checks number is even or odd
	/*
	 * 2,4,6,8,48,54 etc => even 1,3,5,9,81 etc => odd
	 */

	public static void checker(int number) {

		boolean flag = (number % 2 == 0);

		if (flag) {

			System.out.println("This is an even number");

		} else {

			System.out.println("This is an odd number");
		}

		boolean isPositive = (number > 0 && number < 234577548);

		if (isPositive) {
			System.out.println("this is a positive number");
		} else {
			System.out.println("this is a negative number");
		}
	}

}
