import java.util.Scanner;

public class UsingMath4 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    int num,den;
    System.out.print("Enter the number in the division symbol");
    num = input.nextInt();
    System.out.print("Enter the number outside the division symbol");
    den = input.nextInt();
    
    System.out.print("The Quotient of " + num + " and " + 3 + " using long division is ");
    System.out.print(num / den + " r");
    //we need to use a new operator (+ - * /)
    //Modulo Math -> finds the remainder. NOTATION is %
    System.out.println(num % den);
    
    
    input.close();
  }
}