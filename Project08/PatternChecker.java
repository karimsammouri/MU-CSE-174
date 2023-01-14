/* Name: Karim A. Sammouri
 * Instructor: Dr. Manar Mohamed
 * Class: CSE 174 - D
 * Date: Oct 20, 2019
 * Description: This program gives the user multiple problems to be solved then 
 * prints the results based on the given inputs.
 */

// Importing Scanner class to allow user input.
import java.util.Scanner;

public class PatternChecker {

	// Initializing the global variable keyboard to the Scanner object.
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		// Leveraging while loop to ensure program keeps repeating unless user
		// exits.
		int choice = 0;
		while (choice != 3) {

			// Displaying menu to user and then storing choice.
			System.out.println("List of Pattern Checker Problems: ");
			System.out.println("1) Largest and Smallest Pairs");
			System.out.println("2) Counting digits");
			System.out.println("3) Quit");
			System.out.print("Number of choice: ");
			choice = keyboard.nextInt();

			// Deciding which problem to solve depending on user input.
			if (choice == 1)
				largestAndSmallestPairs();
			else if (choice == 2)
				countingDigits();
			else if (choice == 3)
				System.out.println("*** End");
			else
				System.out.println("Invalid input\n");
		}
	}

	// Determines largest, second largest, smallest,
	// and second smallest of the user-given numbers and then prints them.
	public static void largestAndSmallestPairs() {

		// Initializing several variable to be used.
		int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE,
				secondLargest = Integer.MIN_VALUE,
				secondSmallest = Integer.MAX_VALUE, limit = 2, counter = 0, num;

		// Ensuring this part of the program repeats if the user enters an
		// invalid limit.
		while (limit >= 2) {

			// Prompting user to enter limit then storing it.
			System.out.print("Enter the limit: ");
			limit = keyboard.nextInt();

			// Determining largest and smallest number if limit is at least 2.
			// Otherwise, prints invalid input.
			if (limit >= 2) {
				System.out.print("Enter " + limit + " numbers: ");

				while (counter < limit) {
					num = keyboard.nextInt();
					if (num > largest) {
						secondLargest = largest;
						largest = num;
					} else if (num > secondLargest)
						secondLargest = num;
					if (num < smallest) {
						secondSmallest = smallest;
						smallest = num;
					} else if (num < secondSmallest)
						secondSmallest = num;
					counter++;
				}

				System.out.printf(
						"*** Largest and Smallest Pairs: (%d, %d), (%d, %d)%n%n",
						largest, secondLargest, smallest, secondSmallest);
				break;
			}

			else {
				System.out.println(
						"Invalid Input. The limit should be at least 2\n");
				limit = 2;
			}
		}
	}

	// Identifies the digits in a random-generated number then,
	// along with another method that identifies how many times each number
	// occurs, prints a set of pairs of each digit and its number of occurrence.
	public static void countingDigits() {

		// Initializing several variable to be used.
		int random = 1000000 + (int) (Math.random() * (1000001)), counter = 0,
				counter2 = 0;
		String randomStr = "" + random, cropped = "", result = "";

		// Displaying randomly generated number and setting up counted pairs.
		System.out.println("The generated random number is: " + random);
		System.out.print("*** Counted Pairs are = ");

		// Constructing new string that eliminates recurrent numbers.
		while (counter < randomStr.length()) {
			if (cropped.indexOf(randomStr.charAt(counter)) == -1)
				cropped += randomStr.charAt(counter);
			counter++;
		}

		// Constructing string that pairs the digits in the String named cropped
		// with, in tandem with the method frequency(), the number of times the
		// digits occur.
		while (counter2 < cropped.length()) {
			if (counter2 == cropped.length() - 1)
				result += "(" + cropped.charAt(counter2) + ", "
						+ frequency(randomStr, cropped.charAt(counter2)) + ")";
			else
				result += "(" + cropped.charAt(counter2) + ", "
						+ frequency(randomStr, cropped.charAt(counter2))
						+ "), ";
			counter2++;
		}

		// Printing ordered pairs.
		System.out.println(result + "\n");
	}

	// Puts each digit of the String named cropped against the random
	// String to identify how many times each digit occurs.
	public static int frequency(String str, char ch) {

		// Initializing several variable to be used.
		int frequency = 0, counter = 0;

		while (counter < str.length()) {
			if (str.charAt(counter) == ch)
				frequency++;
			counter++;
		}

		return frequency;
	}
}