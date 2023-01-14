/* Name: Karim Sammouri
 * Date: Sep 13, 2019
 * Class: CSE 174 - D
 * Instructor: Dr. Manar Mohamed
 * Description: This program asks the user for his full name, phone number, and 
 * three test scores then proceeds to display the average, maximum, median, and 
 * minimum of the scores.
 */

import java.util.Scanner;
  
public class Lab03
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the first name and last name: ");
    String firstName = keyboard.next();
    String lastName = keyboard.next();
   
    System.out.print("Enter the phone number in this format (___)___-___: ");
    String phoneNumber = keyboard.next();
  
    System.out.print("Enter 3 scores: ");
    double score1 = keyboard.nextDouble();
    double score2 = keyboard.nextDouble();
    double score3 = keyboard.nextDouble();
    
    System.out.println("Name: " + firstName.toUpperCase() + " " + lastName.substring(0,1).toUpperCase());
    System.out.println("Phone: " + phoneNumber.substring(5, 8) + phoneNumber.substring(9));
    
    double average = (score1 + score2 + score3)/3.0;
    double maximum = Math.max(score1, Math.max(score2, score3));
    double minimum = Math.min(score1, Math.min(score2, score3));
    double median = (score1 + score2 + score3) - maximum - minimum;
    
    System.out.printf("Average = %.2f\n", average);
    System.out.printf("Maximum = %.2f\n", maximum);
    System.out.printf("Median = %.2f\n", median);
    System.out.printf("Minimum = %.2f\n", minimum);
  }
}