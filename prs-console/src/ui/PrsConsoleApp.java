package ui;

import com.util.Console;

import business.User;
import db.UserDB;
import interfaces.DAO;

public class PrsConsoleApp {
	private static final String ITEM_NOT_FOUND = "No record found for id: ";

	public static void main(String[] args) {
		System.out.println("Welcome to the PRS Console App!");
		System.out.println();

		DAO<User> usersDAO = new UserDB();

		int command = 0;
		while (command != 99) {
			displayMenu();
			command = Console.getInt("Command: ");
			System.out.println();

			switch (command) {
			case 1:
				System.out.println("Get all Users");
				System.out.println("========================");
				for (User user : usersDAO.getAll()) {
					System.out.println(user);
				}
				break;
			case 2:
				System.out.println("Get a User");
				System.out.println("========================");
				int id = Console.getInt("ID: ");
				User user = usersDAO.get(id);
				if (user != null) {
					System.out.println("User Found: "+user);
				}
				else {
					System.out.println(ITEM_NOT_FOUND +id);
				}
				break;
			case 3:
				System.out.println("Add a User");
				System.out.println("========================");
				String username = Console.getString("Username: ");
				String password = Console.getString("Password: ");
				String firstName = Console.getString("First Name: ");
				String lastName = Console.getString("Last Name: ");
				String phone = Console.getString("Phone: ");
				String email = Console.getString("Email: ");
				boolean reviewer = Console.getBoolean("Reviewer: (y/n)");
				boolean admin = Console.getBoolean("Admin: (y/n) ");
				if (usersDAO.add(new User(username, password, firstName, lastName, phone, email, reviewer, admin))) {
					System.out.println("User Added!");
				}
				else {
					System.out.println("Error adding User.");
				}
				break;
			case 4:
				System.out.println("Delete a User");
				System.out.println("========================");
				id = Console.getInt("ID: ");
				user = usersDAO.get(id);
				if (user != null) {
					usersDAO.delete(user);
					System.out.println("User Deleted: "+user);
				}
				else {
					System.out.println(ITEM_NOT_FOUND+id);
				}
			}
		}
	}

	private static void displayMenu() {
		System.out.println("COMMAND MENU:");
		System.out.println("====================");
		System.out.println("1  - Get all Users");
		System.out.println("2  - Get a User");
		System.out.println("3  - Add a User");
		System.out.println("3  - Delete a User");

	}

}