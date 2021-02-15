
public class StringsApp {

	public static void main(String[] args) {
		System.out.println("Hello Strings!");
		
		String firstName = "Celina";
		String lastName = "Junker";
		String fullName = firstName + " " + lastName;
		
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Full name: " + fullName);
		
		fullName = "Sarah";
		fullName += " Connor";
		System.out.println(fullName);
		fullName += 5;
		System.out.println(fullName);
		System.out.println("Farewell \n Strings");
	}

}
