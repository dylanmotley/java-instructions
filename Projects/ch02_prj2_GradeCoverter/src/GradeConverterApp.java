import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		
		// Print Welcome Message
		System.out.println("Welcome to the Letter Grade Converter");
		
		//Extra Line
		System.out.println();
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		
		// Variable
		String choice = "y";
		
		// Loop
		while (choice.equalsIgnoreCase("y")) {
			
			// User Input
			System.out.print("Enter numeric grade: ");
			int numericGrade = sc.nextInt();
			
			// Logic
			String letterGrade = "F";
			if (numericGrade >= 88) {
				letterGrade = "A";
			}
			else if (numericGrade >= 80) {
				letterGrade = "B";
			}
			else if (numericGrade >= 68) {
				letterGrade = "C";
			}
			else if (numericGrade >= 60) {
				letterGrade = "D";
			}
			System.out.println("Letter Grade: "+letterGrade);	
			System.out.println();
			
			System.out.print("Continue (y/n)? ");
			choice = sc.next();
		}
		
		

	}

}
