package section8_5;

public abstract class Toy {
	
	private String name;
	private String color;
	
	public Toy(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}

	public String getColor() {
		
		return this.color;
	}
	
	public void setColor(String color) {
		
		this.color = color;
	}
	
	public abstract void  play();
}
