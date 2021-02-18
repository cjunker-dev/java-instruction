
public class NumberCheckApp {

	public static void main(String[] args) {
		//welcome
		System.out.println("Welcome to the Even/Odd checker!");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		//prompt to enter a number
		int num = MyConsole.getInt("Enter an integer: ");
		//return an error message if they do it wrong
		System.out.println(num);
		//return result: even or odd with a modulus (%2)
		if ((num % 2) == 1) {
			System.out.println("The number " + num + " is odd.");
		}
		else if ((num % 2) == 0) {
			System.out.println("The number " + num + " is even, Steven.");
		}
		//ask to continue
		choice = MyConsole.getString("Continue? (y/n): "); //not returning error?
		}
	System.out.println("Goodbye!");
	}

}
