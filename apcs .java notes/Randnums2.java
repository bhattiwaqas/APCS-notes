import java.util.Scanner;
import java.text.DecimalFormat;

public class Randnums2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    
    System.out.println("Random nums 0-11:    " + ( (int)(Math.random()*12 ) ) );
    
    System.out.println("Random nums 1-6:    " + (int)(Math.random()*6 + 1) );
    
    System.out.println("Random nums 10-20:    " + (int)(Math.random()*10 + 10) );
    
    System.out.println("Random nums 17-53:    " + (int)(Math.random()*37 + 17) );
    
    //Dice rolling app...
    int num1,num2, total;
    num1 = (int)(Math.random()*6 + 1);
    num2 = (int)(Math.random()*6 + 1);
    total = num1+num2;
    System.out.println("You spun a " + num1 + " and " + num2);
    if (total ==2) {
      System.out.println("SNAKE-EYES");
    }
    else if (total == 12) {
      System.out.println("BOXCARS");
    }
    
    
    /*
     * Math.random()
       1. multiplier = the amount of random values possible
       2. The addition -> pushes the numbers up or downwaay from 0
       3. Formula (int)(Math.random() * (last-first + 1) + START)
     */
    
    
    System.out.println(  (int) (Math.random()*2)  );
    
    System.out.println( (int) (Math.random()*11+1) );
    
    
  }
}