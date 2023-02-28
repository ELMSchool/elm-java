package section2_3;

public class ExperimentingWithMethods {

	public static void main(String[] args) {

		System.out.println("Print first");
		printBye();
		System.out.println("Print last");

	}

	public static void printHi() {
		MethodsIntro.myFirstMethod();
		System.out.println("hi");

	}

	public static void printBye() {
		printHi();
		System.out.println("bye");
		System.out.println("bye");

	}

}
