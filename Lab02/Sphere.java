/*
 * Name: Karim Sammouri
 * Date: Sep 6, 2019
 * Class: CSE 174 - D
 * File Name: Sphere.java
 * File Description: Asks the user for a radius and prints the surface area and volume of a sphere
 */

import java.util.Scanner;
public class Sphere {
  
  public static void main(String[] args){
    double radius, surfaceArea, volume;
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Enter the sphere's radius: ");
    radius = keyboard.nextDouble();
    
    surfaceArea = 4 * Math.PI * radius * radius;
    volume = 4.0/3.0 * Math.PI * radius * radius * radius;
    System.out.println("Surface area = " + surfaceArea);
    System.out.println("Volume = " + volume);
    
    System.out.print("Enter a new radius: ");
    radius = keyboard.nextDouble();
    
    surfaceArea = 4 * Math.PI * radius * radius;
    volume = 4.0/3.0 * Math.PI * radius * radius * radius;
    System.out.println("Surface area = " + surfaceArea);
    System.out.println("Volume = " + volume);
  }
}