import java.util.Scanner;

public class ScannerApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Good morning!");
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			// p 61
			// 'next' method
			System.out.print("Hi, what is ur name?? ");
			String name = sc.next();
			String name2 = sc.next();
			System.out.println("Howdy, " + name + " " + name2);

			// 'nextline'

			// clear the file
			sc.nextLine();
			System.out.print("Enter a sentence: ");
			String sentence = sc.nextLine();
			System.out.println(sentence);

			// next int
			System.out.println("Enter a whole number: ");
			int n1 = sc.nextInt();
			System.out.println("Good job. You entered: " + n1);
			if (n1 >= 10) {
				System.out.println("Wow what a big number! It's greater than or equal to ten!!");
			}
			else {
				System.out.println("wow this number is PUNY. How embarassing!!");
			}

			// next double
			System.out.println("Enter a decimal number: ");
			double d1 = sc.nextDouble();
			System.out.println("Good job. You entered: " + d1);
			System.out.println("Do you want to continue (y/n)?");
			choice = sc.next();
			if (choice.equals("y")) {
				System.out.println("You entered a lowercase y");
			}
			else if (choice.equals("k")) {
				System.out.println("u printed k. r u ok?");
			}
			else {
				System.out.println("You entered something else: " + choice);
			}
		}
		System.out.println("Bye Felicia");
		sc.close();
	}

}
