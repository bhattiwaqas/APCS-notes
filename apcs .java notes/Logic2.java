import java.util.Scanner;
import java.text.DecimalFormat;

public class Logic2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int num;
    System.out.print("Enter a number: ");
    num = input.nextInt();
   /*if (num % 2 == 0) {
      System.out.println(num + " is EVEN");
    } // is it even? no remainder when divided by 2
    else {
     System.out.println(num + " is ODD"); 
    }*/
    
    if (num % 3 == 0) {
     System.out.println(num + " is divisible by 3");
     if (num % 4 == 0) {
       System.out.print(" and 4");
     }
     else { 
       System.out.println();
     }
    }
    else if (num % 4 == 0) {
     System.out.println(num + " is divisible by 4");
    }
    else {
      System.out.println(num + " is NOT divisible by either ");
    }
    
    
    if (num % 2 == 1) {
      System.out.println(num + " is odd"); 
      if (num % 5 == 0){
      System.out.println(" and divisible by 5");
      }
      else {
       System.out.println(); 
      }
    }
    else if (num % 5 == 0){
      System.out.println(num + " is divisible by 5");
    }
    else {
      System.out.println(num + " is NOT odd nor divisible bt 5");
    }
    
    
    // else if asks a new question if the first question was FALSE
    //nested if.. It is an if statement, inside of another if statement...
    
    // Prints the IF statement if its true and the else statment if the IF is not true as long as its not interrupted (nothing in between the if else statements
  }
}