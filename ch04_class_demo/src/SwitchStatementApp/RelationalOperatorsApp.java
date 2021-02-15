package SwitchStatementApp;

import java.util.Scanner;

public class RelationalOperatorsApp {

	public static void main(String[] args) {
		System.out.println("hi from the relational operators app");
		
		//p 121
		int n1 = 77;
		int n2 = 7;
		
		if (n1 != n2) {
			System.out.println("true");
		}
		else {
			System.out.println("a falsehood");
		}
		String str1 = "Hello";
		String str2 = "Hello";
		// technically this shouldn't work. 
		if (str1 == str2) {
			System.out.println("same");
		}
		else {
			System.out.println("def not true");
		}
		//this is how you should do it.
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("strings contain the same data");
		}
		
		//boolean in a while loop
		boolean isValid = false;
		// loop until user enters 'stop'
		Scanner sc = new Scanner(System.in);
		while (!isValid) {
			System.out.println("Action? ");
			String action = "";
			action = sc.next();
			if (action.equalsIgnoreCase("stop")) {
				isValid = true;
		}
		}
		
		
		
		System.out.println("bye bye bye");
		
	}

}