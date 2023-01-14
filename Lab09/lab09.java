/* Name: Karim A. Sammouri
 * Instructor: Dr. Manar Mohamed
 * Class: CSE 174 - D
 * Date: Oct 25, 2019
 * Description: This program prints the number of multiples of 3 or 7 
 * within an interval of randomly generated start and end points and 
 * then prints the max of the multiples.
 */

public class lab09 {

	public static void main(String[] args) {

		int max = Integer.MIN_VALUE;
		int step = 0;

		for (int counter2 = 1; counter2 <= 5; counter2++) {

			int start = 1000 + (int) (Math.random() * (20000 - 1000 + 1)),
					end = 20000 + (int) (Math.random() * (50000 - 20000 + 1)),
					count = 0;

			for (int counter = start; counter <= end; counter++) {

				if (isEven(counter)) {
					int even = -(2 * counter - 1);
					if (multiple3or7(even))
						count++;
				}

				else {
					int odd = 2 * counter;
					if (multiple3or7(odd))
						count++;
				}
			}

			System.out.printf("%d-%d: %d multiples of 3 or 7.%n", start, end,
					count);

			if (count > max) {
				max = count;
				step = counter2;
			}
		}

		System.out.printf("Max: %d from step %d%n", max, step);
	}

	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	public static boolean multiple3or7(int num) {
		return (num % 3 == 0 || num % 7 == 0);
	}
}