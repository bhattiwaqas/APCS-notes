import java.util.Scanner;
import java.text.DecimalFormat;

public class Logic1 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    String name, first, last;
    int len;
    System.out.println("Enter your name: ");
    name = input.nextLine();
    
    System.out.println("Your name is " + name);
    
    len = name.length();
    
    first = name.substring(0,name.indexOf(' '));
    System.out.println("Your first name is " + first);
    
    last = name.substring(name.indexOf(' ')+1);
    System.out.println("Your last name is " + last);
    
    //if your name has 9 digits, its long, yes or no quesiton, true or false... conditional question
    // using if...
    if (first.length() > 8) {
     System.out.println("You have a long first name."); 
    }
    
    if (first.length() < 8) {
      System.out.println("You have a short first name.");
    }
    if (first.length() == 8) {
      System.out.println("Your first name is a perfect amount.");
    }
    
    /*if statements only respond when the conditional statement (the true or false question) is TRUE
    
    Signs we can use.. <, >, <=, >=, ==
    
    = means to set a variable with a value
    == means to compare variable inside a conditional statement
    */
    input.close();
    
  }
}