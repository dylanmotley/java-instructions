import java.util.Scanner;

public class DataValidationApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			double length = getDoubleWithinRange(sc, "Enter length: ", 0, 1000000);
			double width = getDoubleWithinRange(sc, "Enter width: ", 0, 1000000);

			double area = length * width;
			double perimeter = 2 * length + 2 * width;

			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println();
			
			choice = getChoiceString(sc, "Continue? (y/n)" , "y", "n");
			System.out.println();

		}

		sc.close();
		System.out.println("Bye");

	}

	public static double getDoubleWithinRange(Scanner sc, String prompt, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d <= min) {
				System.out.println("Error! Number must be greater than " + min + ".");
			} else if (d >= max) {
				System.out.println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}
		}
		return d;
	}

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid number. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	private static String getRequiredString(Scanner sc, String prompt) {
		String s = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			s = sc.nextLine();
			if (s.equals("")) {
				System.out.println("Error! This entry is required. Try again.");
			} else {
				isValid = true;
			}
		}
		return s;
	}

	// add another new method that forces the user to enter one of two strings
	private static String getChoiceString(Scanner sc, String prompt, String s1, String s2) {
		String s = "";
		boolean isValid = false;
		while (!isValid) {
			s = getRequiredString(sc, prompt);
			if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2)) {
				System.out.println("Error! Entry must be '" + s1 + "' or '" + s2 + "'. Try again.");
			} else {
				isValid = true;
			}
		}
		return s;
	}

}
