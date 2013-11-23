import java.util.Scanner;

public class ContactList {
	private static Directory directory;
	private Scanner myScanner;

	public static void main(String[] args) {

		// Prints the main menu to the console
		System.out
				.print("Press a number between 1 and 4 and hit Enter to do an action \n\n"
						+ "\t"
						+ "1. Enter a new person"
						+ "\n"
						+ "\t"
						+ "2. Print the contact list"
						+ "\n"
						+ "\t"
						+ "3. Search by last name"
						+ "\n"
						+ "\t"
						+ "4. Quit and Save");}

		public void read(){
			myScanner = new Scanner(System.in);
			int userInput = myScanner.nextInt();
				if (userInput == 1) {
					System.out.println("Enter a new person");
				}
				else {
					if (userInput == 2) {
						System.out.println("Print the contact list");
					}
					else {
						if (userInput == 3) {
							System.out.println("Search by last name");
						}
						else {
							if (userInput == 4) {
								System.out.println("Quit and Save");
							}
							else {
						}
					}
				}
		}

	public static void loadContactsFromDisk() {
	}

	public static void addContact() {

	}

	public static void printListofContacts() {

	}

	public static void searchByLastName() {

	}

	public static void saveAndQuit() {

	}
}
