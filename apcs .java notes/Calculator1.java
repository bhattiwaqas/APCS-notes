import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculator1 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int num1,num2,choice;
    
    /*System.out.println("Please enter a number: " );
    num = input.nextInt();
    
    if ( (num%3==0) && (num%2 != 0) ) {
      System.out.println("This is a special number!!!");
    }
    else  {
      System.out.println("This is a BORING number... ");
    }*/
    
    System.out.println("Please enter the operation you would like to do: ");
    System.out.println("1 is addition");
    System.out.println("2 is subtraction");
    System.out.println("3 is multiplication");
    System.out.println("4 is divistion");
    System.out.println("Enter your choice");
    choice = input.nextInt();
    
    System.out.println("Enter the first number");
    num1 = input.nextInt();
    System.out.println("Enter the second number");
    num2 = input.nextInt();
    
    if (choice == 1) {
      System.out.println(num1+ " + " + num2 + " = " + (num1+num2) );
    }
    else if (choice == 2) {
      System.out.println(num1+ " - " + num2 + " = " + (num1-num2) );
    }
    else if (choice == 3) {
      System.out.println(num1+ " x " + num2 + " = " + (num1*num2) );
    }
    else if (choice == 2) {
      System.out.println(num1+ " / " + num2 + " = " + ( (double)num1/num2) );
    }
    else {
      System.out.println("Your choice of operation did not register, try again.");
    }
    
  }
}