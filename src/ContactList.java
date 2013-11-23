import java.util.Scanner;

public class ContactList {
	private static Directory directory;
	private static Scanner myScanner;
	private static int userInput;

	public static void main(String[] args) {
		System.out.println("Hello User");
		read();
	}

	// Prints the main menu to the console and reads user input
	public static void read() {
		myScanner = new Scanner(System.in);
		System.out.println("Main Menu Options \n" + "\t"
				+ "1. Enter a new person" + "\n" + "\t"
				+ "2. Print the contact list" + "\n" + "\t"
				+ "3. Search by last name" + "\n" + "\t" + "4. Quit and Save"
				+ "\n" + "\n" + "Enter a number between 1 and 4 \n"
				+ "Press 'Enter' to select desired option: ");
		userInput = myScanner.nextInt();
		if (userInput == 1) {
			System.out.println("Enter a new contact");
			//read(addContact);
		} else {
			if (userInput == 2) {
				System.out.println("Print the contact list");
			//	read(printListofContacts)
			} else {
				if (userInput == 3) {
					System.out.println("Search contactsby last name");
				} else {
					if (userInput == 4) {
						System.out.println("Save and Quit");
					} else {
						System.out.println("Invalid menu option"
								+ "\n Please enter a valid menu option");
						userInput = myScanner.nextInt();
					}
				}
				}
			}
		}
	

	public static void loadContactsFromDisk() {
	}

	public static void addContact() {
		System.out.println("You are now adding a new contact. YAY!");

	}

	public static void printListofContacts() {

	}

	public static void searchByLastName() {

	}

	public static void saveAndQuit() {

	}
}
