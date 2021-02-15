package ch02_Grade_Assignment;

import java.util.Scanner;

public class GradeAssignment {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//ask for numbers. return a letter grade based on if/else.
		//ask the user to continue by asking y'n.
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Please enter a numerical grade: ");
			int grade = sc.nextInt();
			System.out.println(grade);
			if (grade < 60) {
				System.out.println("F");
			}
			else if (grade <= 67) {
				System.out.println("D");
			}
			else if (grade <= 79) {
				System.out.println("C");
			}
			else if (grade <= 87) {
				System.out.println("B");
			}
			else {
				System.out.println("A");
			}
			System.out.println("Continue? (y/n) ");
			choice = sc.next();
	}
}
}
