/* Name: Karim Sammouri
 * Instructor: Dr. Manar Mohamed
 * Class: CSE 174 - D
 * Date: Sep 22, 2019
 * Description: This program asks the user for a number of donuts then proceeds 
 * to display the number of boxes the user needs. As per the problem statement, 
 * this program assumes a box can only hold 12 donuts.
 */

// Test cases:
// These work correctly: 0, 3, 7, 12, 17, 19, 24, 35, 37, 49, 60, 65, 72, 79, 
// 84, 93, 96, 100, 124, 600.

// Importing Scanner class to allow user input.
import java.util.Scanner;

public class DonutBoxes {
    
    public static void main(String[] args) {
        
        // Initializing the variable keyboard to the scanner object.
        Scanner keyboard = new Scanner(System.in);
        
        // Prompting the user for a number of donuts then storing it.
        System.out.print("How many donuts? ");
        int numOfDonuts = keyboard.nextInt();
        
        // Calculating number of boxes needed based on given input.
        int numOfBoxes = (numOfDonuts / 12) + ((numOfDonuts % 12) * 2 /
                                             (numOfDonuts % 12 + 1));
        
        // Printing number of boxes needed.
        System.out.printf("You will need %d boxes for the donuts.%n", 
                          numOfBoxes);
        
    }
    
}