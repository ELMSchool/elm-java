package section4_1;

/**
 * This class is going to print multiplication output of all numbers from 1 - 10
 * 1 2 3 4 5 6 7 8 9 10 2 4 6 8 10 12 14 16 18 20 .... 10 20 30 40 50 60 70 80
 * 90 100
 * 
 * @author slymn
 */
public class MultiplicationTableDemo {

	public static void main(String[] args) {

		
		multiplicationTable();
		
	}

	public static void multiplicationTable() {

		int numberOfCall = 1;

		while (numberOfCall <= 10) {

			multiplicationLine(numberOfCall);

			numberOfCall++;

		}

	}

	public static void multiplicationLine(int number) {

		int multiplier = 1;

		while (multiplier <= number) {

			int result = number * multiplier;

			System.out.print(result + " ");

			multiplier++;
		}
		System.out.println();
	}

}
