import java.util.Scanner;
import java.text.DecimalFormat;

public class UsingMath9 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat(".000");
    /*
    double num1, num2, num3, total;
    System.out.print("First number: ");
    num1 = input.nextDouble();
    System.out.print("Second number: ");
    num2 = input.nextDouble();
    System.out.print("Third number: ");
    num3 = input.nextDouble();
    
    total = num1 + num2 + num3;
    System.out.println("Total of all the numbers is " + total);
    total/=7;
    System.out.println("Total after divided by 7 is " + df.format(total) );
    */
    
    /* Rule for Decimal Format
     * 1. using a 0, will FORCE a specific space to be filled with a value
     * 2. # - will round to the given point, but not force a number
     * $- will insert a dollar sign in front.
     */
    double a = 1.2, b = .123456, c = 123.456, d =12345;
    
    System.out.println("DecimalFormat Trial #1");
    DecimalFormat trial1 = new DecimalFormat(".00");
    System.out.println(trial1.format(a) );
    System.out.println(trial1.format(b) );
    System.out.println(trial1.format(c) );
    System.out.println(trial1.format(d) );
    System.out.println("\n\n");
    //trial2
    DecimalFormat trial2 = new DecimalFormat("00.00");
    System.out.println(trial2.format(a) );
    System.out.println(trial2.format(b) );
    System.out.println(trial2.format(c) );
    System.out.println(trial2.format(d) );
    System.out.println("\n\n");
    //trial3
    DecimalFormat trial3 = new DecimalFormat("##.##");
    System.out.println(trial3.format(a) );
    System.out.println(trial3.format(b) );
    System.out.println(trial3.format(c) );
    System.out.println(trial3.format(d) );
    System.out.println("\n\n");
    //trial4
    DecimalFormat trial4 = new DecimalFormat("#,###.##");
    System.out.println(trial4.format(a) );
    System.out.println(trial4.format(b) );
    System.out.println(trial4.format(c) );
    System.out.println(trial4.format(d) );
    System.out.println("\n\n");
    //trial5 make all of these in a MONEY format...
    DecimalFormat trial5 = new DecimalFormat("$#,##0.00");
    System.out.println(trial5.format(a) );
    System.out.println(trial5.format(b) );
    System.out.println(trial5.format(c) );
    System.out.println(trial5.format(d) );
    System.out.println(trial5.format(123123456.789) );
    System.out.println("\n\n");
    
    input.close();
    
  }
}