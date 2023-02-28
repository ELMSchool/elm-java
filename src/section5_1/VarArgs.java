package section5_1;

public class VarArgs {

	// var. args. => variable arguments
	public static void main(String[] args) {

		// printSomething("John", "Doe");

		methodVarArgs(5, false, "first", "second", "third", "forth");
	}

	public static void printSomething(String name, String lastName) {

		System.out.println(name + " " + lastName);
	}

	public static void methodVarArgs(int num, boolean bool,  String ... strs) {
		
			for (String str : strs) {
				
				System.out.println(str);
			}
		
	}
}
