import java.util.Scanner;
import java.text.DecimalFormat;

public class ForLoops2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    
    // Loop -> repitition controlled structure
    
    int i;
    for(i = 1; i <= 13 ; i++) {
      System.out.println("Entry " + i);
    }

    
    
    for(i = 10; i >= 1 ; i--) {
      System.out.println("Entry " + i);
    }
    
    
    
    for(i = 1; i <= 100 ; i++) {
      if (i % 7 == 0) {
        System.out.println(i);
      }
    }
    
    for(i = 7; i <= 100 ; i+=7) {
      System.out.println(i);
    }
    
    int num1;
    System.out.println("Enter the number you want to see of its divisibility from 1-100");
    num1 = input.nextInt();
    for(i = 1; i <= 100 ; i++) {
      if (i % num1 == 0) {
        System.out.println(i);
      }
    }
    
    
    
    for(int x = 0; i < 5 ; i++) {
        System.out.println(x);
    }
    
    
    input.close();
  }
}