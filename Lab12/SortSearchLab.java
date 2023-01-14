/* Name: Karim A. Sammouri
 * Instructor: Dr. Manar Mohamed
 * Class: CSE 174 - D
 * Date: Nov 15, 2019
 * Description: Lab in which we analyzed the performance of binary 
 * search and bubble sort.
 */
import java.util.Random;

public class SortSearchLab {
	public static void main(String[] args) {

		// Creates an array of of 5 elements with
		// values ranging from 0 to 49:
		int[] data = randomArray(100000, 1000);
		bubbleSort(data);

		// Testing keys.
		System.out.println(binarySearch(data, 168));
	}

	// Goes through every element in an array in
	// a binary fashion in search for the index of a given key.
	public static int binarySearch(int[] data, int key) {
		int low = 0, high = data.length - 1, checkedCount = 0;

		while (high >= low) {
			int middle = (low + high) / 2;
			checkedCount++;
			if (data[middle] == key) {

				System.out.println("Checked count = " + checkedCount);
				return middle;
			}
			if (data[middle] < key)
				low = middle + 1;
			if (data[middle] > key)
				high = middle - 1;
		}
		System.out.println("Checked count = " + checkedCount);
		return -1;
	}

	// Bubble sort implementation.
	public static void bubbleSort(int[] data) {
		int passCount = 0, comparisonCount = 0, swapCount = 0;
		for (int j = 0; j < data.length - 1; j++) {
			for (int i = 0; i < data.length - 1; i++) {
				comparisonCount++;
				if (data[i] > data[i + 1]) {
					int temp = data[i];
					data[i] = data[i + 1];
					data[i + 1] = temp;
					swapCount++;
				}
			}
			passCount++;
		}
		System.out.println("Number of passes = " + passCount);
		System.out.println("Number of comparisons = " + comparisonCount);
		System.out.println("Number of swaps = " + swapCount);
	}

	// Returns an array of random int values ranging
	// from 0 to (max - 1). 142857 is a "seed". It guarantees
	// that the stream of random numbers will be the same
	// each time the method is called.
	public static int[] randomArray(int max, int size) {
		Random rnd = new Random(142857);

		int[] result = new int[size];

		for (int i = 0; i < size; i++) {
			result[i] = rnd.nextInt(max);
		}

		return result;
	}

}