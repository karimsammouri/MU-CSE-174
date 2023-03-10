/*
 * Name: Karim Sammouri
 * Instructor: Manar Mohamed
 * CSE 174, Section D
 * Date: Aug 29, 2019
 * Filename: Firstprogram.java
 * Description: Practice with writing, saving and compiling code.
 */
 
import java.util.Scanner; // We need this for user input
/*
 * Demonstrates some basic programming concepts by getting information
 * from the keyboard, displaying results to the screen, and playing an
 * interactive game with the user.
 */
public class FirstProgram{
   /*
    * The starting point for the program. This method
    * calls on the other three methods as needed
    */
   public static void main(String[]  args) {
      // Declaring local variables for later use
      String firstName, lastName;
      int targetNumber, userGuess, countGuesses;
      int triangleHeight, numberOfRows;
      Scanner keyboardReader = new Scanner(System.in);
      
      // Get user's name
      System.out.print("Enter first and last name: ");
      firstName = keyboardReader.next();
      lastName = keyboardReader.next();
      
      // Display a marquee with a personal greeting
      printBorder('*', 30);
      greet(firstName + " " + lastName);
      printBorder('*', 30);
      
      //Explain how to play game
      explainGame (firstName);
      
      //Set up the game
      targetNumber = (int) (1+100 * Math.random());
      
      for(countGuesses = 1; countGuesses <= 10; countGuesses++) {
         printBorder('*', 30);
         System.out.print("Enter guess #" + countGuesses + ": ");
         userGuess = keyboardReader.nextInt();
         
         //The user made the right guess.
         if(userGuess == targetNumber) {
            System.out.print("Good job " + firstName + ", ");
            System.out.println("you got it in " + countGuesses + " tries.");
            break;
         }
         //Give advice - Let the user know if his guess is higher or lower than the target number.
         else if (userGuess < targetNumber) {
            System.out.println("Too low. Guess higher.");
         }
         else {
            System.out.println("Too high. Guess lower.");
         }
      }
      // The user could not guess the number in 10 trials
      if(countGuesses > 10) {
         System.out.println("Hard luck! " + firstName + " ");
      }
      // Some artwork:
      printBorder('#', 30);
      System.out.println("And now, a triangle of money!");
      System.out.print("How many rows would you like in your triangle? ");
      Scanner keyboardReader2 = new Scanner(System.in);
      numberOfRows = keyboardReader2.nextInt();
      triangleHeight = numberOfRows;
      // Display a triangle
      for (int row = 1; row <= triangleHeight; row++) {
         printBorder('@', row);
      }
   }//end main method
   
   // Prints a personalized welcome message.
   public static void greet(String name) {
      System.out.println("Hello " + name + ", ");
      System.out.println("Welcome to my first CSE 174 program!");
      System.out.println("Enjoy the show!");
      System.out.println(" Sincerely,\n John Smith");
   }//end greet method
   
   // Prints a personalized game introduction.
   public static void explainGame(String name) {
      System.out.println("Lets play a game, " + name + "...");
      System.out.println("I'm thinking of a number from 1 to 100,");
      System.out.println("See if you can guess it in fewer than 10 tries.");
   }//end explainGame method
   
   // Prints a border by repeating the specified symbol
   public static void printBorder(char symbol, int size) {
      for (int i = 0; i < size; i++) {
         System.out.print(symbol) ;
      }
      System.out.println() ; //moves to the next line
   }//end printBorder method
}//end class