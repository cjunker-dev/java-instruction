package ui;

import util.Console;

public class CustomerViewerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Customer Viewer");
		String choice = "y";
		//while input = "y"
		int customerId = Console.getInt("Enter a customer number: ");
		choice = Console.getChoiceString("Display another customer? (y,n): ", "y", "n");
		
		
		
		
		
		
		System.out.println("Bye!");

	}

}
