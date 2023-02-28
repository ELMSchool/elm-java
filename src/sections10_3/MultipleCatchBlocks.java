package sections10_3;

public class MultipleCatchBlocks {

	public static void main(String[] args) {

		String str = "java";
		int a = 5;
		int b = 1;

		try {
			
		
			
		} catch (StringIndexOutOfBoundsException s) {
			
			System.out.println("Not valid index");
			
		} catch (ArithmeticException ae) {
			
			System.out.println("Can't divide");
			
		} catch (Exception ax) {
			System.out.println("something");
		}

	}

}
