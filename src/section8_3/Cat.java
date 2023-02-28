package section8_3;

 public class Cat {
	
	String name;
	final static int NUM_LEGS;//final variables are not changeable
	
	static {
		NUM_LEGS = 4;
	}
	
//	{
//		this.numLegs = 4;
//	}
	
//	public Cat(String name, int numLegs) {
//		this.name = name;
//		this.numLegs = numLegs;
//	}
//	
	public void sound() {
		
		System.out.println(name + " says "+ " meow meow");
	}
	
	public void printName() {
		System.out.println("Name of my cat is "+name);
	}
	
	//final methods can not be overridden
	final public void move() {
		
		System.out.println(name + " moves with "+ NUM_LEGS + " legs");
		
	}

}
