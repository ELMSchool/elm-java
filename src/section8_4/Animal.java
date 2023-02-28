package section8_4;

public class Animal {

	private String name;
	private int numLegs;
	
	static String staticField = "Animal Static Field";

	static{
		System.out.println("Static block of Animal");
	}
		
	
	{
		System.out.println("Non-static block of Animal");
		
	}
	
	public Animal() {
		
		System.out.println("Constructor from Animal");
	}
	
	public Animal(String name, int numLegs) {
			
		this.setName(name);	
		this.setNumLegs(numLegs);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumLegs() {
		return numLegs;
	}

	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}

	public  void printFileds() {
		System.out.println(getName());
		System.out.println(getNumLegs());
		System.out.println(staticField);
	}

}
