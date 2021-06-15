import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // declare monthNames and monthSales arrays
        String[] monthName = new String [12];
        monthName[0] = "January";
        monthName[1] = "Febuary";
        monthName[2] = "March";
        monthName[3] = "April";
        monthName[4] = "May";
        monthName[5] = "June";
        monthName[6] = "July";
        monthName[7] = "August";
        monthName[8] = "September";
        monthName[9] = "October";
        monthName[10] = "November";
        monthName[11] = "December";
        
        double[] monthSales = new double [12];
        monthSales[0] = 1700.94;
        monthSales[1] = 2100.37;
        monthSales[2] = 950.59;
        monthSales[3] = 3600.72;
        monthSales[4] = 7200.48;
        monthSales[5] = 2100.65;
        monthSales[6] = 780.30;
        monthSales[7] = 11050.61;
        monthSales[8] = 9000.38;
        monthSales[9] = 1300.93;
        monthSales[10] = 4590.25;
        monthSales[11] = 21000.72;
        
        


        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");
            
            // validate input
            if (monthNumber < 1 || monthNumber > monthName.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            
            // get the index number for the month
            // and display the month name and sales
            int monthIndex = monthNumber - 1;
            Console.displayLine("Sales for "+monthName[monthIndex]
            		+": "+currency.format(monthSales[monthIndex]));


            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        // display the total sales for the year
        
        
        Console.displayLine();
    }    

}
