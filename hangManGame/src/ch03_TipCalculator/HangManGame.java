package ch03_TipCalculator;

import java.util.List;

import util.Console;

public class HangManGame {
	static String[] hangman = {
			" +---+\n |   |\n     |\n     |\n     |\n     |\n========",			
			" +---+\n |   |\n O   |\n     |\n     |\n     |\n========",
			" +---+\n |   |\n O   |\n |   |\n     |\n     |\n========",
			" +---+\n |   |\n O   |\n/|   |\n     |\n     |\n========",
			" +---+\n |   |\n O   |\n/|\\  |\n     |\n     |\n========",
			" +---+\n |   |\n O   |\n/|\\  |\n/    |\n     |\n========",
			" +---+\n |   |\n O   |\n/|\\  |\n/ \\  |\n     |\n========"
			};

	public static void main(String[] args) {
		System.out.println(
				"Welcome to Hangman! \nYou know the drill...I'll pick a word and \nyou have to guess it within 7 tries \nor else the dude dies!!!");
		// while hangmanTally < 6, word not guess, etc
		int numberOfWrongGuesses = 0;
		String word = pickAWord();
		String[] letterArray = word.split("");
		while (numberOfWrongGuesses < 6) {
			fillInLines(letterArray);
			System.out.println(hangman[numberOfWrongGuesses]);
			//System.out.println("Random word is: " + word);
			String guess = Console.getString("Guess a letter!\n");
			//System.out.println(isInWord(guess, word));
			if (!isInWord(guess, word)){
				numberOfWrongGuesses++;
				}
			String msg = isInWord(guess,word) ? "Correct guess.\n" : "Wrong, guess again!\n";
			System.out.println(msg);
			//System.out.println("Number of wrong guesses:" + numberOfWrongGuesses);
			// if isInWord == false; hangManTally ++; print new hangman
			// print number of blanks for each letter; fill in blank when letter is guessed

		}

		System.out.println("bye");

	}

	public static String pickAWord() {
		String[] wordList = { "charmeuse", "taffeta", "slub", "linen", "organic", "polkadot", "toile", "ruffles",
				"hem" };
		// generate a number between 0 and wordlist.length
		int pickWord = (int) (Math.random() * ((wordList.length)));
		// System.out.println("number generated is: " + pickWord);
		return wordList[pickWord];

	}

	public static boolean isInWord(String guess, String word) {
		boolean isInWord = false;
		String[] letterArray = word.split("");
		for (String g : letterArray) {
			if (g.equalsIgnoreCase(guess)) {
				isInWord = true;
			}
		}
		return isInWord;
	}

	public static void fillInLines(String[] word) {
		for (String g : word) {
			System.out.print("_ ");
		}
		System.out.println();
	}

}
