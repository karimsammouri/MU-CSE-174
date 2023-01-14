/* 
 * PhoneBook class
 * CSE 174 fall 2019
 * Karim A. Sammouri
 * Dr. Manar Mohamed
 * Dec 1, 2019
 * The PhoneBook class simulates a simple phone book application.
 * Copyright(C) Nov 2019
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
  
  // Initializing several object variables to be used.
  static Scanner keyboard = new Scanner(System.in);
  static ArrayList<ContactInfo> list = new ArrayList<ContactInfo>();
  
  /**
   * The add method adds a ContactInfo object to the list if and only if 
   * the name is not already in the list.
   * @param list The list of ContactInfo objects.
   * @param name The individual's name.
   * @param label The type of number.
   * @param pNum The phone number.
   */ 
  public static void add(ArrayList<ContactInfo> list, String name, 
                         String label, String pNum) { 
    // Adds a ContactInfo object to the list 
    int nameIndex = nameIndex(name);
    if (nameIndex != -1) {
      System.out.println("The name already exists!");
    }
    else {
      System.out.println("*The contact has been added successfully*");
      ArrayList<Phone> phoneNums = new ArrayList<Phone>();
      phoneNums.add(new Phone(label, pNum));
      list.add(new ContactInfo(name, phoneNums));
    }
  }
  
  /**
   * The nameIndex method determines if a contact name already exists in the 
   * list.
   * @param name The key.
   * @return The index of the name if it exists and -1 otherwise.
   */ 
  public static int nameIndex(String name) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).getName().equals(name))
        return i;
    }
    return -1;
  }
  
  /**
   * The append method adds a new Phone object to an existing specific 
   * ContactInfo if and only if a similar number or label does not exist for 
   * that person.
   * @param list The list of ContactInfo objects.
   * @param name The individual's name.
   * @param label The type of number.
   * @param pNum The phone number.
   */ 
  public static void append(ArrayList<ContactInfo> list, String name,     
                            String label, String pNum) { 
    // Adds a new Phone object to a specific ContactInfo  
    int nameIndex = nameIndex(name);
    if (nameIndex != -1) {
      int labelOrNumIndex = labelOrNumIndex(label, pNum, nameIndex);
      if (labelOrNumIndex != -1)
        System.out.println("The label/number already exists for this person!");
      else {
        System.out.println("*The number has been added successfully*");
        list.get(nameIndex).getPhones().add(new Phone(label, pNum));
      }
    }
    else
      System.out.println("Couldn't find the name!");
  }
  
  /**
   * The LabelOrNumIndex method determines if a given label or number already 
   * exists in a given ContactInfo.
   * @param label A key.
   * @param num Another key.
   * @param index The index of the name of the ContactInfo being searched.
   * @return The index of the label or number if it exists and -1 otherwise.
   */ 
  public static int labelOrNumIndex(String label, String num, int index) {
    for (int i = 0; i < list.get(index).getPhones().size(); i++) {
      if (list.get(index).getPhones().get(i).getLabel().equals(label)
            || list.get(index).getPhones().get(i).getPhonNum().equals(num))
        return i;
    }
    return -1;
  }
  
  /**
   * The display method displays all the phone numbers that belongs to a 
   * given name if and only if that name exists.
   * @param list The list of ContactInfo objects.
   * @param name The individual's name.
   */ 
  public static void display(ArrayList<ContactInfo> list, 
                             String name) { 
    // Displays all the phone numbers that belongs to the given   
    // name. 
    int nameIndex = nameIndex(name);
    if (nameIndex != -1) {
      for (Phone content: list.get(nameIndex).getPhones())
        System.out.println(content.getLabel() + ": " + content.getPhonNum());
    }
    else
      System.out.println("Couldn't find the name");
  }
  
  /**
   * The displayAll method displays all the names and phone numbers.
   * @param list The list of ContactInfo objects.
   */ 
  public static void displayAll(ArrayList<ContactInfo> list){ 
    // Displays all the names and the phone numbers.
    if (list.size() == 0) {
      System.out.println("The list is empty!");
    }
    else {
      for (ContactInfo element: list) {
        System.out.println(element.getName());
        for (Phone element2: element.getPhones()) {
          System.out.println("     " + element2.getLabel() + ": " + 
                             element2.getPhonNum());
        }
      }
    }
  } 
  
  /**
   * The remove method removes all data related to a given name from the list.
   * @param list The list of ContactInfo objects.
   * @param name The individual's name.
   */ 
  public static void remove(ArrayList<ContactInfo> list,  
                            String name) { 
    // Remove all data related to the given name from the  
    // list. 
    if (list.size() == 0) 
      System.out.println("The list is empty!");
    else {
      int nameIndex = nameIndex(name);
      if (nameIndex != -1) {
        list.remove(nameIndex);
        System.out.println("*Contact is removed successfully*");
      }
      else
        System.out.println("Couldn't find the name!");
    }
  } 
  
  // The main method
  public static void main(String[] args) {
    
    // Utilizing while loop to ensure repetition unless user exists.
    while (true) {
      
      // Calling the menu method to prompt user for a choice and storing it.
      menu();
      String response = keyboard.nextLine();
      
      // Utilizing if-else statements to run program according to user's 
      //response.
      if (response.equals("1")) {
        addOperator();
      }
      else if (response.equals("2")) {
        appendOperator();
      }
      else if (response.equals("3")) {
        displayOperator();
      }
      else if (response.equals("4")) {
        displayAllOperator();
      }
      else if (response.equals("5")) {
        removeOperator();
      }
      else if (response.equals("6")) {
        break;
      }
      else {
        System.out.println("Invalid Input!!");
      }
    }
  }
  
  /**
   * The menu method displays the program's menu.
   */
  public static void menu() {
    System.out.println();
    System.out.println("1. Add a contact");
    System.out.println("2. Add a new number to an old contact");
    System.out.println("3. Display a contact");
    System.out.println("4. Display All");
    System.out.println("5. Remove a contact");
    System.out.println("6. Exit");
    System.out.print("Enter your choice:");
  }
  
  /**
   * The addOperator method prompts the user for relevant inputs, stores them, 
   * and then sends them to the add method.
   */
  public static void addOperator() {
    System.out.println("---Add a contact");
    System.out.print("Name: ");
    String name = keyboard.nextLine();
    System.out.print("Label: ");
    String label = keyboard.nextLine();
    System.out.print("Phone number (i.e. (513)111-1111): ");
    String number = keyboard.nextLine();
    add(list, name, label, number);
  }
  
  /**
   * The appendOperator method prompts the user for relevant inputs, stores 
   * them, and then sends them to the append method.
   */
  public static void appendOperator() {
    System.out.println("---Add a new number");
    System.out.print("Name: ");
    String name = keyboard.nextLine();
    System.out.print("Label: ");
    String label = keyboard.nextLine();
    System.out.print("Phone number (i.e. (513)111-1111): ");
    String number = keyboard.nextLine();
    append(list, name, label, number);
  }
  
  /**
   * The displayOperator method prompts the user for relevant inputs, stores 
   * them, and then sends them to the display method.
   */
  public static void displayOperator() {
    System.out.println("---Display a contact");
    System.out.print("Name: ");
    String name = keyboard.nextLine();
    display(list, name);
  }
  
  /**
   * The displayAllOperator method frames and calls the displayAll method.
   */
  public static void displayAllOperator() {
    System.out.println("---Display all");
    displayAll(list);
  }
  
  /**
   * The removeOperator method prompts the user for relevant inputs, stores 
   * them, and then sends them to the remove method.
   */
  public static void removeOperator() {
    System.out.println("---Remove a contact");
    System.out.print("Name: ");
    String name = keyboard.nextLine();
    remove(list, name);
  }
}

