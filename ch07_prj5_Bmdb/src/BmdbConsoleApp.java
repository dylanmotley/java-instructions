
public class BmdbConsoleApp {

	public static void main(String[] args) {

		System.out.println("Welcome");

		int id = Console.getInt("id?");
		String title = Console.getLine("title?");
		int year = Console.getInt("year?");
		String rating = Console.getString("rating?");
		String director = Console.getLine("director?");

		Movie m1 = new Movie(id, title, year, rating, director);
		Movie m2 = new Movie();

		System.out.println("Bye");

	}

}
