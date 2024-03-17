import java.util.Scanner;
import java.text.DecimalFormat;

public class FindAVG {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    double test1, test2, test3, avg;
    
    System.out.println("Enter your first test score: ");
    test1 = input.nextDouble();
    System.out.println("Enter your second test score: ");
    test2 = input.nextDouble();
    System.out.println("Enter your third test score: ");
    test3 = input.nextDouble();
    
    avg = (test1+test2+test3)/3;
    
    System.out.println("Your average is: " + avg);
    
    if (avg >= 65) {
      System.out.println("You are passing the class");
    }
    else {
     System.out.println("You are failing the class"); 
    }
    
  }
}