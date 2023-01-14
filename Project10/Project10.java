/* Name: Karim A. Sammouri
 * Class: CSE 174 - D
 * Instructor: Dr. Manar Mohamed
 * Date: Nov 3, 2019
 * Description: This program displays a menu of options to the user, displaying
 * prompts for more inputs depending on the user's choice, and then prints the
 * results depending on the user's choice and inputs.
 */

// Importing the Scanner class to allow user input.
import java.util.Scanner;
public class Project10 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		// Utilizing while loop to ensure the program repeats unless the user
		// exits.
		int choice = 0;
		while (choice != 4) {

			// Invoking method that displays the program's menu.
			menu();

			// Utilizing while loop to ensure the users keeps getting prompted
			// for a choice unless the user enters a valid input.
			while (true) {

				// Prompting user for a choice and then storing the input.
				System.out.print("Enter a number [1-4]: ");
				choice = in.nextInt();

				// Utilizing if-else statements to branch depending on the
				// user's input.
				if (choice == 1) {
					System.out.println(
							"The result is: " + alternatingSum() + "\n");
					break;
				} else if (choice == 2) {
					String reverse = "";
					int[] array = reverse();
					for (int i = 0; i < array.length; i++) {
						reverse += array[i] + " ";
					}
					System.out
							.println("The reverse array is: " + reverse + "\n");
					break;
				} else if (choice == 3) {
					run();
					break;
				} else if (choice == 4) {
					System.out.println("***Exit");
					break;
				} else {
					System.out.println("Invalid input!");
					continue;
				}
			}
		}
	}

	// Displays the program's menu.
	public static void menu() {

		System.out.println("PROGRAM #10");
		System.out.println("1- alternatingSum");
		System.out.println("2- reverse");
		System.out.println("3- Run");
		System.out.println("4- Exit");
	}

	// Reads values from the input and then saves them
	// inside an array and returns the array.
	public static int[] getValues() {

		// Initializing array[] to an arbitrary array to bypass compiler error.
		int[] array = new int[0];

		// Utilizing while loop to ensure the user keeps getting prompted unless
		// a valid input is entered.
		while (true) {

			// Prompting the user a limit and then storing it.
			System.out.print("How many integer values: ");
			int limit = in.nextInt();

			// Utilizing an if-else statement in tandem with the while loop to
			// filter out invalid inputs. If the input is valid, the length of
			// the array is set and the array gets filled step by step.
			if (limit > 0) {
				array = new int[limit];
				System.out.print("Enter the numbers: ");
				for (int i = 0; i < array.length; i++) {
					array[i] = in.nextInt();
				}
				break;
			} else {
				System.out.println("Invalid input!");
				continue;
			}
		}
		return array;
	}

	// After leveraging getValues() to obtain a sequence of values from
	// the user and then storing it in an array, returns the alternating
	// sum of the sequence.
	public static int alternatingSum() {

		System.out.println("\n** alternatingSum **");

		// Leveraging getValues() to obtain an array of values and initializing
		// sum.
		int[] array = getValues();
		int sum = 0;

		// Multiplying every other element in the array by -1.
		for (int i = 1; i < array.length; i += 2) {
			array[i] *= -1;
		}

		// Adding the elements of the array after negating every other element
		// to calculate the alternating sum.
		for (int elements : array) {
			sum += elements;
		}
		return sum;
	}

	// After leveraging getValues() to obtain a sequence of values from the user 
	// and then storing it in an array, returns a reversed array.
	public static int[] reverse() {

		System.out.println("\n** reverse **");

		// Leveraging getValues() to obtain an array of values and initializing
		// reverseArray[] to hold the reversed sequence.
		int[] array = getValues();
		int[] reverseArray = new int[array.length];

		// Filling reverseArray[] with the values of array[] in a reversed
		// fashion.
		for (int i = 0; i < array.length; i++) {
			reverseArray[array.length - 1 - i] = array[i];
		}
		return reverseArray;
	}

	// Generates 20 random dice tosses, saves them inside an array, prints the 
	// results of the tosses, and marks the longest run.
	public static void run() {

		System.out.println("\n** run **");
		System.out.println("The sequence of numbers is: ");

		// Initializing array that will hold the 20 random dice tosses and
		// several variables to be used.
		int[] array = new int[20];
		int currentRunLength = 0, maxRunLength = Integer.MIN_VALUE,
				maxRunIndex = 0;
		boolean runPresent = true;

		// Filling array[] with 20 randomly generated numbers from 1 - 6,
		// simulating the 20 random dice tosses.
		for (int i = 0; i < array.length; i++) {
			array[i] = 1 + (int) (Math.random() * 6);
		}

		// Utilizing nested for loops to determine the length and index of the
		// longest run.
		for (int i = 0; i < array.length; i++) {
			for (int i2 = i; i2 < array.length; i2++) {
				if (array[i2] == array[i]) {
					currentRunLength++;
					if (currentRunLength > maxRunLength) {
						maxRunLength = currentRunLength;
						maxRunIndex = i;
					}
				} else {
					break;
				}
			}
			currentRunLength = 0;
		}

		// Flagging the variable runPresent true or false depending on whether a
		// run was present in the array. This variable will be leveraged on the
		// coming lines to decide on whether to print certain formatting
		// elements.
		if (maxRunLength == 1) {
			runPresent = false;
		}

		// Printing the randomly generated sequence of values and, depending on
		// the sequence, marks the longest run with a set of parentheses.
		for (int i = 0; i < array.length; i++) {
			if (i == maxRunIndex && runPresent) {
				System.out.print("(");
			}
			if (i == maxRunIndex + maxRunLength && runPresent) {
				System.out.print(") ");
			}
			if (i == maxRunIndex + maxRunLength - 1 && runPresent) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + " ");
			}
			// If the run is situated in the end of the sequence, ensures a ")"
			// is printed. Without this, the run would not be market correctly,
			// missing a closing ")".
			if (maxRunIndex + maxRunLength == array.length
					&& i == array.length - 1) {
				System.out.print(")");
			}
		}

		System.out.println();
		System.out.println();
	}
}