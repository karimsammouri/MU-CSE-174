/* Name: Karim R. Sammouri
 * Instructor: Manar Mohamed
 * Class: CSE 174 - D
 * Date: Oct 6, 2019
 * Description: This program asks the user if they want to compute the area of a 
 * circle, the surface area of a cylinder, or the volume of a cylinder and then 
 * proceeds to print a result based on given inputs.
 */

// Importing the Scanner class to obtain user input.
import java.util.Scanner;

public class Cylinder {
    
    public static void main(String[] args) {
        
        // Initializing the keyboard variable to the Scanner object.
        Scanner keyboard = new Scanner(System.in);
        
        // Prompting user to pick one of three tasks and storing it.
        System.out.println("-- Menu --");
        System.out.println("a) Area of a circle");
        System.out.println("b) Area of the surface of a cylinder");
        System.out.println("c) Volume of a cylinder");
        System.out.print("Enter your letter of choice: ");
        String input = keyboard.next();
        
        // Deciding which task to perform based on given input. Prints error message
        //if user input is invalid.
        if (input.equalsIgnoreCase("a")) {
            System.out.print("Enter the radius: ");
            double radius = keyboard.nextDouble();
            double area = circArea(radius);
            System.out.printf("The area of the circle is %.3f%n", area);
        }
        else if (input.equalsIgnoreCase("b")) {
            System.out.print("Enter the radius: ");
            double radius = keyboard.nextDouble();
            System.out.print("Enter the height: ");
            double height = keyboard.nextDouble();
            double area = cylArea(radius, height);
            System.out.printf("The area of the surface of the cylinder is %.3f%n",
                              area);
        }
        else if (input.equalsIgnoreCase("c")) {
            System.out.print("Enter the radius: ");
            double radius = keyboard.nextDouble();
            System.out.print("Enter the height: ");
            double height = keyboard.nextDouble();
            double volume = cylVolume(radius, height);
            System.out.printf("The volume of the cylinder is %.3f%n",
                              volume);
        }
        else {
            System.out.println("The selection is not correct. Program terminated.");
        }
    }
    
    // Returns a circle's area based on a given radius.
    public static double circArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
    
    // Returns a cylinder's surface area based on the given radius and height.
    public static double cylArea(double radius, double height) {
        double area = 2 * circArea(radius) + Math.PI * 2 * radius * height;
        return area;
    }
    
    // Returns a cylinder's volume based on the given 
    //radius and height.
    public static double cylVolume(double radius, double height) {
        double volume = circArea(radius) * height;
        return volume;
    }
}