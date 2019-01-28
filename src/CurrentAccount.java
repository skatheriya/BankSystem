
public class CurrentAccount extends Account {

	CurrentAccount(long accountNumber, double accountBalance) {
		super(accountNumber, accountBalance);
	}

	@Override
	void creditAmount(double amount) {
		accountBalance=accountBalance+amount;
	}

	@Override
	void debitAmount(double amount) {
		accountBalance=accountBalance-amount-(amount*0.01);

	}

}
