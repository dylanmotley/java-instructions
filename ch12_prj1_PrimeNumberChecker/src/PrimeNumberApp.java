import java.util.ArrayList;

import com.util.Console;

public class PrimeNumberApp {

    public static void main(String[] args) {
        System.out.println("Prime Number Checker\n");

        String again = "y";
        while (again.equals("y")) {

            // get number
            int number = Console.getInt(
                    "Please enter an integer between 1 and 5000: ", 0, 5001);

            // get list of factors
            ArrayList<Integer> factors = new ArrayList<>();
            for (int i = 1; i < number + 1; i++) {
                int remainder = number % i;
                if (remainder == 0) {
                    factors.add(i);
                }
            }
            
            // display message
            if (factors.size() == 2) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is NOT a prime number.");
                System.out.print("It has " + factors.size() + " factors: ");
                for (int factor : factors) {
                    System.out.print(factor + " ");
                }
                System.out.println();            
            }
            System.out.println();
            
            // try again?
            again = Console.getString("Try again? (y/n): ");            
            System.out.println();
        }
        System.out.println("Bye!");
    }
}