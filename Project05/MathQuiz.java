/* Name: Karim A. Sammouri
 * Instructor: Dr. Manar Mohamed
 * Class: CSE 174 - D
 * Date: Sep 29, 2019
 * Description: This program gives the user 4 random multiplication problems 
 * and 4 division problems to solve and displays the user's ongoing progress, 
 * final scores, and elapsed time.
 */

// Importing the Scanner class to allow user input.
import java.util.Scanner;

public class MathQuiz {
    
    public static void main(String[] args) {
        
        // Declaring and initializing several variables.
        Scanner keyboard = new Scanner(System.in);
        int randomInt, randomInt2, expectedAnswer, actualAnswer, timeElapsedSec;
        double multiplicationPercent, divisionPercent, overallPercent;
        long startTime, finishTime, timeElapsed;
        String difficulty;
        int overallScore = 0 ;
        int multiplicationScore = 0;
        int divisionScore = 0;
        
        // Printing game quiz introduction and instructions for user.
        System.out.println("Welcome to my math quiz!");
        System.out.println("This quiz will give you four multiplication problems,");
        System.out.println("followed by four division problems.");
        System.out.println("An easy quiz will include numbers up to 100.");
        System.out.println("A hard quiz will include numbers up to 1000.");
        System.out.println("-----------------------------------------------------");
        
        // Asking user for a game mode then storing it.
        System.out.println("Do you want an easy quiz or a hard quiz?");
        System.out.print("Enter the word hard or easy: ");
        difficulty = keyboard.next();
        
        // Setting branch that runs if user enters easy.
        if (difficulty.equals("easy")) {
            
            // Initializing long variable to capture current time.
            startTime = System.currentTimeMillis();
            
            // Printing quiz section and difficulty for user.
            System.out.println("\n-MULTIPLICATION--------------------------------------");
            System.out.println("You have chosen easy.");
            
            // Setting and printing first question.
            randomInt = (int)(1 + 10 * Math.random());
            randomInt2 = (int)(1 + 10 * Math.random());
            expectedAnswer = randomInt * randomInt2;
            System.out.printf("%d x %d = ", randomInt, randomInt2);
           
            // Storing and verifying first answer.
            actualAnswer = keyboard.nextInt();
            if (actualAnswer == (expectedAnswer)) {
                multiplicationScore++;
                overallScore++;
                System.out.printf("Correct! %d answers correct so far.%n", overallScore);
            }
            else {
                System.out.printf("Sorry, %d x %d = %d. %d answers correct so far.%n", 
                                  randomInt, randomInt2, expectedAnswer, overallScore);
            }
            
            // Setting and printing second question.
            randomInt = (int)(1 + 10 * Math.random());
            randomInt2 = (int)(1 + 10 * Math.random());
            expectedAnswer = randomInt * randomInt2;
            System.out.printf("%d x %d = ", randomInt, randomInt2);   
            
            // Storing and verifying second answer.
            actualAnswer = keyboard.nextInt();
            if (actualAnswer == (expectedAnswer)) {
                multiplicationScore++;
                overallScore++;
                System.out.printf("Correct! %d answers correct so far.%n", overallScore);
            }
            else {
                System.out.printf("Sorry, %d x %d = %d. %d answers correct so far.%n", 
                                  randomInt, randomInt2, expectedAnswer, overallScore);
            }
            
            // Setting and printing third question.
            randomInt = (int)(1 + 10 * Math.random());
            randomInt2 = (int)(1 + 10 * Math.random());
            expectedAnswer = randomInt * randomInt2;
            System.out.printf("%d x %d = ", randomInt, randomInt2); 
            
            // Storing and verifying third answer.
            actualAnswer = keyboard.nextInt();
            if (actualAnswer == (expectedAnswer)) {
                multiplicationScore++;
                overallScore++;
                System.out.printf("Correct! %d answers correct so far.%n", overallScore);
            }
            else {
                System.out.printf("Sorry, %d x %d = %d. %d answers correct so far.%n", 
                                  randomInt, randomInt2, expectedAnswer, overallScore);
            }
            
            // Setting and printing fourth question.
            randomInt = (int)(1 + 10 * Math.random());
            randomInt2 = (int)(1 + 10 * Math.random());
            expectedAnswer = randomInt * randomInt2;
            System.out.printf("%d x %d = ", randomInt, randomInt2);
            
            // Storing and verifying fourth answer.
            actualAnswer = keyboard.nextInt();
            if (actualAnswer == (expectedAnswer)) {
                multiplicationScore++;
                overallScore++;
                System.out.printf("Correct! %d answers correct so far.%n", overallScore);
            }
            else {
                System.out.printf("Sorry, %d x %d = %d. %d answers correct so far.%n", 
                                  randomInt, randomInt2, expectedAnswer, overallScore);
            }
            
            // Printing next quiz section.
            System.out.println("\n-DIVISION--------------------------------------");
            
            // Setting and printing fifth question.
            randomInt = (int)(1 + 10 * Math.random());
            randomInt2 = randomInt * (int)(1 + 10 * Math.random());
            expectedAnswer = randomInt2 / randomInt;
            System.out.printf("%d \u00F7 %d = ", randomInt2, randomInt);
            
            // Storing and verifying fifth answer.
            actualAnswer = keyboard.nextInt();
            if (actualAnswer == (expectedAnswer)) {
                divisionScore++;
                overallScore++;
                System.out.printf("Correct! %d answers correct so far.%n", overallScore);
            }
            else {
                System.out.printf("Sorry, %d \u00F7 %d = %d. %d answers correct so far.%n", 
                                  randomInt2, randomInt, expectedAnswer, overallScore);
            }
            
            // Setting and printing sixth question.
            randomInt = (int)(1 + 10 * Math.random());
            randomInt2 = randomInt * (int)(1 + 10 * Math.random());
            expectedAnswer = randomInt2 / randomInt;
            System.out.printf("%d \u00F7 %d = ", randomInt2, randomInt);
            
            // Storing and verifying sixth answer.
            actualAnswer = keyboard.nextInt();
            if (actualAnswer == (expectedAnswer)) {
                divisionScore++;
                overallScore++;
                System.out.printf("Correct! %d answers correct so far.%n", overallScore);
            }
            else {
                System.out.printf("Sorry, %d \u00F7 %d = %d. %d answers correct so far.%n", 
                                  randomInt2, randomInt, expectedAnswer, overallScore);
            }
            
            // Setting and printing seventh question.
            randomInt = (int)(1 + 10 * Math.random());
            randomInt2 = randomInt * (int)(1 + 10 * Math.random());
            expectedAnswer = randomInt2 / randomInt;
            System.out.printf("%d \u00F7 %d = ", randomInt2, randomInt);
            
            // Storing and verifying seventh answer.
            actualAnswer = keyboard.nextInt();
            if (actualAnswer == (expectedAnswer)) {
                divisionScore++;
                overallScore++;
                System.out.printf("Correct! %d answers correct so far.%n", overallScore);
            }
            else {
                System.out.printf("Sorry, %d \u00F7 %d = %d. %d answers correct so far.%n", 
                                  randomInt2, randomInt, expectedAnswer, overallScore);
            }
            
            // Setting and printing eighth question.
            randomInt = (int)(1 + 10 * Math.random());
            randomInt2 = randomInt * (int)(1 + 10 * Math.random());
            expectedAnswer = randomInt2 / randomInt;
            System.out.printf("%d \u00F7 %d = ", randomInt2, randomInt);
            
            // Storing and verifying eighth answer.
            actualAnswer = keyboard.nextInt();
            if (actualAnswer == (expectedAnswer)) {
                divisionScore++;
                overallScore++;
                System.out.printf("Correct! %d answers correct so far.%n", overallScore);
            }
            else {
                System.out.printf("Sorry, %d \u00F7 %d = %d. %d answers correct so far.%n", 
                                  randomInt2, randomInt, expectedAnswer, overallScore);
            }
            
            // Initializing variables to be used for results.
            multiplicationPercent = (multiplicationScore/4.0) * 100;
            divisionPercent = (divisionScore/4.0) * 100;
            overallPercent = (overallScore/8.0) * 100;
            finishTime = System.currentTimeMillis();
            timeElapsed = finishTime - startTime;
            timeElapsedSec = (int) (timeElapsed/1000);
            
            // Printing results of the quiz to user.
            System.out.println("\n-RESULTS---------------------------------------------");
            System.out.printf("You answered the questions in %d seconds.%n", 
                              timeElapsedSec);
            System.out.printf("Multiplication score: %d out of 4 (%.2f%%)%n", 
                              multiplicationScore, multiplicationPercent);
            System.out.printf("Division score: %d out of 4 (%.2f%%)%n", 
                              divisionScore, divisionPercent);
            System.out.printf("Overall score: %d out of 8 (%.2f%%)%n", 
                              overallScore, overallPercent);
        }
        
        // Setting branch that runs if user enters hard.
        else if (difficulty.equals("hard")) {
            
            // Initializing long variable to capture current time.
            startTime = System.currentTimeMillis();
            
            // Printing quiz section and difficulty for user.
            System.out.println("\n-MULTIPLICATION--------------------------------------");
            System.out.println("You have chosen hard.");
            
            // Setting and printing first question.
            randomInt = (int)(1 + 40 * Math.random());
            randomInt2 = (int)(1 + 25 * Math.random());
            expectedAnswer = randomInt * randomInt2;
            System.out.printf("%d x %d = ", randomInt, randomInt2);
            
            // Storing and verifying first answer.
            actualAnswer = keyboard.nextInt();
            if (actualAnswer == (expectedAnswer)) {
                multiplicationScore++;
                overallScore++;
                System.out.printf("Correct! %d answers correct so far.%n", overallScore);
            }
            else {
                System.out.printf("Sorry, %d x %d = %d. %d answers correct so far.%n", 
                                  randomInt, randomInt2, expectedAnswer, overallScore);
            }
            
            // Setting and printing second question.
            randomInt = (int)(1 + 40 * Math.random());
            randomInt2 = (int)(1 + 25 * Math.random());
            expectedAnswer = randomInt * randomInt2;
            System.out.printf("%d x %d = ", randomInt, randomInt2);
            
            // Storing and verifying second answer.
            actualAnswer = keyboard.nextInt();
            if (actualAnswer == (expectedAnswer)) {
                multiplicationScore++;
                overallScore++;
                System.out.printf("Correct! %d answers correct so far.%n", overallScore);
            }
            else {
                System.out.printf("Sorry, %d x %d = %d. %d answers correct so far.%n", 
                                  randomInt, randomInt2, expectedAnswer, overallScore);
            }
            
            // Setting and printing third question.
            randomInt = (int)(1 + 40 * Math.random());
            randomInt2 = (int)(1 + 25 * Math.random());
            expectedAnswer = randomInt * randomInt2;
            System.out.printf("%d x %d = ", randomInt, randomInt2);
            
            // Storing and verifying third answer.
            actualAnswer = keyboard.nextInt();
            if (actualAnswer == (expectedAnswer)) {
                multiplicationScore++;
                overallScore++;
                System.out.printf("Correct! %d answers correct so far.%n", overallScore);
            }
            else {
                System.out.printf("Sorry, %d x %d = %d. %d answers correct so far.%n", 
                                  randomInt, randomInt2, expectedAnswer, overallScore);
            }
            
            // Setting and printing fourth question.
            randomInt = (int)(1 + 40 * Math.random());
            randomInt2 = (int)(1 + 25 * Math.random());
            expectedAnswer = randomInt * randomInt2;
            System.out.printf("%d x %d = ", randomInt, randomInt2);
            
            // Storing and verifying fourth answer.
            actualAnswer = keyboard.nextInt();
            if (actualAnswer == (expectedAnswer)) {
                multiplicationScore++;
                overallScore++;
                System.out.printf("Correct! %d answers correct so far.%n", overallScore);
            }
            else {
                System.out.printf("Sorry, %d x %d = %d. %d answers correct so far.%n", 
                                  randomInt, randomInt2, expectedAnswer, overallScore);
            }
            
            // Printing next quiz section.
            System.out.println("\n-DIVISION--------------------------------------");
            
            // Setting and printing fifth question.
            randomInt = (int)(1 + 40 * Math.random());
            randomInt2 = randomInt * (int)(1 + 25 * Math.random());
            expectedAnswer = randomInt2 / randomInt;
            System.out.printf("%d \u00F7 %d = ", randomInt2, randomInt);
            
            // Storing and verifying fifth answer.
            actualAnswer = keyboard.nextInt();
            if (actualAnswer == (expectedAnswer)) {
                divisionScore++;
                overallScore++;
                System.out.printf("Correct! %d answers correct so far.%n", overallScore);
            }
            else {
                System.out.printf("Sorry, %d \u00F7 %d = %d. %d answers correct so far.%n", 
                                  randomInt2, randomInt, expectedAnswer, overallScore); 
            }
            
            // Setting and printing sixth question.
            randomInt = (int)(1 + 40 * Math.random());
            randomInt2 = randomInt * (int)(1 + 25 * Math.random());
            expectedAnswer = randomInt2 / randomInt;
            System.out.printf("%d \u00F7 %d = ", randomInt2, randomInt);
            
            // Storing and verifying sixth answer.
            actualAnswer = keyboard.nextInt();
            if (actualAnswer == (expectedAnswer)) {
                divisionScore++;
                overallScore++;
                System.out.printf("Correct! %d answers correct so far.%n", overallScore);
            }
            else {
                System.out.printf("Sorry, %d \u00F7 %d = %d. %d answers correct so far.%n", 
                                  randomInt2, randomInt, expectedAnswer, overallScore);
            }
            
            // Setting and printing seventh question.
            randomInt = (int)(1 + 40 * Math.random());
            randomInt2 = randomInt * (int)(1 + 25 * Math.random());
            expectedAnswer = randomInt2 / randomInt;
            System.out.printf("%d \u00F7 %d = ", randomInt2, randomInt);
            
            // Storing and verifying seventh answer.
            actualAnswer = keyboard.nextInt();
            if (actualAnswer == (expectedAnswer)) {
                divisionScore++;
                overallScore++;
                System.out.printf("Correct! %d answers correct so far.%n", overallScore);
            }
            else {
                System.out.printf("Sorry, %d \u00F7 %d = %d. %d answers correct so far.%n", 
                                  randomInt2, randomInt, expectedAnswer, overallScore);
            }
            
            // Setting and printing eighth question.
            randomInt = (int)(1 + 40 * Math.random());
            randomInt2 = randomInt * (int)(1 + 25 * Math.random());
            expectedAnswer = randomInt2 / randomInt;
            System.out.printf("%d \u00F7 %d = ", randomInt2, randomInt);
            
            // Storing and verifying eighth answer.
            actualAnswer = keyboard.nextInt();
            if (actualAnswer == (expectedAnswer)) {
                divisionScore++;
                overallScore++;
                System.out.printf("Correct! %d answers correct so far.%n", overallScore);
            }
            else {
                System.out.printf("Sorry, %d \u00F7 %d = %d. %d answers correct so far.%n", 
                                  randomInt2, randomInt, expectedAnswer, overallScore);
            }
            
            // Initializing variables to be used for results.
            multiplicationPercent = (multiplicationScore/4.0) * 100;
            divisionPercent = (divisionScore/4.0) * 100;
            overallPercent = (overallScore/8.0) * 100;
            finishTime = System.currentTimeMillis();
            timeElapsed = finishTime - startTime;
            timeElapsedSec = (int) (timeElapsed/1000);
            
            // Printing results of the quiz to user.
            System.out.println("\n-RESULTS---------------------------------------------");
            System.out.printf("You answered the questions in %d seconds.%n", 
                              timeElapsedSec);
            System.out.printf("Multiplication score: %d out of 4 (%.2f%%)%n", 
                              multiplicationScore, multiplicationPercent);
            System.out.printf("Division score: %d out of 4 (%.2f%%)%n", 
                              divisionScore, divisionPercent);
            System.out.printf("Overall score: %d out of 8 (%.2f%%)%n", 
                              overallScore, overallPercent);
        }
        
        // Setting branch that runs if user enters doesn't enter either easy or hard.
        else {
            System.out.println("Error: invalid input.");
        }
    }
}