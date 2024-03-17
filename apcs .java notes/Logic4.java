import java.util.Scanner;
import java.text.DecimalFormat;

public class Logic4 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int num1,num2,tries = 1;
    
    System.out.print("Player 1, please enter your secret number from 1-100: ");
    num1 = input.nextInt();
    // Flag... wil lcheck if we won or lost given less tries
    boolean numCorrect = false;
    
    System.out.print("Player 2, you have 1 try to guess the secret number from 1-100!");
    System.out.println("Enter guess here: ");
    num2 = input.nextInt();
    
    // try 1 ---------------------------------------------------------------------------------------
    if (num2 == num1) {
      System.out.println("You guessed the number CORRECT");
      System.out.println("It only took you " + tries + " tries");
      numCorrect = true;
    }
    else {
     System.out.println("WRONG... Try again");
      tries++; // adds tries by 1
      
      //Hints.. hot warm and cold.
      // hot.. number is 5 away from guess
      // warm.. the number is 15 away from guess
      // cold.. number is 25 away or more from guess
      // use math to find distance away
      //Math.abs(num1 - num2)
      
      if(Math.abs(num2 - num1) <= 5) {
        System.out.println("Your guess was HOT");
      }
      else if(Math.abs(num2 - num1) <= 15){
        System.out.println("Your guess was WARM");
      }
      else{
        System.out.println("Your guess was COLD");
      }
      
    }
    
    //try 2 ---------------------------------------------------------------------------------------
    if (numCorrect == false) {
      System.out.print("Try #2, pick a different number: ");
      num2 = input.nextInt();
      //create a nested if... using the informmation from try 1
      if (num2 == num1) {
      System.out.println("You guessed the number CORRECT");
      System.out.println("It only took you " + tries + " tries");
      numCorrect = true;
    }
    else {
     System.out.println("WRONG... Try again");
      tries++; // adds tries by 1
      
      if(Math.abs(num2 - num1) <= 5) {
        System.out.println("Your guess was HOT");
      }
      else if(Math.abs(num2 - num1) <= 15){
        System.out.println("Your guess was WARM");
      }
      else{
        System.out.println("Your guess was COLD");
      }
    }
    }
    
    //try 3 ---------------------------------------------------------------------------------------
    if (!numCorrect) {
     System.out.print("This is your final guess. Good Luck ");
     num2 = input.nextInt();
     
     if (num2 == num1) {
      System.out.println("You guessed the number CORRECT");
      System.out.println("It only took you " + tries + " tries");
    }
    else {
     System.out.println("WRONG... The number was " + num1);
    }
    
    }
     
    
    
  }
 }