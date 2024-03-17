import java.util.Scanner;
import java.text.DecimalFormat;

public class ForLoops3 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int i, incr, start, stop;
    
    
    
    System.out.print("Enter the number you want to start from: ");
    start = input.nextInt();
    System.out.print("Enter the number you want to end on: ");
    stop = input.nextInt();
    System.out.print("Enter the number you want to count by: ");
    incr = input.nextInt();
    
    if (stop >= start && incr >0 ) {
      for(i = start; i <= stop ; i+=incr ) {
        System.out.println(i);
      }
    }
    else {
      System.out.println("You goofed when entering your numberes...");
    }
    
    // i+=incr is the same as i=i+incr
    
    
    
    
    
    
    
    
  }
}