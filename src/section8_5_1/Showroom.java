package section8_5_1;

public class Showroom {
	
	public static void main(String[] args) {
		
		Mercedes m = new Mercedes("E Class", 160, "A12321", "white");
		
		System.out.println(m);
		m.amgColor(m);
		m.brabusSpeed(m);
		System.out.println();
		System.out.println(m);
		m.move();
	}
	

}
