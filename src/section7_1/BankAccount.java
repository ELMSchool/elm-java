package section7_1;

public class BankAccount {

	int accountNumber;
	String accountHolderName;
	double balance;

	public void insertData(int aNumber, String aHolderName, double d) {

		accountNumber = aNumber;
		accountHolderName = aHolderName;
		balance = d;

	}

	public void deposit(double amount) {

		balance += amount;

	}

	public void withdrawFromOrigin(double d) {

		if (d > balance) {

			System.out.println("Insufficent Balance");
		} else {
			balance -= d;
			System.out.println("$" + d + " withdrawn");
		}
	}

	public void withdrawFromDifferent(double d) {

		double extraPercentage = d * 0.03;
		double totalAmountWithdraw = d + extraPercentage;

		if (totalAmountWithdraw > balance) {

			System.out.println("Insufficent Balance");
		} else {
			balance -= totalAmountWithdraw;
			System.out.println("$" + totalAmountWithdraw + " withdrawn");
		}
	}

	public void checkBalance() {
		System.out.println("Balance is " + balance);
	}

	public void displayAccountInfo() {
		System.out.println(accountHolderName + " " + accountNumber + " " + balance);
	}

}
