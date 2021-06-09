
public class BmdbConsoleApp {

	public static void main(String[] args) {
		
		int ID = Console.getInt("ID?");
		String Title = Console.getString("Title?");
		int Year = Console.getInt("Year?");
		String Rating = Console.getString("Rating?");
		String Director = Console.getString("Director?");
		
		Movie m = new Movie(ID, Title, Year, Rating, Director);
		
		System.out.println("Product Summary: ");
		System.out.println(m);
		

	}

}
