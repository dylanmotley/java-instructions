import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome To The Calculator App!");
		
		// p. 55 scanner
		Scanner sc = new Scanner(System.in);
		
		// p. 69 while loop start
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		System.out.print("Enter a whole number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter a whole number: ");
		int n2 = sc.nextInt();
		int sum = n1 + n2;
		System.out.println("Sum = "+sum);

		int difference = n2 - n1;
		System.out.println("Difference = "+difference);

		int product = n2 * n1;
		System.out.println("Product = "+product);
		
		// quotient
		System.out.println("Quotient = "+(n2/n1));
		
		int modulus = n2%n1;
		System.out.println("Modulus = "+modulus);
		
		// while loop end
		System.out.print("Continue? (y/n)");
		choice = sc.next();
		}
		
		
		System.out.println("Bye!");
		sc.close();
	}

}
