/**
 * Karim Sammouri
 * CSE 174 - D
 * Dr. Manar Mohamed
 * Nov 22, 2019
 * This is a shopping cart application that tracks the 
 * barcode, name, number of units, and unit price of each 
 * item and allows the user to add to the cart, list the 
 * items, and calculate the total bill.
 */
import java.util.Scanner;
public class Lab13ShoppingApp {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {

		// Create cart object with the capacity of 10 orders
		ShoppingCart cart = new ShoppingCart(10);

		boolean exit = false;

		while (!exit) {
			char op = menu();

			switch (op) {
				case 'A' :
					// Invoking addOrder() in tandem with
					// readOrderFromKeyboard() in order to add an item to cart.
					cart.addOrder(readOrderFromKeyboard());
					break;
				case 'B' :
					// Invoking listOrders() in order to list items in the cart.
					cart.listOrders();
					break;
				case 'C' :
					// Invoking listOrders() in order to list items in the cart,
					// printing the bill, and asking the user
					// if he is willing to proceed with the payment. If so, the
					// cart is emptied.
					cart.listOrders();
					System.out.printf("Total: $%.2f%n", cart.getBill());
					System.out.print("Are you sure (yes/no):");
					String response = in.next();
					if (response.equals("yes")) {
						cart = new ShoppingCart(10);
						System.out.println("Done");
					} else if (!response.equals("no"))
						System.out.println("Invalid input");
					break;
				case 'X' :
					// Asking the user if he is willing to exit the program. If
					// so, program exits, else if input is valid,
					// the program continues.
					System.out.print("Are you sure (yes/no):");
					String response2 = in.next();
					if (response2.equals("yes")) {
						exit = true;
					} else if (!response2.equals("no"))
						System.out.println("Invalid input");
					break;
				default :
					System.out.println("Wrong Option");
			}
		}
	}

	/**
	 * prints a menu and returns a chosen option.
	 * 
	 * @return char The chosen option from the menu.
	 */
	public static char menu() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\nShopping Cart App");
		System.out.println("\tA. Add an item to the Shopping Cart");
		System.out.println("\tB. List items in the Shopping Cart");
		System.out.println("\tC. Pay the bill");
		System.out.println("\tX. Exit");
		System.out.println();
		System.out.print("Option:");

		return keyboard.next().toUpperCase().charAt(0);
	}

	/**
	 * Prompting the user for inputs and storing them.
	 * 
	 * @return Order A new object initialized with the user's inputs.
	 */
	public static Order readOrderFromKeyboard() {
		System.out.println("***Enter the Details:");
		System.out.printf("%12s", "Bar Code: ");
		int barcode = in.nextInt();
		System.out.printf("\n%12s", "Name: ");
		String name = in.next();
		System.out.printf("\n%12s", "Units: ");
		int units = in.nextInt();
		System.out.printf("\n%12s", "Unit Price: ");
		double unitPrice = in.nextDouble();
		return new Order(barcode, name, units, unitPrice);
	}
}
