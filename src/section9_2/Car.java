package section9_2;

public class Car {
	
	String make;
	String model;
	int maxSpeed;
	
	public Car(String make, String model, int maxSpeed) {
		
		this.make = make;
		this.model = model;
		this.maxSpeed = maxSpeed;
		
	}

	public String toString() {
		
		return make + " " + model + " " + maxSpeed;
	}


}
