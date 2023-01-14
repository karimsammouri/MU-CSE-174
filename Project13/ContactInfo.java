/*
 * ContactInfo class
 * CSE 174 - D
 * Karim A. Sammouri
 * Dr. Manar Mohamed
 * Dec 1, 2019
 * The ContactInfo class simulates a very simple library that 
 * holds a name and a list of phone numbers.
 */

import java.util.*;

public class ContactInfo {
  
  private String name;                  // Name of individual
  private ArrayList<Phone> phoneNums;   // List of phone numbers
  
  // ======= Constructors ======= 
  /**
   * This default constructor initializes a contact info with 
   * name = "unknown" and an empty list (length of zero).
   */
  public ContactInfo() {
    name = "unknown";
    phoneNums = new ArrayList<Phone>(0);
  }
  
  /**
   * This constructor initializes a contact info with the given 
   * name and the given list of phones.
   * @param name Name of individual.
   * @param phoneNums List of phone numbers.
   */
  public ContactInfo(String name, ArrayList<Phone> phoneNums) {
    this.name = name;
    this.phoneNums = phoneNums;
  }
  
  // ======= Methods =======
  /**
   * The getName method returns the name of the individual.
   * @return The name field.
   */
  public String getName() {
    return this.name;
  }
  
  /**
   * The getPhones method returns the list of phone numbers.
   * @return The ArrayList of phones.
   */
  public ArrayList<Phone> getPhones() {
    return this.phoneNums;
  }
  
  /**
   * The addPhone method adds the given phone to the list of 
   * phones if the given phone has not been added previously.
   * @param p The phone to be added.
   * @return True if the addition was successful and false 
   * otherwise.
   */
  public boolean addPhone(Phone p) {
    if (indexOf(p) == -1) {
      phoneNums.add(p);
      return true;
    }
    else
      return false;
  }
  
  /**
   * The indexOf method determines if the given phone is 
   * already in the list of phones.
   * @param p The key.
   * @return The index of the key if it were found and -1 
   * otherwise.
   */
  private int indexOf(Phone p){
    for (int i = 0; i < phoneNums.size(); i++){
      if (phoneNums.get(i).getLabel().equals(p.getLabel()))
        return i;
      if (phoneNums.get(i).getPhonNum().equals(p.getPhonNum()))
        return i;
    }
    return -1;
  }
  
  /**
   * The removePhone method removes the given phone number 
   * from the list of phones.
   * @param phonNum The phone number to be removed.
   * @return True if the removal was successful and false 
   * otherwise.
   */
  public boolean removePhone(String phonNum) {
    if (indexOf(phonNum) != -1) {
      phoneNums.remove(indexOf(phonNum));
      return true;
    }
    else
      return false;
  }
  
  /**
   * The indexOf method determines if the given phone number 
   * is already in the list of phones.
   * @param phonNum The key.
   * @return The index of the key if it were found and -1 
   * otherwise.
   */
  private int indexOf(String phonNum){
    for (int i = 0; i < phoneNums.size(); i++){
      if (phoneNums.get(i).getPhonNum().equals(phonNum))
        return i;
    }
    return -1;
  }
}

