package section8_5;

public class PlatinumCreditCard extends CreditCard{

	public PlatinumCreditCard(String holderName, int cardNumber, double limit, double currentDebtBalance) {
		super(holderName, cardNumber, limit, currentDebtBalance);
		
	}
	
	public double getInterestRate() {
		
		return 0.03;
	}
	
	public void spend(double money) {
		//limit - 3000 
		//currentDebtBalance - 1000 + 103 = 1103
		//105
		double totalSpend = money + money * getInterestRate(); //100 + 100 * 0.03 =103 
		
		if (super.currentDebtBalance + totalSpend <= super.limit) {
			
			super.currentDebtBalance += totalSpend;
					
		}else {
			
			System.out.println("We can not exceed the limit");
		}
		
		
	}


}
