package ch05_class_demos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodsApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printWelcomeMessage("Celina");
		System.out.println("1 / 2 = " + quotient(1,2));
		String str = null;
		int n1 = getInt("Enter a whole number: ", sc);
		int n2 = getInt("Enter another whole number: ", sc);
		System.out.println("Sum of numbers: [" +n1+ " + " + n2+"] = " + (n1 + n2));
		double d1 = getDouble("Enter a decimal: ", sc);
		double d2 = getDouble("Enter another decimal: ", sc);
		System.out.println("Sum of numbers: [" +d1+ " + " + d2+"] = " + (d1 + d2));
		System.out.println("Bye");
		sc.close();
	}
	
	//pg 153 - no parameters and no return
	private static void printWelcomeMessage() {
		System.out.println("Hello and welcome to the Methods App!!!!!!!");
	
}
	//static method with 1 parameter and no return
	private static void printWelcomeMessage(String name) {
		System.out.println("Wecome, " + name + ", to the Methods app!");
	}
	
	//static method with 2 params and return (can only return one thing)
	//note that order of things passed matters
	private static double quotient(double d1, double d2) {
		return d1 / d2;
	}
	
	// this method prompts the user for a whole number and returns that number.
	// uses exception handling
	private static int getInt(String prompt, Scanner sc) {
		int number = 0;
		boolean isValid = false;
		while (!isValid){
			try {
				System.out.print(prompt);
				number = sc.nextInt();
				isValid = true;
			} catch (InputMismatchException ime) {
				System.out.println("Error! Invalid number. Must be a whole number. Try again.\n");
				sc.nextLine();
			}
		}
		return number;
	}
	
	//uses data validation
	private static double getDouble(String prompt, Scanner sc) {
		double d = 0.0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			}
			else {
				System.out.println("Error! Invalid number. Must be a decimal. Try again.\n");
				sc.next();	
			}
		}
		return d;
	}

	// null pointer exception

}
