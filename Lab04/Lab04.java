/* Name: Karim Sammouri
 * Instructor: Dr. Manar Mohamed
 * Class: CSE 174 - D
 * Date: Sep 20, 2019
 * Description: This program asks the user to input a water temperature in degrees 
 * Fahrenheit and then proceeds to print the temperature in Celsius and whether 
 * the water is solid, liquid, or gas.
 */

//Importing Scanner class to allow user input.
import java.util.Scanner;

public class Lab04 {
  public static void main(String[] args) {
    
    // Initializing variable keyboard to the scanner object.
    Scanner keyboard = new Scanner(System.in);
    
    // Prompting the user to input temperature in Fahrenheit then storing it.
    System.out.print("Enter Fahrenheit temperatue: ");
    double tempInFahrenheit = keyboard.nextDouble();
    
    // Calculating temperature in Celsius based on given data.
    double tempInCelsius = (5.0/9.0) * (tempInFahrenheit - 32);
    
    // Deciding the state of water based on given data.
    String state;
    if (tempInCelsius <= 0) {
      state = "solid";
    }
    else if (tempInCelsius >= 100) {
      state = "gas";
    }
    else {
      state = "liquid";
    }
    
    // Printing the temperature in Celsius and the state of the water.
    System.out.printf("%.3f Fahrenheit = %.3f Celsius\nWater is %s\n", 
                      tempInFahrenheit, tempInCelsius, state);
    
  }
  
}