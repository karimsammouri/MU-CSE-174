/* Name: Karim Sammouri
 * Instructor: Dr. Manar Mohamed
 * Class: CSE 174 - D
 * Date: Sep 22, 2019
 * Description: This program asks the user to input a string and two indices 
 * of that string then proceeds to print a word with swapped letters based 
 * on the given indices.
 */

//Importing scanner class to allow user input.
import java.util.Scanner;

public class SwapLetters {
    
    public static void main(String[] args) {
        
        // Initializing the variable keyboard to the scanner object.
        Scanner keyboard = new Scanner(System.in);
        
        // Asking user for a string then storing it.
        System.out.print("Enter a word: ");
        String str = keyboard.next();
        
        // Asking user for two indices then storing them.
        String indicesPrompt = "Enter two values for i and j between (0-" +
        		(str.length() - 1) + "): ";
        System.out.print(indicesPrompt);
        int index1 = keyboard.nextInt();
        int index2 = keyboard.nextInt();
        
        // Calculating substrings based on given input then storing them.
        String first = str.substring(0, index1);
        String middle = str.substring(index1 + 1, index2);
        String last = str.substring(index2 + 1, str.length());
        
        // Generating string with swapped letters based on given inputs.
        String swappedStr = first + str.charAt(index2) + middle + 
            str.charAt(index1) + last;
        
        // Printing string with swapped letters.
        System.out.printf("** %s **%n", swappedStr);
        
    }
}
        