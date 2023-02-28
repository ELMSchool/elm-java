package section7_4;

public class AutoboxingUnboxing {
	
	public static void main(String[] args) {
		
		
		//Classname onjName = new Classname()
		int i = 5;
		Integer num = Integer.valueOf(5); // => Integer num = new Integer(5);
		
		Integer number = i; // autoboxing => automatically putting in box
		
		//unbox => automatically take out something from box
		
		int n = num;
		
	}

}
