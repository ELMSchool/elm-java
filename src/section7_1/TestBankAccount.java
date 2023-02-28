package section7_1;

public class TestBankAccount {
	
	
	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		
		ba.insertData(717011125, "Elon Musk", 100);

		ba.deposit(5000);
		ba.checkBalance();
		ba.withdrawFromOrigin(4100);
		ba.checkBalance();
		
		ba.withdrawFromDifferent(900);
		ba.checkBalance();
		
		ba.displayAccountInfo();
	}

}
