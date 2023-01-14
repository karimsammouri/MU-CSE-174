/* Name: Karim Sammouri
 * Date: Sep 15, 2019
 * Class: CSE 174 - D
 * Instructor: Dr. Manar Mohamed
 * Description: This program asks the user for a triangle name and the 
 * coordinates of two vertices then proceeds to display the triangle's other 
 * vertex coordinates, side lengths, angle measures, area, perimeter, and 
 * centroid coordinates.
 */

// Importing scanner class to allow user input.
import java.util.Scanner;

public class RightAngledTriangle {
    
    public static void main(String[] args) {
        
        // Initiaizing the variable keyboard to the scanner object.
        Scanner keyboard = new Scanner(System.in);
        
        // Asking user for triangle name then storing it.
        System.out.printf("Enter three letter name of the triangle: ");
        String triangleName = keyboard.next();
        
        // Asking user for coordinates of first point then storing it.
        System.out.printf("Enter the coordinates of %s: ", 
                          triangleName.charAt(0));
        double x2 = keyboard.nextDouble();
        double y2 = keyboard.nextDouble();
        
        // Asking user for coordinates of second point then storing it.
        System.out.printf("Enter the coordinates of %s: ", 
                          triangleName.charAt(1));
        double x1 = keyboard.nextDouble();
        double y1 = keyboard.nextDouble();
        
        // Setting coordinates of third point based on given points.
        double x0 = x1;
        double y0 = y2;
        
        // Printing program description.
        System.out.printf
            ("##### Right Triangle Calculation for the %s Triangle #####\n", 
             triangleName);
        
        // Printing vertex coordinates of triangle.
        System.out.printf("** The coordinates of the triangles are: **\n");
        System.out.printf("%S : (%.3f, %.3f)\n", 
                          triangleName.charAt(0), x2, y2);
        System.out.printf("%S : (%.3f, %.3f)\n", 
                          triangleName.charAt(1), x1, y1);
        System.out.printf("%S : (%.3f, %.3f)\n", 
                          triangleName.charAt(2), x0, y0);
        
        // Calculating side lengths of triangle then storing it.
        double side2 = Math.sqrt(Math.pow(x1 - x0, 2) + 
                                 Math.pow(y1 - y0, 2));
        double side1 = Math.sqrt(Math.pow(x2 - x0, 2) + 
                                 Math.pow(y2 - y0, 2));
        double side0 = Math.hypot(side2, side1);
        
        // Printing side lengths of triangle.
        System.out.printf("** The Side lengths are **\n");
        System.out.printf("Side %s = %.3f units\n", 
                          triangleName.substring(0,1).toLowerCase(), side2);
        System.out.printf("Side %s = %.3f units\n", 
                          triangleName.substring(1,2).toLowerCase(), side1);
        System.out.printf("Side %s = %.3f units\n", 
                          triangleName.substring(2,3).toLowerCase(), side0);
        
        // Calculating angle measures of triangle then storing it.
        double angle2 = Math.toDegrees(Math.acos(side1/side0));
        double angle1 = Math.toDegrees(Math.acos(side2/side0));
        double angle0 = 90;
        
        // Printing angle measures of triangle.
        System.out.printf("** The angle are **\n");
        System.out.printf("Angle %S = %.3f degrees\n", 
                          triangleName.charAt(0), angle2);
        System.out.printf("Angle %S = %.3f degrees\n", 
                          triangleName.charAt(1), angle1);
        System.out.printf("Angle %S = %.3f degrees\n", 
                          triangleName.charAt(2), angle0);
        
        // Calculating area and perimeter of triangle then storing it.
        double area = 1/2.0 * side1 * side2;
        double perimeter = side0 + side1 + side2;
        
        // Printing area and perimeter of triangle.
        System.out.printf("** The area and perimeter **\n");
        System.out.printf("Area = %.3f sq units\n", area);
        System.out.printf("Perimeter = %.3f units\n", perimeter);
        
        // Calculating triangle's centroid coordinates then storing it.
        double Ox = (x0 + x1 + x2) / 3;
        double Oy = (y0 + y1 + y2) / 3;
        
        // Printing triangle's centroid coordinates.
        System.out.printf("** The centroid coordinate **\n");
        System.out.printf("O : (%.3f, %.3f)\n", Ox, Oy);
        
    }
    
}