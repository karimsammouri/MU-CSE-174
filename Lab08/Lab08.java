/* Name: Karim A. Sammouri
 * Instructor: Dr. Manar Mohamed
 * Class: CSE 174 - D
 * Date: Oct 18, 2019
 * Description: This program asks the user to enter some words and then 
 * displays the average word length, the length of the shortest and longest 
 * words, the number of words containing the letter q, and the number of 
 * words starting with a vowel.
 */

// Importing the Scanner class to allow user input.
import java.util.Scanner;

public class Lab08 {
  public static void main(String[] args) {
    
    // Initializing the variable Keyboard to the Scanner object.
    Scanner keyboard = new Scanner(System.in);
    
    // Prompting the user to input the number of words and storing it.
    System.out.print("How many words will you enter? ");
    int numWords = keyboard.nextInt();
    
    // Declaring and initializing several variables to be used.
    int counter = 1, shortest = Integer.MAX_VALUE, longest = Integer.MIN_VALUE, 
      containQ = 0, startVowel = 0;
    double sum = 0;
    String words = "";
    
    // Modifying the initialized variables according to the given inputs. 
    // If no words are entered, prints "NO WORDS ENTERED."
    if (numWords == 0) {
      System.out.println("NO WORDS ENTERED.");
    }
    else {
      while (counter <= numWords) {
        System.out.print("Enter word #" + counter + ": ");
        String word = keyboard.next();
        sum += word.length();
        words += word + " ";
        if (word.length() < shortest)
          shortest = word.length();
        if (word.length() > longest)
          longest = word.length();
        if (word.toLowerCase().indexOf("q") != -1)
          containQ++;
        if (startsWithVowel(word) == true)
          startVowel++;
        counter++;
      }
      
      // Printing results for the user based on inputs.
      System.out.println("RESULTS:...");
      System.out.println("Average word length: " + sum / numWords);
      System.out.println("Length of shortest word: " + shortest);
      System.out.println("Length of longest word: " + longest);
      System.out.println("Words containing q: " + containQ);
      System.out.println("Words starting with a vowel: " + startVowel);
      System.out.println("You entered " + numWords + " words: " + words);
    }
  }
  
  // Identifies if a given String begins with a vowel.
  public static boolean startsWithVowel(String str) {
    return (str.toLowerCase().charAt(0) == 'a' || 
            str.toLowerCase().charAt(0) == 'e' || 
            str.toLowerCase().charAt(0) == 'o' || 
            str.toLowerCase().charAt(0) == 'u' ||
            str.toLowerCase().charAt(0) == 'i') ;
  }
}