
public class CheckingAccount extends Account {
	private double monthlyFee;
	
	//include methods that subtract the monthly fee from acct balance and return the monthly fee
	//getters and setters
	
	public void subtractMonthlyFeeFromBalance() {
		balance -= monthlyFee;
	}

	public CheckingAccount(double monthlyFee, double balance) {
		super();
		this.monthlyFee = monthlyFee;
		//setBalance(balance); //we can access balance directly so we don't need the setter
		this.balance = balance;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	
}
