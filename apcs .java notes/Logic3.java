import java.util.Scanner;
import java.text.DecimalFormat;

public class Logic3 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int num;
    System.out.println("Enter a number from 1-10");
    num = input.nextInt();
    
    if (num > 10) {
     System.out.println("The number you entered is greater than 10. Retry.");
    }
    else if (num < 1) {
     System.out.println("The number you entered is less than 10. Retry.");
    }
    else if (num != 7) {
      System.out.println("Bad number, pick 7 next time");
    }
    else {
     System.out.println("You picked 7.YESS");
    }
    
    // !=   -> not equal to
    // ! means NOT
    
    String word;
    String secret = "banana";
    System.out.println("Please enter the secret word");
    word = input.next();
    System.out.println("You entered "+ word);
    
    if(word.equals(secret /*or use "banana" */) ) { // use .equals() to say if the word equals the other word. only for strings
      System.out.println("You got the secret word!");
    }
    else {
     System.out.println("The secret word was " + secret + ". Try again next time"); 
    }
    
    //Case sensitive, be careful with capitilization
    
  }
}