/* Name: Karim A. Sammouri
 * Class: CSE 174 - D
 * Instructor: Dr. Manar Mohamed
 * Date: Nov 10, 2019
 * Description: This program asks the user for a number of lockers then 
 * simulates a scenario where every locker's owner from left to right opens 
 * or closes the lockers that are multiples of his locker's number in 
 * successive stages. After the simulation, the program prints the locations 
 * of the lockers that are left open.
 */

// Importing Scanner class to allow user input.
import java.util.Scanner;

public class Project11 {

	// Initializing global variable to the Scanner object.
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		// Utilizing while loop to keep prompting user for valid input and
		// ensuring repetition unless user exits.
		while (true) {

			System.out.print("Number of lockers (at least 3): ");
			int numOfLockers = in.nextInt();

			if (numOfLockers > 2) {

				System.out.print("Show stages [y/n]? ");
				char choice = in.next().charAt(0);

				if (choice == 'y') {
					alterAndPrint(numOfLockers);
				}

				else if (choice == 'n') {
					alterWithoutPrinting(numOfLockers);
				}

				System.out.print("Do you want to continue [y/n]? ");
				choice = in.next().charAt(0);
				if (choice == 'n') {
					System.out.println("End");
					break;
				}
			} else
				System.out.println("Invalid input!");
		}
	}

	// Implementing method that, in tandem with alterLockers() and
	// printStages(), alters a boolean[] array representing the lockers 
	// in successive stages, prints the states of the lockers and how 
	// many are open or closed in every stage, and finally displays the 
	// locations of the open lockers after the
	// alterations with openLockers().
	public static void alterAndPrint(int numOfLockers) {
		boolean[] lockers = new boolean[numOfLockers];
		for (int i = 0; i < lockers.length; i++) {
			printStages(lockers = alterLockers(i + 1, lockers));
		}

		// Determining what the size of the array representing the locations of
		// the open lockers should be.
		int count = 0;
		for (boolean x : lockers) {
			if (x == true)
				count++;
		}
		int[] locations = new int[count];

		// Sending boolean[] lockers to openLockers() to be analyzed for the
		// locations of the open lockers and then saving the locations in int[]
		// locations.
		int[] openLockers = openLockers(locations, lockers);

		// Printing the locations of the open lockers.
		System.out.print("Open: ");
		for (int x : openLockers)
			System.out.print(x + 1 + " ");
		System.out.println();
	}

	// Implementing method that, in contrast to alterAndPrint(), just alters a
	// boolean[] array representing the lockers in successive stages with
	// alterLockers() and then displays the locations of the open lockers after
	// the alterations with openLockers().
	public static void alterWithoutPrinting(int numOfLockers) {
		boolean[] lockers = new boolean[numOfLockers];
		for (int i = 0; i < lockers.length; i++) {
			lockers = alterLockers(i + 1, lockers);
		}

		// Determining what the size of the array representing the locations of
		// the open lockers should be.
		int count = 0;
		for (boolean x : lockers) {
			if (x == true)
				count++;
		}
		int[] locations = new int[count];

		// Sending boolean[] lockers to openLockers() to be analyzed for the
		// locations of the open lockers and saved in int[] locations.
		int[] openLockers = openLockers(locations, lockers);

		// Printing the locations of the open lockers.
		System.out.print("Open: ");
		for (int x : openLockers)
			System.out.print(x + 1 + " ");
		System.out.println();
	}

	// Implementing method that alters the given boolean[] array representing
	// the lockers based on the multiples of the given int student.
	public static boolean[] alterLockers(int student, boolean[] lockers) {
		for (int i = 0; i < lockers.length; i++) {
			if ((i + 1) % student == 0) {
				if (lockers[i] == true)
					lockers[i] = false;
				else
					lockers[i] = true;
			}
		}
		return lockers;
	}

	// Implementing method that processes the given boolean[] array representing
	// the lockers and prints the states of the lockers and how many of them are
	// open or closed.
	public static void printStages(boolean[] lockers) {
		int openCount = 0, closedCount = 0;
		for (boolean x : lockers) {
			if (x == true) {
				System.out.print("O");
				openCount++;
			} else {
				System.out.print("-");
				closedCount++;
			}
		}
		System.out.printf("\t\tOpen: %-4d  Closed: %-4d", openCount,
				closedCount);
		System.out.println();
	}

	// Implementing method that processes the given boolean[] array representing
	// the lockers, determines and saves the locations of the open lockers in
	// the given int[] array, and then returns the array.
	public static int[] openLockers(int[] locations, boolean[] lockers) {
		int j = 0;
		for (int k = 0; k < locations.length; k++) {
			while (j < lockers.length) {
				if (lockers[j] == true) {
					locations[k] = j;
				}
				j++;
				if (locations[k] == j - 1)
					break;
			}
		}
		return locations;
	}
}