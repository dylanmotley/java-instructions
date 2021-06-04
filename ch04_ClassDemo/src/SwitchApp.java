import java.util.Scanner;

public class SwitchApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the menu");
		
		System.out.println("You're at a crossroads....");
		System.out.println("You can go N, S, E, W...");
		System.out.println("Which way will you go?");
		
		
		Scanner sc = new Scanner(System.in);
		
		String direction = sc.next();
		
		switch (direction) {
		case "n":
		case "N":
			System.out.println("You chose North!");
			break;
		case "s":
		case "S":
			System.out.println("You chose South!");
			break;
		case "e":
		case "E":
			System.out.println("You chose East!");
			break;
		case "w":
		case "W":
			System.out.println("You chose West!");
			break;
		default:
			System.out.println("You chose Invalid direction!");
			break;
		}
		
		
		
		
		sc.close();
		System.out.println("Bye");

	}

}
