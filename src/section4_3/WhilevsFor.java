package section4_3;

public class WhilevsFor {

	public static void main(String[] args) {


		/*
		 * while loop is used best where
		 * we are not sure about iterations
		 * but we know the condition
		 * */
		
		int counter = 0;

		while (counter < 5) {

			System.out.print(counter); //

			counter++;
		}

		System.out.println();
		/*
		 * If we know the number of iterations
		 * then for statement is the best to use
		 * */
		for (int i = 0; i < 5; i++) {
			
			System.out.print(i);
			
		}

	}

}
