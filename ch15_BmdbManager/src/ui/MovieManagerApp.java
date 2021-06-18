package ui;

import com.util.Console;

import business.Movie;
import interfaces.DAO;
import text.MovieTextFile;

public class MovieManagerApp {
	private static final String ITEM_NOT_FOUND = "No item found for id: ";

	public static void main(String[] args) {
		System.out.println("Welcome to the Movie Manager - Text File Version");
		System.out.println();
		
		// creating instance of ItemTextFile should create our file
		// on the first run of this app.
		DAO<Movie> moviesDAO = new MovieTextFile();
		
		int command = 0;
		while (command != 9) {
			displayMenu();
			command = Console.getInt("Command: ");
			System.out.println();
			
			switch (command) {
				case 1:
					// get all
					System.out.println("Get all Movies");
					System.out.println("=============================");
					for (Movie item: moviesDAO.getAll()) {
						System.out.println(item);
					}
					break;
				case 2:
					// get by id
					System.out.println("Get Movie by ID");
					System.out.println("=============================");
					int id = Console.getInt("ID: ");
					Movie movie = moviesDAO.get(id);
					if (movie != null) {
						System.out.println("Item Found: "+movie);
					}
					else {
						System.out.println(ITEM_NOT_FOUND + id);
					}
					break;
				case 3:
					// add
					System.out.println("Add Movie");
					System.out.println("=============================");
					id = Console.getInt("ID: ");
					String title = Console.getLine("Title: ");
					int year = Console.getInt("Year: ");
					String rating = Console.getLine("Rating: ");
					String director = Console.getLine("Director: ");
					if (moviesDAO.add(new Movie(id, title, year, rating, director))) {
						System.out.println("Movie added!");
					}
					else {
						System.out.println("Error adding movie.");
					}
					break;
				case 4:
					// update
					System.out.println("Update Movie");
					System.out.println("=============================");
					id = Console.getInt("ID: ");
					movie = moviesDAO.get(id);
					if (movie != null) {
						String newTitle = Console.getLine("New title: ");
						movie.setTitle(newTitle);
						moviesDAO.update(movie);
						System.out.println("Movie updated!");
					}
					else {
						System.out.println(ITEM_NOT_FOUND + id);
					}					
					break;
				case 5:
					// delete
					System.out.println("Delete an Movie");
					System.out.println("=============================");
					id = Console.getInt("ID: ");
					movie = moviesDAO.get(id);
					if (movie != null) {
						moviesDAO.delete(movie);
						System.out.println("Movie Deleted: "+movie);
					}
					else {
						System.out.println(ITEM_NOT_FOUND + id);
					}
					break;
				case 9:
					// exit
					break;
				default:
					System.out.println("Invalid command!  Try again.");
					break;
			}
		}		
		
		
		
		
		
		
		System.out.println("Bye");

	}
	
	private static void displayMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("====================");
		System.out.println("1 - Get all movies");
		System.out.println("2 - Get an movie");
		System.out.println("3 - Add an movie");
		System.out.println("4 - Update an movie");
		System.out.println("5 - Delete an movie");
		System.out.println("9 - Exit");
		System.out.println();
	}
	

}