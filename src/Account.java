
abstract class Account {
	protected long accountNumber;
	protected double accountBalance;
	
	Account(long accountNumber,double accountBalance){
		setAccountNumber(accountNumber);
		setAccountBalance(accountBalance);
	}
	abstract void creditAmount(double amount);
	abstract void debitAmount(double amount);
	
	
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
