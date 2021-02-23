package ch03_TipCalculator;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculator {
	
	public static void main(String[] args) {
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			// ask for input
			// for each (15%, 20%, 25%), calculate tip and total price
			// format tip percent, tip amount, and total
			// use bigdecimal for all mathy stuff
			// only continue if the user says yes
			System.out.println("Tip Calculator");
			System.out.println("Cost of meal: ");
			// create BD from string
			BigDecimal cost = sc.nextBigDecimal();
			//BigDecimal tip = new BigDecimal(0.0);
			BigDecimal total = new BigDecimal(0.0);
			//final BigDecimal MAX_TIP = new BigDecimal(26);
			//for (BigDecimal tipPercent = new BigDecimal(15); tipPercent.compareTo(MAX_TIP); tipPercent = tipPercent.add(5)) {// tipPercent < 26; tipPercent+= 5) {
			NumberFormat percent = NumberFormat.getPercentInstance();
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			
			
			for (double d = .15; d <=.25; d+=.05) {	
				System.out.println("\n" + percent.format(d));
				BigDecimal tipPCT = new BigDecimal(d);
				BigDecimal tipAmt = cost.multiply(tipPCT);
				System.out.println("Tip Amount:\t" + currency.format(tipAmt));
				total = cost.add(tipAmt);
				System.out.println("Total amount:\t" + currency.format(total));
				/* System.out.println("\n" + d + "%");
				tip = cost * d; // (cost * tipPercent) / 100;
				System.out.println("Tip amount: " + tip);
				total = tip.add(cost);// (tip + cost);
				System.out.println("Total amount: " + total); */
			}
			System.out.println("\nContinue? (y/n): ");
			choice = sc.next();
		}
		sc.close();
		System.out.println("Bye");
	}

}
