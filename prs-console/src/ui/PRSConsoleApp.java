package ui;

import java.lang.reflect.Array;
import java.util.Arrays;

import business.Product;
import business.User;
import db.DAO;
import db.UserList;
import db.UserTextFile;
import util.Console;

public class PRSConsoleApp {

	private static DAO<User> userDAO = new UserTextFile();

	public static void main(String[] args) {
		// define static instance variable to store a list of users

		// User[] userList = {user1, user2, user3};
		System.out.println("Welcome to the PRS Console App!");
		System.out.println("This app mimics the functionality we will be creating in the capstone.");
		System.out.println("Pick from one of the menu items below.");

		int choice = 0;
		while (!(choice == 99)) {
			// System.out.println("Menu:\n=================\n1)\tList Users\n2)\tAdd
			// User\n99)\tExit");
			// when a user picks list users
			System.out.println("Menu:\n=================\n1)\tList Users\n2)\tAdd User\n3\tFind user\n99)\tExit");
			choice = Console.getInt("Command: ", 0, 100);
			switch (choice) {
			case 1:
				try {
					if (userDAO.getAll().isEmpty()) {
						System.out.println("List is empty, add some users!");
					}
					// and an if block for null (userDAO.getAll().isEmpty())
					else {
						System.out.println("User List");
						System.out.println(
								"ID\tUsername\tPassword\tFirstName\tLastName\tPhoneNumber\tEmail\tReviewer\tAdmin");
						for (User u : userDAO.getAll()) {
							System.out.println(u.toString());
						}
					}
				} catch (Exception e) {
					System.out.println("The list has no users or does not exist.");
				}
				break;

			// use setters and console prompts to set account
			// also you need to make a new array and copy the other users to it
			case 2:
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
				reviewer = (isReviewer.equalsIgnoreCase("y")) ? true : false;
				admin = (isAdmin.equalsIgnoreCase("y")) ? true : false;

				User u = new User(id, username, password, firstName, lastName, phoneNumber, email, reviewer, admin);
				userDAO.add(u);
				System.out.println(u.toString());
				// add to list
				break;

			case 3:
				id = Console.getInt("User ID to retrieve? ", 0, Integer.MAX_VALUE);
				User user = userDAO.getById(id);
				if (user != null) {
					System.out.println("User found!!!");
					System.out.println(user);
				} else {
					System.out.println("No user found for id: " + id);
					break;
				}
			}
		}
		System.out.println("Bye");
	}

}
