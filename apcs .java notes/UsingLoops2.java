import java.util.Scanner;
import java.text.DecimalFormat;

public class UsingLoops2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int start, amt;
    int countodd = 0;
    int counteven = 0;
    
    System.out.println("What number should the range start at");
    start = input.nextInt();
    System.out.println("What numbers should be in the range");
    amt = input.nextInt();

    
    
    for (int i = 1; i<=50 ;i++) { // does the random number that the user generated, 50 times
      int num = (int)(Math.random()*amt + start);
      System.out.println(num);
      if ( !(num % 2 == 0) ) { // shows if the random number is odd then it will
        countodd++;
      }
      if ( (num % 2 == 0) ) {
        counteven++;
        }
      
    }
    
    System.out.println("Odd numbers: " + countodd);
    System.out.println("Even numbers: " + counteven);
    
    
    
    
    
    
    
    
    
  }
}