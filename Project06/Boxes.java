/* Name: Karim R. Sammouri
 * Instructor: Manar Mohamed
 * Class: CSE 174 - D
 * Date: Oct 6, 2019
 * Description: This program prints three 5x5 boxes based on input given by user.
 */

// Importing Scanner class to obtain user input.
import java.util.Scanner;

public class Boxes {
    
    public static void main(String[] args) {
        
        // Initializing variable keyboard to the scanner object.
        Scanner keyboard = new Scanner(System.in);
        
        // Prompting user to type three characters then storing them.
        System.out.print("Enter three characters with no spaces: ");
        String input = keyboard.nextLine();
        
        char char1 = input.charAt(0);
        char char2 = input.charAt(1);
        char char3 = input.charAt(2);

        // Deciding if input is valid or not and displaying results if valid.
        if (input.length() == 3) {
            draw(char1);
            System.out.println("\n");
            draw(char2);
            System.out.println("\n");
            draw(char3);
        }
        else {
            System.out.println("Invalid Input!");
        }

    }
    
    // Prints square made of character given by user.
    public static void draw(char character) {
        System.out.printf("%s %s %s %s %s%n", character, character, character, 
                          character, character);
        System.out.printf("%s       %s%n", character, character);
        System.out.printf("%s       %s%n", character, character);
        System.out.printf("%s       %s%n", character, character);
        System.out.printf("%s %s %s %s %s%n", character, character, character, 
                          character, character);
    }
}