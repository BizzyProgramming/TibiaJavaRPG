package bbrown2025;

import java.util.Scanner;

public class UserInterface {

	static Scanner sc = new Scanner(System.in);

	// Menu to login or create account
	public static int menuLoginOrCreate() {
		int option;
		do {
			System.out.println("Tibia RPG - Main Menu");
			System.out.println("1] Login");
			System.out.println("2] Create Account");
			System.out.println("3] Exit");
			option = sc.nextInt();
		} while (option < 0 || option > 2);
		return option;
	}

	// Menu: Character options after login
	public static int menuCharacterOptions() {
		int option;
		do {
			System.out.println("Character Menu");
			System.out.println("1] Create New Character");
			System.out.println("2] View All Character");
			System.out.println("3] Delete Character");
			System.out.println("4] Update Character");
			System.out.println("0] Logout");
			option = sc.nextInt();
			sc.nextLine();
		} while (option < 0 || option > 4);
		return option;
	}

	// Prompt for account creation
	public static String[] createAccountPrompt() {
		String[] account = new String[2];
		System.out.println("Create New Account");
		System.out.println("Enter Username: ");
		account[0] = sc.nextLine();
		System.out.println("Enter password: ");
		account[1] = sc.nextLine();
		return account;
	}

	// Prompt for login
	public static String[] loginPrompt() {
		String[] credentials = new String[2];
		System.out.println("Login");
		System.out.println("Username: ");
		credentials[0] = sc.nextLine();
		System.out.println("Password: ");
		credentials[1] = sc.nextLine();
		return credentials;
	}

}
