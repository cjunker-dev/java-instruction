

public class SavingsAccount extends Account {
	double monthlyInterestRate;
	double monthlyInterestPayment;
	
	public double getMonthlyInterest() {
		return monthlyInterestRate;
	}
	public void setMonthlyInterest(double monthlyInterest) {
		this.monthlyInterestRate = monthlyInterestRate;
	}
	
	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyInterestPayment = monthlyInterestPayment;
	}
	
	public double getMonthlyPayment() {
		return monthlyInterestPayment;
	}
	public SavingsAccount(double monthlyInterestRate, double balance) {
		super();
		this.monthlyInterestRate = monthlyInterestRate;
		this.balance = balance;
	}
	
	public void applyPaymentToBalance() {
		//calculate payment - 1% interest applied on final balance
		//return balance + balance * monthlyInterestRate;
		monthlyInterestPayment = balance * monthlyInterestRate;
		balance += monthlyInterestPayment;
	}
	

}
