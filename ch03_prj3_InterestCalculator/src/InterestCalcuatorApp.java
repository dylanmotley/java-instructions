import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalcuatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter Loan Amount: ");
			BigDecimal loanAmount = new BigDecimal(sc.next());
			System.out.print("Enter Interest Rate: ");
			BigDecimal interestRate = new BigDecimal(sc.next());
			System.out.println();
			
			BigDecimal interest = loanAmount.multiply(interestRate);
			interest = interest.setScale(2, RoundingMode.HALF_UP);
			
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3);
			
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			
			System.out.println("Loan Amount: "+currency.format(loanAmount));
			System.out.println("Interest Rate: "+percent.format(interestRate));
			System.out.println("Interst: "+currency.format(interest));
			System.out.println();
			
			System.out.println("Continue (y/n)?");
			choice = sc.next();
		}
		
		sc.close();
		System.out.println("Bye");
	}

}
