package ch03_ChangeCalculator;

import java.util.Scanner;

public class ChangeCalculator {

	public static void main(String[] args) {
		// allow user to enter a valid integer between 0 and 99
		// divid number with ints to see how many quarters can be taken out of it
		// use modulus to figure out the rest
		System.out.println("Welcome to the Change Calculator!");
		System.out.println();
		String input = "y";
		Scanner sc = new Scanner(System.in); //declare outside to reduce load
		// if else is not needed at all
		while (input.equalsIgnoreCase("y")) {
			System.out.println("Enter number of cents (0-99) : ");
			int cents = sc.nextInt();
			int quarters = 0;
			int dimes = 0;
			int nickels = 0;
			int pennies = 0;
			int leftOver = 999;
			System.out.println(cents);
			while (leftOver > 0) {
				if (leftOver >= 25) {
					final int QUARTER_VALUE = 25;
					quarters = cents / QUARTER_VALUE;
					leftOver = cents % QUARTER_VALUE;
				} else if (leftOver >= 10) {
					final int DIME_VALUE = 10;
					dimes = leftOver / DIME_VALUE;
					leftOver = leftOver % DIME_VALUE;
				} else if (leftOver >= 5) {
					final int NICKEL_VALUE = 5;
					nickels = leftOver / NICKEL_VALUE;
					leftOver = leftOver % NICKEL_VALUE;
				} else {
					pennies = leftOver;
					leftOver = 0;
				}
			}
			System.out.println("Quarters: " + quarters);
			System.out.println("Dimes: " + dimes);
			System.out.println("Nickels: " + nickels);
			System.out.println("Pennies: " + pennies);
			System.out.println("Continue? (y/n): ");
			input = sc.next();
		}
		// System.out.println("Left over: " + leftOver);
		sc.close();
		System.out.println("Goodbye!");
	}

}
