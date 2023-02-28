package section4_4;

public class ContinueIntro {

	public static void main(String[] args) {

		/*
		 * Given a number Write a program that will dived given number To all numeric
		 * values from -5 to 5 (both inclusive)
		 */
		outer:
		for (int divident = 15; divident <= 35; divident += 5) {
			inner:
			for (int divider = -5; divider <= 5; divider++) {

				if (divider == 0) {
					System.out.println(" \"You can't divide by 0\" ");
					continue;
				}
				System.out.print(divident / divider + " ");
			}
			System.out.println();

		}

	}

}
