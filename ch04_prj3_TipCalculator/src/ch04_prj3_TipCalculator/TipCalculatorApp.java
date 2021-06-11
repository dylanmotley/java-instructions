package ch04_prj3_TipCalculator;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Tip Calculator");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Cost of meal: ");
			BigDecimal cost = new BigDecimal(sc.next());
			System.out.println();

			NumberFormat percentFormatter = NumberFormat.getPercentInstance();
			NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

			for (double percent = .15; percent <= .25; percent += .05) {
				BigDecimal tip = new BigDecimal(Double.toString(percent));
				BigDecimal amount = cost.multiply(tip);
				BigDecimal total = cost.add(amount);

				System.out.println(percentFormatter.format(percent));
				System.out.println("Tip amount: " + currencyFormatter.format(amount));
				System.out.println("Total amount: " + currencyFormatter.format(total));
				System.out.println();

			}

			System.out.println("Continue (y/n)? ");
			choice = sc.next();

		}

		sc.close();
		System.out.println("Bye");
	}

}
