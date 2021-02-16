package ch05_project3_GuessNumber;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int limit = 100;
		greeting(limit);
		String choice = "y";
		int numberOfGuesses = 0;
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			int nbr = randomNumber(limit);
			//System.out.println(number);
			
			//int guess = sc.nextInt();
			int guess = 0;
					//getIntWithinRange(sc, "Pick a number: ", 1, limit);
			while (nbr != guess) {
				guess = getIntWithinRange(sc, "Your guess: ", 1, limit);
				// method that compares guess to nbr and returns a string
				//print string that gives hint
				System.out.println(generateHintMessage(guess, nbr));
				numberOfGuesses++;
			}
			//check how close to random number the guess is
			//once nbr = guess, return a message based on number of guesses
			evaluationOfSkill(numberOfGuesses);
			//ask to continue
			choice = askToContinue(sc);
		}
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
	public static int getIntWithinRange(Scanner sc, String prompt, int min, int max) {
		System.out.println(prompt);
		int i = 0;
		
			boolean isValid = false;
			while (!isValid) {
				
				if (sc.hasNextInt()) {
					i = sc.nextInt();
					if (i < min) {
						System.out.println("Error! This number is too low. Try a number between " + min + " and " + max + ".");
					}
					else if (i > max) {
						System.out.println("Error! This number is too high. Try a number between " + min + " and " + max + ".");
					}
					else {
						return i;
					}
				}
				else  {
					System.out.println("This is not a valid guess you goober!");
					sc.nextLine();
				}
			}
		
		
		int result = sc.nextInt();
		return result;
		
	}
	
	//return hints as to whether its too high, way too high, etc
	private static String generateHintMessage(int guess, int nbr) {
		String hint = "";
		if (guess != nbr) {
			if (guess < nbr) {
				if ((nbr - guess) > 10) {
					hint = "Way too low!";
				}
				else {
				hint = "Too low";
				}
			}
			if (guess > nbr) {
				//if way too high
				if ((guess - nbr) > 10) {
					hint = "Way too high!";
				}
				else {
				hint = "Too high.";
				}
			}
		}
		else {
			hint = "You did it!!";
		}
		return hint;
	}
		
	
	//when correct number is found, user is rated on skill
	// ask to continue when done
	private static String askToContinue(Scanner sc) {
		System.out.println("Continue? (y/n): ");
		String choice = sc.next();
		sc.nextLine();
		//System.out.println();
		return choice;
	}
	
	private static void evaluationOfSkill(int guesses) {
	//take the number of guesses and return a string (or print? idk) based on how many guesses
		if (guesses <= 3) {
			System.out.println("Dang u r so good at number guessing");
		}
		else if (guesses <= 7) {
			System.out.println("You hve potential to be good at this game.");
			
		}
		else {
			System.out.println("Wow u suck!!!!! dont quit your day job");
		}
	}
	
}

