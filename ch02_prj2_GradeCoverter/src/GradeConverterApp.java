import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Coverter");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		String letterGrade = "F";

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter Grade: ");
			int grade = sc.nextInt();
			if (grade >= 90) {
				letterGrade = "A";
			} else if (grade >= 80) {
				letterGrade = "B";
			} else if (grade >= 67) {
				letterGrade = "C";
			} else if (grade >= 60) {
				letterGrade = "D";
			} else {
			}
				System.out.println("Letter Grade: "+letterGrade);

			System.out.println("Continue? (y/n?)");
			choice = sc.next();
		}

		sc.close();
		System.out.println("Bye");
	}

}
