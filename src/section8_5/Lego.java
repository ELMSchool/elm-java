package section8_5;

public class Lego extends Toy {

	private int pieceCount;

	public Lego(String name, String color, int pieceCount) {

		super(name, color);
		this.pieceCount = pieceCount;
	}

	//implementing abstract method
	public void play() {

		System.out.println("Building house with "+ pieceCount + " lego pieces");
	}

	
}
