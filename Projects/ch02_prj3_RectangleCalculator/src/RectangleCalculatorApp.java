import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		// Welcome Message w/ Extra Line
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();

		// Scanner
		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// User Input
			System.out.print("Enter length: ");
			double length = sc.nextDouble();
			System.out.print("Enter width: ");
			double width = sc.nextDouble();

			// Logic
			double area = length * width;
			double perimeter = 2 * length + 2 * width;

			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			
			System.out.println("\nCntinue? (y/n): ");
			choice = sc.next();
		}

		sc.close();
		System.out.println("Bye");

	}

}
