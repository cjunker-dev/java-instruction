package ch05_project3_GuessNumber;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		String choice = "y";
		final int LIMIT = 100;
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			greeting(LIMIT);
			int nbr = randomNumber(LIMIT);
			//System.out.println(number);
			int numberOfGuesses = 0;
			//int guess = sc.nextInt();
			int guess = 0;
					//getIntWithinRange(sc, "Pick a number: ", 1, limit);
			while (nbr != guess) {
				guess = getIntWithinRange(sc, "Your guess: ", 1, LIMIT + 1);
				// method that compares guess to nbr and returns a string
				//print string that gives hint
				System.out.println(generateHintMessage(guess, nbr, numberOfGuesses));
				numberOfGuesses++;
			}
			//check how close to random number the guess is
			//once nbr = guess, return a message based on number of guesses
			evaluationOfSkill(numberOfGuesses);
			//ask to continue
			//choice = askToContinue(sc);
			choice = getChoiceString(sc, "Try again? (y/n)", "y", "n");
		}
		System.out.println("Goodbye");
		sc.close();
	}
	// welcome the user
	private static void greeting(int limit) {
		System.out.println("Guess the Number Game\nI'm thinking of a number between 1 and " + limit +". Try to guess it.\n");
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
	private static String generateHintMessage(int guess, int nbr, int nbrOfGuesses) {
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
			hint = "You got it in " + nbrOfGuesses + " amount of tries.";
		}
		return hint;
	}
		
	
	//when correct number is found, user is rated on skill
	// ask to continue when done
	private static String askToContinue(Scanner sc) {
		boolean isValid = false;
		while (!isValid) {
		System.out.println("Continue? (y/n): ");
		//should only accept "y" or "n"
		//if string is not y or n it should erase and have it be asked again
		
		String choice = sc.next();
		if (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n")){
			System.out.println("Error! Must select y or n. Try again.");
			sc.nextLine();
			continue;
		}
		else {
			//choice = sc.next();
			isValid = true;
		}
		//System.out.println();
		
		}
		//return choice;
		return null;
	}
	
	private static void evaluationOfSkill(int guesses) {
	//take the number of guesses and return a string (or print? idk) based on how many guesses
		if (guesses <= 3) {
			System.out.println(guesses + " guesses, Dang u r so good at number guessing");
		}
		else if (guesses <= 7) {
			System.out.println(guesses + " guesses, you hve potential to be good at this game.");
			
		}
		else {
			System.out.println(guesses + ", wow u suck!!!!! dont quit your day job");
		}
	}
	private static String getRequiredString(Scanner sc, String prompt) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.equals("")) {
                System.out.println("Error! This entry is required. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }
    private static String getChoiceString(Scanner sc, String prompt,
            String s1, String s2) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            s = getRequiredString(sc, prompt);
            if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2)) {
                System.out.println("Error! Entry must be '" + s1 + "' or '" + s2 + "'. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }

	
}

