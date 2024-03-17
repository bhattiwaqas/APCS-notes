import java.util.Scanner;
import java.text.DecimalFormat;

public class UsingLoops5 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int goal;
    
    //Counter
    int countRuns = 0;
    
    //Accumulator
    int totalsum = 0;
    
    System.out.println("Enter the total sum that when reached, the loop will stop.");
    goal = input.nextInt();
    
    if (goal == 0) {
      System.out.println("You entered 0. Try a different number.");
    }
    else if (goal < 0) {
      System.out.println("You entered a negative number. Try again.");
    }
    else {
      System.out.println("You entered " + goal);
      for (int i = 1; i <=100; i++ ){
        int num = (int)(Math.random() *5 + 1);
        System.out.println(num);
        countRuns++;
        totalsum+=num;
        
        
        if (totalsum >= goal) {
          break;
        } //look for the sum being larger than the goal, if goal is 20 but the number goes to 21 it will break the loop, instead of getting that full number
        
        
      } //end for loop
      System.out.println("The loop ran " + countRuns + " times.");
    } //end else
    
    
    
    
  }
}