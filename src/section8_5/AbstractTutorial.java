package section8_5;

public class AbstractTutorial {

	public static void main(String[] args) {
		
		GoldCreditCard gCard = new GoldCreditCard("John Doe", 123456789, 15000, 3000);
		PlatinumCreditCard pCard = new PlatinumCreditCard("Jack Hamman", 777777777, 1000000, 150000);
		
		gCard.spend(1000); // 1050 
		System.out.println(gCard.currentDebtBalance);
		
		pCard.spend(10000);
		System.out.println(pCard.currentDebtBalance);
	}
}
