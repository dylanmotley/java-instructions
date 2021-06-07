import java.util.Scanner;

public class RegistrationApp {

	public static void main(String[] args) {
		System.out.println("Welcome");
		
		Scanner sc = new Scanner(System.in);
		
		String fName = getNextString(sc, "Enter your first name: ");
		
		String lName = getNextString(sc, "Enter your last name: ");
		
		int age = getNextInt(sc, "Enter your age: ");
		
		System.out.println("Welcome "+fName+" "+lName+"("+age+")");
		
		
		sc.close();
		System.out.println("Goodbye");
	}

	private static String getNextString(Scanner sc, String prompt) {
		System.out.print(prompt);
		return sc.next();
	}
	private static int getNextInt(Scanner sc, String prompt) {
		System.out.print(prompt);
		return sc.nextInt();
	}
	
	
	
}


