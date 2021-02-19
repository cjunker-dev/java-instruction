package ui;
import java.text.NumberFormat;

import Account;
import CheckingAccount;
import SavingsAccount;
import util.Console;

public class AccountBalanceApp {
	static NumberFormat currency = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {

		System.out.println("Welcome to the Bank Account App\n");
		
		//create new accounts and display balances
		CheckingAccount checking = new CheckingAccount(1, 1000);		
		SavingsAccount savings = new SavingsAccount(.01, 1000);
		System.out.println("Starting Balances:");
		displayBalances(checking, savings);
		
		

		
		System.out.println("Enter the transactions for the month\n");
		String continueChoice = "y";
		while (continueChoice.equalsIgnoreCase("y")) {
			Account a = null;
			String transaction = Console.getChoiceString("Withdrawal or deposit? (w/d): ", "w", "d");
			String type = Console.getChoiceString("Checking or savings? (c/s): ", "c", "s");
			double amount = Console.getDouble("Amount?: ", 0, 1000);//how do i do the preventing the user from overdrawing their account?
			
			if (type.equalsIgnoreCase("c")) {
				a = checking;
			}
			else if (type.equalsIgnoreCase("s")) {
				a = savings;
			}
			
			if (transaction.equalsIgnoreCase("w")) {
				if (amount > a.getBalance()) {
					System.out.println("Error, cannot withdraw more than your balance.");
				}
				else {
				a.withdraw(amount); //make sure withdrawal is less than the amount
				}
			}
			else if (transaction.equalsIgnoreCase("d")) {
				a.deposit(amount);
			}
			continueChoice = Console.getChoiceString("\nContinue?: ", "y", "n");
			}
		//when someone leaves the loop, display monthly payments and final balances
		checking.subtractMonthlyFeeFromBalance();
		savings.applyPaymentToBalance();
		
		System.out.println("\nMonthly Payments and Fees\nChecking fee:\t\t"+ 
							currency.format(checking.getMonthlyFee()) + 
							"\nSavings interest payment: " + currency.format(savings.getMonthlyPayment()) + "\n"); 
		System.out.println("Final Balances: ");
		displayBalances(checking, savings);
		
		
	}
	
	private static void displayBalances(CheckingAccount c, SavingsAccount s) {
		
		System.out.println("Checking: " + currency.format(c.getBalance()));
		System.out.println("Savings: " + currency.format(s.getBalance()) + "\n");
	}

}
