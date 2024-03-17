import java.util.Scanner;
import java.text.DecimalFormat;

public class UsingLoops4 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    //Counter
    int countOdd=0, countEven=0;
    
    //Accumulator
    int totalEven = 0, totalOdd = 0; //This will add up all evens
    
    
    for (int i = 1; i <=100; i++ ){
      int num = (int)(Math.random() *10 + 1);
      System.out.println(num);
      
      if(num % 2 == 0) { // even
        countEven++;
        // use our accumulator here
        totalEven+=num; // same as totalEven = totalEven + num
      }
      else { // odd
        countOdd++;
        
        totalOdd+=num;
      }
      
    } // end for loop
    
    System.out.println("Number of evens: " + countEven);
    System.out.println("Number of odds " + countOdd);
    System.out.println("Total of all even numbers: " + totalEven);
    System.out.println("Total of all odd numbers: " + totalOdd);
    
    if (totalEven > totalOdd) {
      System.out.println("Lebo theory is right");
    }
    else {
      System.out.println("There might have been a miscalcultaion.");
    }
    
    // If we add up all evens, wil;l the sum be bigger htan the sum of all odds?
    // NEW loop item... ACCUMULATOR
    
    
    
    
    
    
  }
}