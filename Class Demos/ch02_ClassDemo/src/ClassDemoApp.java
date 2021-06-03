
public class ClassDemoApp {

	public static void main(String[] args) {
		System.out.println("Welcome");
		
		// single line comment
		
		/* 
		 * this is a multiple line
		 * comment. 
		 */
		
		//p. 45
		int counter =1;
		double unitPrice = 14.99;
		
		int i1 = 5;
		int i2 = 7;
		
		double d1 = 11.1;
		double d2 = 25.444;
		
		counter = 2;
		unitPrice = 13.99;
		
		d2 = d1;
		d1 = 7.99;
		System.out.println(d1);
		System.out.println(d2);
		
		//casting p.46
		int a = 5;
		double b = 8.3;
		//int sum = a + b; -> invaild
		double sum2 = a + b;
		System.out.println("sum2 ="+sum2);
		int sum3 = a + (int)b;
		
		//p.47 increment a counter
		counter = 1;
		// several ways to increment an int
		counter = counter + 1;
		counter += 1;
		counter++;
		System.out.println("counter = "+counter);
		
		//p.48 Strings
		String fName = "Bob";
		String mName = "Nesta";
		String lName = "Marley";
		String fullname = fName + " " + mName + " " + lName;
		System.out.println(fullname);
	
		
		System.out.println("Bye");

	}

}
