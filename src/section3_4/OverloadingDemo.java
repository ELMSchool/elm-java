package section3_4;

public class OverloadingDemo {

	public static void main(String[] args) {

		int great = greatest(10, 145);
		System.out.println(greatest(11.1, 5.2, 6.9));

	}

	public static int greatest(int a, int b) {

		int largest;
		if (a > b) {
			largest = a;
		} else {
			largest = b;
		}

		return largest;

	}

	public static double greatest(double a, double b) {

		return (a > b) ? a : b;
	}

	public static double greatest(double num1, double num2, double num3) {

		double largest = greatest(greatest(num1, num2), num3);

		return largest;
	}

	public static int demo(String a, int b) {

		return 0;
	}

	public static int demo( int b, String a) {

		return 0;
	}

}
