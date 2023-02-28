package section8_1;

public class Bank {

	private String accountHolder;
	private long accountNumber;
	private double balance = 100;
	private static String bankName = "ELM Bank";
	
	public Bank(String accountHolder, long accountNumber, double balance) {

		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;

	}

	public String getAccountHolder() {

		return this.accountHolder;
	}

	public long getAccountNumber() {

		return this.accountNumber;
	}

	public double getBalance() {

		//
		return this.balance;
	}

	public void setAccountHolder(String accountHolder) {
		if (accountHolder == null || accountHolder.isEmpty()) {
			this.accountHolder = "Default Name";
		} else {

			this.accountHolder = accountHolder;

		}
	}

	public void setAccountNumber(long accountNumber) {

		this.accountNumber = accountNumber;
	}

	public void setBalance(long balance) {

		this.balance = balance;
	}
}
