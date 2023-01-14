/* Name: Karim Sammouri
 * Instructor: Dr. Manar Mohamed
 * Class: CSE 174 - D
 * Date: Sep 27, 2019
 * Description: This program performs a variety of calculations 
 * based on user input.
 */

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an expression: ");
    
    // Get the two numbers and the operator:
    double num1 = in.nextDouble();
    String opCode = in.next();
    double num2 = in.nextDouble();

    double calculation;
    // Add two given numbers then print result.
    if (opCode.equals("+")) {
      calculation = num1 + num2;
      System.out.printf("Addition: %.1f + %.1f = %.1f%n", num1, num2, calculation);
    }
    // Subtract second given number from first given number then print result.
    else if (opCode.equals("-")) {
      calculation = num1 - num2;
      System.out.printf("Subtraction: %.1f - %.1f = %.1f%n", num1, num2, calculation);
    }
    // Multiply two given numbers then print result.
    else if(opCode.equals("*")) {    
      calculation = num1 * num2;
      System.out.printf("Multiplication: %.1f * %.1f = %.1f%n", num1, num2, calculation);
    }
    // Divide first given number by second given nonzero number then print result.
    else if(opCode.equals("/")) {  
      if (num2 == 0) {
        System.out.println("Division: Divide by zero error");
      }
      else {
        calculation = num1 / num2;
        System.out.printf("Division: %.1f / %.1f = " + calculation, num1, num2);
      }
    }
    // Raise the first given number to the power of the second given number then print result.
    else if(opCode.equals("^")) {    
      calculation = Math.pow(num1, num2);
      System.out.printf("Power: %.1f ^ %.1f = %.1f%n", num1, num2, calculation);
    }
    // Prints random number that is at least first given number and less than second given number.
    else if(opCode.equals("?")) {
      if (num1 >= num2) {
        System.out.println("Random number: First number must be smaller than second number");
      }
      else {
        calculation = num1 + (Math.random()*(num2-num1));
        System.out.print("Random number: "+ calculation);
      }
    }
    else {
      System.out.println("Invalid operator");
    }
  }
}