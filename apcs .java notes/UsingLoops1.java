import java.util.Scanner;
import java.text.DecimalFormat;

public class UsingLoops1 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int start, end;
    int count5s = 0; // variable will count numbers divisible by 5... COUNTER
    int countgroovy = 0;
    int countperfectsquare = 0;
    
    System.out.println("Enter the starting number");
    start = input.nextInt();
    System.out.println("Enter the ending number");
    end = input.nextInt();
    
    
    for (int i = start; i<=end ; i++) {
      System.out.println(i);
      if (i%5 ==0) {
      count5s ++;
    }
      if (i%2 ==0 && i%3==0) {
      countgroovy ++;
    }
      if (i == Math.pow(Math.sqrt(i), 2) ) {
      countperfectsquare ++;
    }
      
    }
    
    System.out.println("Amount divisible by 5: " + count5s);
    
    
    // task 2.. find a groovy number, number that is even and divisible by 3
    System.out.println("Groovy numbers: " + countgroovy);
    
    System.out.println("Perfect squares: " + countperfectsquare);
    
    
    
    
    
    
    
    
    
  }
}