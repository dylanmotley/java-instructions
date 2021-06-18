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
		int n4 = 27;
		System.out.println(n1 + "+" + n2 +"+"+n3 +"+" +n4 +"=" + addNumbers(n1, n2, n3, n4));
		
		System.out.println("Big Sum = "+addNumbers(4,7,19,24,67,13));

		System.out.println("End.");

	}

	private static int addTwo(int n1, int n2) {
		return n1 + n2;
	}

	private static int addThree(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	private static int addNumbers(int... numbers) {
		int sum = 0;
		
		for (int i: numbers) {
			sum += i;
		}
		
		return sum;
	}
}
