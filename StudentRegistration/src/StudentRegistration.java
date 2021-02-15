import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		//allow student to enter fn, ln, dob
		Scanner sc = new Scanner(System.in);
		System.out.println("Student Registration Form");
		System.out.println("Enter First Name: ");
		String firstName = sc.nextLine();
		//System.out.println(firstName);
		System.out.println("Enter Last Name: ");
		String lastName = sc.nextLine();
		System.out.println("Enter Year of Birth");
		String birthYear = sc.nextLine();
		System.out.println("Welcome " + firstName + " " + lastName +"! Your temporary password is: " + firstName + "*" + birthYear);
	}

}
