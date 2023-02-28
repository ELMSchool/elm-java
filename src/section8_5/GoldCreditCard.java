package section8_5;


public class GoldCreditCard extends CreditCard {

	public GoldCreditCard(String holderName, int cardNumber, double limit, double currentDebtBalance) {
			super(holderName, cardNumber, limit, currentDebtBalance);
	}

	
	public double getInterestRate() {
		return 0.05;
	}
	
	public void spend(double money) {
		//limit - 3000 
		//currentDebtBalance - 1000 + 105 = 1105
		//105
		double totalSpend = money + money * getInterestRate(); //100 + 100 * 0.05 =105 
		
		if (super.currentDebtBalance + totalSpend <= super.limit) {
			
			super.currentDebtBalance += totalSpend;
					
		}else {
			
			System.out.println("We can not exceed the limit");
		}
		
		
	}





	

}
