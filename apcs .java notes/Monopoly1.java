import java.util.Scanner;
import java.text.DecimalFormat;

public class Monopoly1 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int num1,num2, total;
    
    // -------------- Roll 1 --------------
    num1 = (int)(Math.random()*6 + 1);
    num2 = (int)(Math.random()*6 + 1);
    total = num1 + num2;
    System.out.println("You rolled a " + num1 + " and a " + num2 + "\nMove " + total + " spaces.");
    
    // -------------- Roll 2 --------------
    if (num1 == num2) {
      System.out.println("You got doubles. roll again");
      // prompt for user to know they go again
      System.out.print("PRESS ANY KEY TO ROLL AGAIN");
      input.next();
      num1 = (int)(Math.random()*6 + 1);
      num2 = (int)(Math.random()*6 + 1);
      total = num1 + num2;
      System.out.println("You rolled a " + num1 + " and a " + num2 + "\nMove " + total + " spaces."); //big if statement
      
      // -------------- Roll 3 --------------
      if (num1 == num2) {
      System.out.println("You got doubles. Roll again.\nWarning: Another double will send you straight to JAIL");
      System.out.print("PRESS ANY KEY TO ROLL AGAIN");
      input.next();
      num1 = (int)(Math.random()*6 + 1);
      num2 = (int)(Math.random()*6 + 1);
      total = num1 + num2;
      System.out.println("You rolled a " + num1 + " and a " + num2); //middle if statement    
      // -------------- JAIL --------------
      if (num1 == num2) {
      System.out.println("You got doubles. GO TO JAIL"); //last if statement

      } //last if statement
      else {
        System.out.println("Congrats! You got a high number. Move " + total + " spaces");
      }
      
      } //middle if statement
    } //big if statement
    
    
    
    
    /* Monopoly moving rules
     1. roll two dice, combined total is how far you move
     2. if you roll doubles you go again
     3. three doubles in a row is jail
     */
    
    
    
    
    input.close();
    
  }
}