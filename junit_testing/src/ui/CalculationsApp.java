package ui;

import business.BasicCalculations;
import util.Console;

public class CalculationsApp {
	/*public static int square(int num) {
		//accepts an int and returns an int squared
		return (num * num);
	}
	
	
	public static int countA(String s) {
		//accepts a String and returns an int
		//representing the number of a's
		String[] arr = s.split("");
		int count = 0;
		for (String letter: arr) {
			if (letter.equalsIgnoreCase("a")) {
				count++;
			}
		}
		return count;
		*/
	
	public static void main(String[] args) {
		int choice = Console.getInt("Enter an integer to square");
		int squareChoice = BasicCalculations.square(choice);
		System.out.println("Squared " + choice + "= " + squareChoice);
		
		
		String string = Console.getRequiredString("Enter a sentence or whatever you want!");
		int aCount = BasicCalculations.countA(string);
		System.out.println("Number of As is: " + aCount);
	}

}
