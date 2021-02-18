import java.util.Scanner;

public class MyConsole extends Console {
    private static Scanner sc = new Scanner(System.in); 
	
	public static String getString(String prompt) {
	        System.out.print(prompt);
	        boolean isValid = false;
	        String s = "";
	        while (!isValid) {
		        s = sc.next();  // read user entry
		        if (s.isEmpty()) {
		        	System.out.println("Error! This entry is required.");
		        }
		        else {
		        	isValid = true;
		        }
	        }
	        sc.nextLine();  // discard any other data entered on the line
	        return s;
	    }
}
