import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		// Welcome Message And Print Blank Line
		System.out.println("Student Registration Form");
		
		// Extra Line
		System.out.println();
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		// Prompt User For Input
		System.out.print("Enter first name: ");
		String firstName = sc.next();
		System.out.print("Enter last name: ");
		String lastName = sc.next();
		System.out.print("Enter year of birth: ");
		int birthYear =sc.nextInt();
		
		// Extra Line
		System.out.println();
		
		// Define Variables
		String fullName = firstName +" " +lastName;
		String tempPwd = firstName +"*" +birthYear;
		
		// Output
		System.out.println("Welcome " +fullName+"!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " +tempPwd);
		
		// Close Scanner
		sc.close();
		
		// Bye Message
		System.out.println("Bye");
	}

}
