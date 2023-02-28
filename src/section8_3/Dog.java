package section8_3;

public class Dog extends Animal{
	
	
	String breed;
	
	public void bark() {
		
		System.out.println(name + " barks.");
		
	}
	
	public void displayBreed() {
		
		System.out.println("Breed: "+ breed);
		
	}
	
	
	public void move() {
		
		System.out.println(breed+"s" + " can move faster");
	}
	

}
