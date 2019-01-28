
public class SavingAccount extends Account {

	SavingAccount(long accountNumber, double accountBalance) {
		super(accountNumber, accountBalance);
	}

	@Override
	void creditAmount(double amount) {
		accountBalance=accountBalance+amount-(amount*0.02);
	}

	@Override
	void debitAmount(double amount) {
		accountBalance=accountBalance-amount-(amount*0.02);

	}

}
