package ui;
import java.util.ArrayList;
import java.util.List;

import util.Console;

public class WizardInventoryApp {
		// initialize list of items
		//defining items as a List displays polymorphism!
	private static List<String> items = new ArrayList<>();
	
	public static void main (String[] args) {
		//use array list to store items. three starting items.
		items.add("wooden staff");
		items.add("bag of holding");
		items.add("amulet of truth");
		
		//only carry 4 items at a time.
		//for edit/drop, display error if user hecks up
		System.out.println("The Wizard Inventory game\n");

		//printMenu();
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			printMenu();
			command = Console.getString("Command: ");
			switch (command) {
				case "show":
					//System.out.println("Showing all items");
					//Sean used a regular for loop and added 1 to i
					//might be better to be consistent
					int number = 1;
					for (String s: items) {
						System.out.println(number + ". "+ s);
						number++;
					}
					System.out.println("\n");
					number = 1;
					break;
				case "grab":
					//must check length of arraylist
					if (items.size() < 4) {
					String itemName = (Console.getRequiredString("Name: "));
					//how do i get to add multiple words??
					items.add(itemName);
					System.out.println(itemName + " was added.");
					}
					else {
						System.out.println("You can't carry any more items. Drop something first.");
					}
					break;
				case "edit":
					//System.out.println("Edit");
					//always verify the item exists
					
					int itemID = Console.getInt("Number: ", 0, items.size()+1);
					if (validateItemNumber(itemID)) {
						items.set(itemID - 1, Console.getRequiredString("Updated name: "));
						System.out.println("Item number " + itemID + " was updated.");
					}
					else {
						System.out.println("Item number not valid.");
					}
					break;
				case "drop":
					//always verify the item exists
					itemID = Console.getInt("Number: ", 0, items.size()+1);
					if (validateItemNumber(itemID)) {
						//remove the item
						System.out.println(items.remove(itemID - 1) + " was dropped.");
					}
					else {
						System.out.println("Item number not valid.");
					}
					break;	
				case "exit": {
					break;
				}
				default:
					System.out.println("Invalid command, try again");
			}
			
		}
	
	
		System.out.println("bye");
	
		
	}
	
	public static void printMenu() {
		System.out.println("COMMAND MENU");
		System.out.println("show - Show all items");
		System.out.println("grab - Grab an item");
		System.out.println("edit - Edit an item");
		System.out.println("drop - Drop an item");
		System.out.println("exit - Exit program\n");
	}
	
	
	
	//because out item numbers start at zero, the index
	//will always be 1 less than item number
	private static boolean validateItemNumber(int itemNbr) {
		return (items.get(itemNbr - 1) != null);
}
}
