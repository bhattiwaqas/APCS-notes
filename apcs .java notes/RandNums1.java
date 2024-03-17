import java.util.Scanner;
import java.text.DecimalFormat;

public class RandNums1 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    // RNG = random number generator
    
    // we will use the method Math.random()
    System.out.println("Original not expanded " + Math.random() );
    // Math.random() triggers a random number based on the clock in the computer time
    // It makes a double... the range is 0 to 1...
    //Step 1 -> expand the range of the Math.random() -> lets go 0-2
    
    System.out.println("Expanded 0-2 for the range " + (Math.random()*2 ) );
    // lets make this an integer
    System.out.println("Int version of 0-2 " + ( (int)(Math.random()*2 ) ) );
    // Possible outcomes? 0 and 1 -> 2 possible numbers!
    //We multiplied Math.random() *2 and we got 0 and 1 as all the possible outcomes
    System.out.println("Random nums 0-5 " + ( (int)(Math.random()*6 ) ) );
    
    int coin = (int) (Math.random()*2 );
    if (coin ==0) {
      System.out.println("HEADS");
    }
    else {
      System.out.println("TAILS");
    }
    
    /*
     * Math.random()
       1. by itself it generates a random decimal from 0-1 exclusive
       2. in order to expand, we multiple. This multiplier will be the amount of numbers in the set.
     */
    
    
    
  }
}