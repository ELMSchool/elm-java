package section4_4;

public class BreakInsideNestedLoop {

	public static void main(String[] args) {

		outer:
		for (int out = 1; out <= 5; out++) {
			
			inner:
			for (int in = 1; in <= 10; in++) {

				if (out < in) {
					break;
				}
				System.out.print(in + " ");
			}

			System.out.println();

		}

		System.out.println("End of main...");

	}

}
