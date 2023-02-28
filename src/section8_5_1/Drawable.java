package section8_5_1;

public interface Drawable {
	
	 String INFO = "draw";  //public static final - CONSTANT

	 default void defaultMethod() {
		 System.out.println("this is a default metht in Interface");
	 }

	 void draw (); //abstract method by default

	 public static void staticMethod() {
		 
		 System.out.println("this is a static method comes from Interface");
		 
	 }
	 
	 //abstract, default, static 
	
}
