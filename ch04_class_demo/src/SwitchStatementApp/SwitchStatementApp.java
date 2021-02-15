package SwitchStatementApp;

import java.util.Scanner;

public class SwitchStatementApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Switch Statemet Demo");

		Scanner sc = new Scanner(System.in);
		String direction = "";

		while (!direction.equalsIgnoreCase("x")) {
			// come to an intersection, where do we go?
			System.out.println("You have come to an intersection. Which way do you want to go?");
			System.out.println("N - North");
			System.out.println("S - South");
			System.out.println("E - East");
			System.out.println("W - West");
			System.out.println("X - Exit");
			direction = sc.next();
			
			
			switch (direction) {
				case "N":
				case "n":
					System.out.println("North... it is cold.");
					break;
				case "S":
				case "s":
					System.out.println("South... it is toast warm. Hope you brought sunscreen.");
					break;
				case "E":
				case "e":
					System.out.println("East... tsunamis and bracing winds.");
					break;
				case "W":
				case "w":
					System.out.println("West... shit's on fire.");
					break;
				case "X":
					// do nothing, code will exit
					break;
			}
		}
		
		

		System.out.println("Bye");
	}

}
