package ui;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome");

		int n1 = 5;
		int n2 = 8;

		System.out.println("Add 2 numbers");
		System.out.println(n1 + "+" + n2 + "=" + addTwo(n1, n2));

		System.out.println("Add 3 numbers");
		int n3 = 22;
		System.out.println(n1 + "+" + n2 +"+"+n3 + "=" + addThree(n1, n2, n3));

		System.out.println("Add 4 numbers");

		System.out.println("End.");

	}

	private static int addTwo(int n1, int n2) {
		return n1 + n2;
	}

	private static int addThree(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	
}
