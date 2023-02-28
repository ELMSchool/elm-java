package section8_4;

public class Address {

	String street;
	int streetNumber;
	String city;
	String state;
	int zipCode;
	
	public Address(String street, int streetNumber, String city, String state, int zipCode) {
		
		this.streetNumber = streetNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;

	}
	
	public String toString() {
		
		return this.streetNumber + " "+ this.street + ", " + this.city + ", " + this.state + " " + this.zipCode;
	}
}
