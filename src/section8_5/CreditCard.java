package section8_5;

public abstract class CreditCard {
	
	String holderName;
	int cardNumber;
	double limit;
	double currentDebtBalance;
	
	public CreditCard (String holderName, int cardNumber, double limit, double currentDebtBalance) {
		
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.limit = limit;
		this.currentDebtBalance = currentDebtBalance;
	}
	

	public abstract double getInterestRate();

	public abstract void spend(double money);
}
