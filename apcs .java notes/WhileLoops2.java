import java.util.Scanner;
import java.text.DecimalFormat;

public class WhileLoops2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    for (int i = 1; i <= 33; i+=2  ) {
      System.out.print(i+","); 
    }
    System.out.println();
    
    // do same task with while loop
    int x = 1; // this is what our loop will start at
    while (x <= 33) {
      if (x == 33) {      // if statement removes comma from the last number (33)
        System.out.print("*" + x + "*"); 
      }
      else if (x % 3 == 0) { // puts stars around number if divisible by 3
        System.out.print("*" + x + "*, ");
      }
      else {
        System.out.print(x+", "); 
      }
      
      
      x+=2;
    }
    
    System.out.println();
    
    /*
     Definition of while loop.
     A while loop will repeat any code in its code block
     It will continue as long as its single condition is true
     The code will not stop unless the conditions becomes false or there is a break in the code that stops it
     
     */
    
    x = 2;
    while (x <=74 ) {
      System.out.println(x);
      x+=3;
    }
    
    
    
    
    
    
    
    
  }
}