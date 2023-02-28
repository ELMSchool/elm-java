package section7_1;

public class CarTest {

	public static void main(String[] args) {

		/*
		 *1. Static keyword allows to manage memory
		 *2. Static fields belong to Class itself
		 *3. We can access static fields by Class name
		 *4. Modification of static field will modify it everywhere 
		 * */
		
		Tesla t1 = new Tesla();
		t1.vinNumber = 100001;
		t1.model  = "Model S";
		
		
		Tesla t2 = new Tesla();
		t2.vinNumber = 100002;
		t2.model  = "Model Y";
//		t2.origin = "Italy";
		
		
		t1.printTesla();
		t2.printTesla();
		
		Tesla t3 = new Tesla();
		t3.printTesla();
		
		Tesla.accelaration();
		

		
	}

}
