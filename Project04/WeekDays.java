/* Name: Karim Sammouri
 * Instructor: Dr. Manar Mohamed
 * Class: CSE 174 - D
 * Date: Sep 22, 2019
 * Description: This program asks the user to input an integer inclusively 
 * between 0 and 6 then proceeds to print the corresponding weekday.
 */

// Importing scanner class to allow user input.
import java.util.Scanner;

public class WeekDays {
    
    public static void main(String[] args) {
        
        // Initializing the variable keyboard to the scanner object.
        Scanner keyboard = new Scanner(System.in);
        
        // Asking the user for an integer between 0-6 then storing it.
        System.out.print("Enter a number (0-6): ");
        int integer = keyboard.nextInt();
        
        // Depending on the integer stored, print the corresponding weekday.
        if (integer == 0) {
            System.out.println("0 is Sunday");
        }
        else if (integer == 1) {
            System.out.println("1 is Monday");
        }
        else if (integer == 2) {
            System.out.println("2 is Tuesday");
        }
        else if (integer == 3) {
            System.out.println("3 is Wednesday");
        }
        else if (integer == 4) {
            System.out.println("4 is Thursday");
        }
        else if (integer == 5) {
            System.out.println("5 is Friday");
        }
        else if (integer == 6) {
            System.out.println("6 is Saturday");
        }   
    }
    
}