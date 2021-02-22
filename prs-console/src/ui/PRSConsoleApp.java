package ui;
import java.lang.reflect.Array;
import java.util.Arrays;

import business.Product;
import business.User;
import util.Console;

public class PRSConsoleApp {
	
	private static User[] users;
	
	public static void main(String[] args) {
		//define static instance variable to store a list of users
		//User[][] userList = new User[1];
		User user1 = new User(1, "dallison", "friendship98", "David", "Allison", "5135134544",
				"dallison@gmail.com", false, false);
		User user2 = new User(2, "cjunker", "happiness23", "Celina", "Junker", "5135180986",
				"cjunker@gmail.com", true, true);
		User user3 = new User(3, "hlingle", "papasmurf", "Hank", "Lingle", "5135189999",
				"hanklingle@gmail.com", false, true);
		
		User[] userList = {user1, user2, user3};
		System.out.println("Welcome to the PRS Console App!");
		System.out.println("This app mimics the functionality we will be creating in the capstone.");
		System.out.println("Pick from one of the menu items below.");
		
		int choice = 0;
		while (!(choice == 99)) {	
			//System.out.println("Menu:\n=================\n1)\tList Users\n2)\tAdd User\n99)\tExit");
			// when a user picks list users
			System.out.println("Menu:\n=================\n1)\tList Users\n2)\tAdd User\n99)\tExit");
			choice = Console.getInt("Command: ", 0, 100);
			if (choice == 1) {
				System.out.println("User List");
				System.out.println("ID\tUsername\tPassword\tFirstName\tLastName\tPhoneNumber\tEmail\tReviewer\tAdmin");
				for (User u : userList) {
					System.out.println(u.toString());
				}
			}
			//use setters and console prompts to set account
			//also you need to make a new array and copy the other users to it
			else if (choice == 2) {
				int id = Console.getInt("ID: ");
				boolean reviewer = false;
				boolean admin = false;
				String username = Console.getString("Username: ");
				String password = Console.getString("Password: ");
				String firstName = Console.getString("First name: ");
				String lastName = Console.getString("Last name: ");
				String phoneNumber = Console.getString("Phone number: ");
				String email = Console.getString("Email: ");
				String isReviewer = Console.getChoiceString("Is reviewer? (y/n) ", "y", "n");
				String isAdmin = Console.getChoiceString("Is admin? (y/n): ", "y", "n");
				reviewer = (isReviewer.equalsIgnoreCase("y")) ? true:false;
				admin = (isAdmin.equalsIgnoreCase("y")) ? true:false;
				
				
				User u = new User(id, username, password, firstName, lastName, phoneNumber, email, reviewer, admin);
				System.out.println(u.toString());
				// add to list		
				userList = Arrays.copyOf(userList, (userList.length));
				userList[userList.length - 1] = u;
				
			}
		}
		System.out.println("Bye");
	}

	private static void addUserToList(User u){
		
	}
	
	
	}
	




