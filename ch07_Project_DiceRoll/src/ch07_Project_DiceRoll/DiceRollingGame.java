package ch07_Project_DiceRoll;

public class DiceRollingGame {

	public static void main(String[] args) {
		//welcome message
		System.out.println("Hello! Welcome to the Dice Roller.");
		String choice = "";
		choice = Console.getString("Want to play? (y/n): \n");
		// get choice from player
		//String choice = "y";
		Dice dice = new Dice();
		while (choice.equalsIgnoreCase("y")) {
			//wait for a y, then:
			//roll both dice
			
			dice.roll();
			System.out.println(dice.getRollResultString());
			
			//add dice together and depending on their relationship, return a message
			//ask to roll again?
			choice = Console.getString("\nRoll again?\n");
			
			//if n, exit while loop
		}
	}

}
