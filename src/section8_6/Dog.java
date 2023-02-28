package section8_6;

public class Dog extends Animal implements Pet {
	

	
	public void sound() {
		
		System.out.println("Dog says woof-woof");
	}

	public void infoAboutCats() {
		
		System.out.println("Dogs are very friendly and loyal");
	}

	@Override
	public void play() {

		System.out.println("Dogs like to play with ball");
		
	}
	

	
}
