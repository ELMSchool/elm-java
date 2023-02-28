package section8_6;

public class Cat extends Animal implements Pet{

	String str;
	
	public void sound() {
		
		System.out.println("Cat says meow");
		
	}
	
	public void infoAboutCats() {
		
		System.out.println("Cats are very cute");
	}

	@Override
	public void play() {
		System.out.println("Cats like to play with rope");
		
	}
	

}
