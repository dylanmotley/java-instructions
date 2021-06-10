import java.text.NumberFormat;
import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcoem to the Temperature Converter");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter degrees in Fahrenheit: ");
			double fNumber = sc.nextDouble();
			
			double celsius = (fNumber - 32) * 5/9;
			
			NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(2);
			
			System.out.println("Degree in Celsius "+number.format(celsius));
			
			System.out.println("Continue (y/n)? ");
			choice = sc.next();
		}

		
		
		sc.close();
		System.out.println("Bye");
	}

}
