package section8_5_1;

public class Mercedes implements BrabusEngine, AmgDesign {
	
	String model;
	int maxSpeed;
	String vinNumber;
	String color;
	
	
	public Mercedes(String model, int maxSpeed, String vinNumber, String color) {
		super();
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.vinNumber = vinNumber;
		this.color = color;
	}

	public void amgColor(Mercedes mercedes) {
			
		mercedes.color = "AMG Special Color";
	}
	
	public void brabusSpeed(Mercedes mercedes) {
		
		mercedes.maxSpeed +=10;
	}
	
	public void move() {
		System.out.println("Mercedes moves very smooth");
	}
	public String toString() {
		return "Mercedes " + this.model + " "+AMG_LOGO + "\n"+
				"Color: " + this.color + "\n"+
				"Max Speed: " + this.maxSpeed + "\n"+
				"Vin Number: " + this.vinNumber;
				
	}

}
