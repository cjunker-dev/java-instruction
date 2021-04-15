package ch03_TipCalculator;

import java.util.ArrayList;
import java.util.List;

import util.Console;

public class HangManGame {
	static String[] hangman = { " +---+\n |   |\n     |\n     |\n     |\n     |\n========",
			" +---+\n |   |\n O   |\n     |\n     |\n     |\n========",
			" +---+\n |   |\n O   |\n |   |\n     |\n     |\n========",
			" +---+\n |   |\n O   |\n/|   |\n     |\n     |\n========",
			" +---+\n |   |\n O   |\n/|\\  |\n     |\n     |\n========",
			" +---+\n |   |\n O   |\n/|\\  |\n/    |\n     |\n========",
			" +---+\n |   |\n O   |\n/|\\  |\n/ \\  |\n     |\n========" };

	public static void main(String[] args) {
		System.out.println(
				"Welcome to Hangman! \nYou know the drill...I'll pick a word and \nyou have to guess it within 7 tries \nor else the dude dies!!!");
		// while hangmanTally < 6, word not guess, etc
		int numberOfWrongGuesses = 0;
		StringBuilder word = new StringBuilder();
		word.append(pickAWord());
		//String[] letterArray = word.split("");
		StringBuilder guess = new StringBuilder();
		StringBuilder hiddenWord = new StringBuilder(word.length());
		while (numberOfWrongGuesses < 6) {
			//fillInLines();
			System.out.println(hangman[numberOfWrongGuesses]);
			System.out.println("Random word is: " + word);
			//for each letter in word, populate hidden word with dashes
			for (int i = 0; i < hiddenWord.length(); i++)
			{
				//hiddenWord.setCharAt(i, "_");
				hiddenWord.insert(i, "_ ");
			}
			guess.append(Console.getString("Guess a letter!\n"));
			// System.out.println(isInWord(guess, word));
			if (!isInWord(guess, word)) {
				numberOfWrongGuesses++;
			}
			/*for (int i = 0; i < word.length(); i++){
				if (word.charAt(i) == guess.get) {
					hiddenWord.setCharAt(i, guess);

				}
			}*/
			String msg = isInWord(guess, word) ? "Correct guess.\n" : "Wrong, guess again!\n";
			System.out.println(msg);
			// System.out.println("Number of wrong guesses:" + numberOfWrongGuesses);
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

	public static boolean isInWord(StringBuilder guess, StringBuilder word) {
		boolean isInWord = false;
		//String[] letterArray = word.split("");
		for (char c : word.toString().toCharArray()) {
			if (c == guess){
				isInWord = true;
			}
		}
		return isInWord;
	}

	public static void fillInLines(StringBuilder word, String guess) {
		char c = guess.charAt(0);
		for (int i = 0; i < word.length(); i++)
			if (word.charAt(i) == c)
				word.setCharAt(i, c);
	}

}
/*
 * char c = guess.charAt(0);
	*					for (int i = 0; i < word.length(); i++) {
						if (word.charAt(i) == c) {
	*							hiddenWord.setCharAt(i, c);
	*						}
	*					}
	*'c' is a correctly guessed character.  And the for loop loops through my 'hiddenWord' 
	*which is a StringBuilder that starts filled with underscores but then the underscores get replaced with correct guesses.
*/