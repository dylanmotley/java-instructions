import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter an integer that's greater than 0 and less than 10: ");
			int number = sc.nextInt();
			
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
			
			System.out.println("The factorial of " +number +" is "+factorial);
			System.out.println();
			
			System.out.println("Continue?");
			choice = sc.next();
		
		}

		System.out.println("Bye");
		sc.close();
	}

}