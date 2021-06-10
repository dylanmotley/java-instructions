import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Preimeter Calculator");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter Length: ");
			double length = sc.nextDouble();
			System.out.print("Enter Width: ");
			double width = sc.nextDouble();

			double area = width * length;
			double perimeter = (2 * width) + (2 * length);

			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);

			System.out.println("Continue? (y/n)? ");
			choice = sc.next();

		}
		
		sc.close();
		System.out.println("Bye");
	}
}
