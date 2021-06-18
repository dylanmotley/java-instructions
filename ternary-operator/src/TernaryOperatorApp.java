
public class TernaryOperatorApp {

	public static void main(String[] args) {
		int num = 3;
		System.out.println("Number is: "+num);
		String msg = "";
		if(num > 10) {
		    msg = "Number is greater than 10";
		}
		else {
		    msg = "Number is less than or equal to 10";
		}
		
		System.out.println(msg);
		
		System.out.println("Ternary Operator!");
		String msg2 = num > 10 ? "Number greater than 10" : "Nbr less than equal 10";
		System.out.println(msg2);
		
		// Nested Ternary
		String msg3 = num > 10 ? "Number is greater than 10" 
				  : (num > 5 ? "Number is greater than 5" : "Number is less than equal to 5");
		System.out.println(msg3);
		
		// Nested with method
		String msg4 = (num % 2 == 1) ? "Number is odd, times 2 = "+timesTwo(num) 
				  : (num > 5 ? "Number is greater than 5" : "Number is less than equal to 5");
		System.out.println(msg4);

	}
	
	private static int timesTwo(int i) {
		return (i * 2);
	}
	

}
