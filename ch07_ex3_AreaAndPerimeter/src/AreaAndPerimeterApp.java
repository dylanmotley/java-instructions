import java.util.Scanner;
import java.text.NumberFormat;

public class AreaAndPerimeterApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println();

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Enter length: ");
            double length = Double.parseDouble(sc.nextLine());

            System.out.print("Enter width:  ");
            double width = Double.parseDouble(sc.nextLine());

           Rectangle r = new Rectangle(length, width);
            
            // format and display output
            String message = 
                "Area:         " + r.getAreaNumberFormat() + "\n" +
                "Perimeter:    " + r.getPerimeterNumberFormat() + "\n";
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println("Bye!");
    }  
}
