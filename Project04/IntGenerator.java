/* Name: Karim Sammouri
 * Instructor: Dr. Manar Mohamed
 * Class: CSE 174 - D
 * Date: Sep 22, 2019
 * Description: This program prints a random integer number inclusively between 
 * 50 and 100 and whether it is odd or even.
 */

public class IntGenerator {
    
    public static void main(String[] args) {
       
        // Initializing variable randomInt to a random integer.
        int randomInt = 50 + (int)(Math.random() * (100 - 50 +1));
        
        // Declaring variable of type String.
        String intParity;
        
        // Deciding if random-generated integer is odd or even.
        if (randomInt % 2 == 0) { 
            intParity = "EVEN"; 
        }
        else { 
            intParity = "ODD"; 
        }
        
        // Prints random generated integer and whether it is even or odd.
        System.out.printf("The generated number is %d and it is %S!%n", 
                          randomInt, intParity);
        
    }
    
}