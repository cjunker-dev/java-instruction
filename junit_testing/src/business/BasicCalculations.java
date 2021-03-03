package business;

public class BasicCalculations {
	public static int square(int num) {
		//accepts an int and returns an int squared
		return (num * num);
	}
	
	
	public static int countA(String s) {
		//accepts a String and returns an int
		//representing the number of a's
		String[] arr = s.split("");
		int count = 0;
		for (String letter: arr) {
			//System.out.print(letter);
			if (letter.equalsIgnoreCase("a")) {
				count++;
			}
		}
		return count;
	}
}
