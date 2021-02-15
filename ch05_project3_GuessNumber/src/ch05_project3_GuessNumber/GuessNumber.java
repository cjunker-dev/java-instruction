package ch05_project3_GuessNumber;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int limit = 100;
		greeting(limit);
		int nbr = randomNumber(limit);
		//System.out.println(number);
		Scanner sc = new Scanner(System.in);
		int guess = sc.nextInt();
		
		
		sc.close();
	}
	// welcome the user
	private static void greeting(int limit) {
		System.out.println("Guess the Number Game\nI'm thinking of a number between 1 and " + limit +". Try to guess it.");
	}
	
	//generate a random number
	private static int randomNumber(int limit) {
		int number = (int)(Math.random() * limit);
		return number;
	}
	
	
	// ask the user to guess the number
	//return hints as to whether its too high, way too high, etc
	//when correct number is found, user is rated on skill
	// ask to continue when done
	
	
	
}
