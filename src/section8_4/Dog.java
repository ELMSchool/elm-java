package section8_4;

public class Dog extends Animal{

	String breed;
	int numLegs;
	
	static{
		System.out.println("Static block of Dog");
	}
	
	{
		System.out.println("Non-static block of Dog");
	}
	
	public Dog() {
		//default Constructor for Dog class
		super();
		System.out.println("Constructor from Dog");
	}	
	
	
	public Dog (String name, int numLegs, String breed) {
		
		super(name, numLegs);
		this.breed = breed;
		
		super.printFileds();
		
	}
	

	 
	public void printFileds() {
		
		System.out.println("Breed: "+this.breed);
		System.out.println("Name: "+super.getName());
		System.out.println("Number of legs: "+super.getNumLegs());
	}
	

	
}
