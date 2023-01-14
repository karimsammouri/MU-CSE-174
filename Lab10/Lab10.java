/* Name: Karim A. Sammouri
 * Class: CSE 174 - D
 * Instructor: Dr. Manar Mohamed
 * Date: Nov 1, 2019
 * Description: This program uses an array to test whether the random generator is fair;
 * that is, whether each possible value is generated approximately the same number of times.
 * It counts the number of times each number in an interval given by the user is generated 
 * relative to the total number of trials that is also given by the user.
 */

import java.util.Scanner;
public class Lab10 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, difference;

		System.out.print("How many random numbers do you want to generate? ");
		int randomCount = in.nextInt();
		System.out.print(
				"How many numbers starting from 0 do you want to keep track of? ");
		int numOfValues = in.nextInt();

		int[] array = new int[numOfValues];

		for (int i = 0; i < randomCount; i++) {
			array[(int) (Math.random() * (numOfValues))]++;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + " " + array[i]);
		}
		for (int i = 0; i < array.length; i++) {

			if (array[i] > max)
				max = array[i];
			if (array[i] < min)
				min = array[i];
		}

		difference = max - min;
		System.out.println("The max difference = " + difference);
	}
}