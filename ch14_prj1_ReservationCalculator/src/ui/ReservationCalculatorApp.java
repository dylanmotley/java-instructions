package ui;

import com.util.Console;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Reservation Calculator");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			Console.getInt(
					"Enter the arrival month (1-12): ", 1, 12);	
			Console.getInt(
					"Enter the arrival day (1-31): ", 1, 31);
			Console.getInt(
					"Enter the arrival year: ");
		}
		System.out.println("Bye!");

	}

}
