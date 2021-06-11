import java.util.Scanner;

public class TablePowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table");
		System.out.println();

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase(choice)) {
			System.out.println("Enter an integer:");
			int num = sc.nextInt();
			System.out.println();

			String table = "";
			table += "Number\tSquared\tCubed\n";
			table += "======\t=======\t=====\n";

			for (int i = 1; i <= num; i++) {
				int square = i * i;
				int cube = i * i * i;
				table += i + "\t" + square + "\t" + cube + "\n";
			}

			System.out.println(table);

			System.out.println("Continue (y/n?): ");
			choice = sc.next();
			System.out.println("Bye");

		}

		sc.close();
	}

}
