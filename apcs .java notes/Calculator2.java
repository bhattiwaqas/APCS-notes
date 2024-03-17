import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculator2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int num1,num2,choice;
    double dub1,dub2,dub3;
    
    System.out.println("Please enter the operation you would like to do: ");
    System.out.println("1. addition");
    System.out.println("2. subtraction");
    System.out.println("3. multiplication");
    System.out.println("4. divistion");
    System.out.println("5. square a number");
    System.out.println("6. Raise a number to any power");
    System.out.println("7. Square root a number");
    System.out.println("8. Find the nth root of a number");
    System.out.println("9. Which number is bigger?");
    System.out.println("10. Which number is smaller?");
    System.out.println("Enter your choice");
    choice = input.nextInt();
    
    /*System.out.println("Enter the first number");
    num1 = input.nextInt();
    System.out.println("Enter the second number");
    num2 = input.nextInt();*/
    
    
    //Calculator Logic
    if (choice >=1 && choice <= 10) { //user picks a valid option
      System.out.println("Successful Choice");
      if (choice == 1) {
         System.out.println("Enter the first number");
         num1 = input.nextInt();
         System.out.println("Enter the second number");
         num2 = input.nextInt();
         System.out.println(num1+ " + " + num2 + " = " + (num1+num2) );
       }
       else if (choice == 2) {
         System.out.println("Enter the first number");
         num1 = input.nextInt();
         System.out.println("Enter the second number");
         num2 = input.nextInt();
         System.out.println(num1+ " - " + num2 + " = " + (num1-num2) );
       }
       else if (choice == 3) {
         System.out.println("Enter the first number");
         num1 = input.nextInt();
         System.out.println("Enter the second number");
         num2 = input.nextInt();
         System.out.println(num1+ " x " + num2 + " = " + (num1*num2) );
       }
       else if (choice == 4) {
         System.out.println("Enter the first number");
         num1 = input.nextInt();
         System.out.println("Enter the second number");
         num2 = input.nextInt();
         System.out.println(num1+ " / " + num2 + " = " + ( (double)num1/num2) );
       }
       else if (choice == 5) {
         System.out.println("Enter the number you want to square");
         num1 = input.nextInt();
         System.out.println(num1+ "^2 = " + ( num1*num1) );
       }
       else if (choice == 6) { //raise to power
         System.out.println("Enter a number");
         num1 = input.nextInt();
         System.out.println("Enter the exponent");
         num2 = input.nextInt();
         System.out.println(num1 + "^" + num2 + " = " + ( (int)Math.pow(num1,num2) ) );
        //Math.pow raises a number to a power... Math.pow(base,exponent)
       }
      else if (choice == 7) {
        System.out.println("Enter a number");
        num1 = input.nextInt();
        System.out.println("The square root of " + num1 + " is " + Math.sqrt(num1) );
      }
      else if (choice == 8) { //nth root of a number
        System.out.println("Enter a number");
        num1 = input.nextInt();
        System.out.println("Enter the root");
        num2 = input.nextInt();
        System.out.println("The " + num2 + " root of " + num1 + " is " + Math.pow(num1, (1.0/num2) ) ); // for example the 3rd root of 8 is 2. we can do 8 to the 1/3 to get 2. 4th root of 81 is 3. we can do 81 to the 1/4 to get 3
      }
      else if (choice == 10) { // Math.min(num1,num2) finds smallest number, Math.max finds biggest number
        System.out.println("Enter any number, decimals included");
         dub1 = input.nextDouble();
         System.out.println("Enter another number");
         dub2 = input.nextDouble();
         System.out.println("Enter the final number");
         dub2 = input.nextDouble();
         
         System.out.println("The numbers you entered were " + dub1+ ", " + dub2+", " + dub3);
         System.out.println("The smallest number is " + (Math.min(dub1, Math.min(dub2,dub3) ) ));
         System.out.println("The largest number is " + (Math.min(dub1, Math.max(dub2,dub3) )));
         
      }
    
      
      
      else {//user picked a bad choice
        System.out.println("<<< ERROR ERROR ERROR >>>");
      }
    }// this ends the If success logic

    
  }
}
