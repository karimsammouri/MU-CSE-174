/* Name: Karim R. Sammouri
 * Instructor: Manar Mohamed
 * Class: CSE 174 - D
 * Date: Oct 6, 2019
 * Description: This program prompts the user for a depth towads the inside 
 * of the Earth and then prints the corresponding temperature in Celsius (C) 
 * and Fahrenheit (F).
 */

// Importing the Scanner class to obtain user input.
import java.util.Scanner;

public class EarthTemp {
    
    public static void main(String[] args) {
        
        // Initializing the keyboard variable to the Scanner object.
        Scanner keyboard = new Scanner(System.in);
        
        // Prompting user for depth inside Earth and then storing it.
        System.out.print("Enter the depth in kilometers: ");
        double depth = keyboard.nextDouble();
        
        double celsius = getCelsiusAtDepth(depth);
        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        
        // Printing temperature in Celsius and Fahrenheit based on given depth.
        System.out.printf("The temperature (C) at depth %.2f km is %.2f.%n", 
                          depth,celsius);
        System.out.printf("The temperature (F) at depth %.2f km is %.2f.%n",
        depth, fahrenheit);
    }
    
    // Returns temperature in Celsius based on given depth.
    public static double getCelsiusAtDepth(double depth) {
        double celsius = 10 * depth + 20;
        return celsius;
    }
    
    // Returns temperature in Fahrenheit when given 
    //temperature in Celsius.
     public static double convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = 1.8 * celsius + 32;
        return fahrenheit;
     }
}