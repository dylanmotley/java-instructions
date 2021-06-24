package ui;

import com.util.Console;

import business.BasicCalculations;

public class CalculationApp {

	public static void main(String[] args) {
		int nbr = Console.getInt("Enter Int: ");
		System.out.println(BasicCalculations.square(nbr));
		
		String str = Console.getString("Enter String: ");
		System.out.println("Number of A's: "+BasicCalculations.countA(str));
		
		

	}

}
