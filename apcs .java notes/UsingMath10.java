import java.util.Scanner;
import java.text.DecimalFormat;

public class UsingMath10 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    DecimalFormat df = new DecimalFormat("##0.###");
    int num, den;
    double quo;
    System.out.print("Please enter the numerator: ");
    num = input.nextInt();
    System.out.print("Please enter the denominator: ");
    den = input.nextInt();
    quo = (double)num/den; // cast num as double
    System.out.println("You entered " + num + "/" + den);
    System.out.println("The quotient is " + df.format(quo) );
    
    
  }
}