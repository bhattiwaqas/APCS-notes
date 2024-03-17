import java.util.Scanner;

public class UsingMath1 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("First number: ");
    int num1 = input.nextInt();  
    System.out.print("Second number: ");
    int num2 = input.nextInt();
    
    System.out.println(num1 + " + " + num2 + " = " + (num1+num2) ); //concatenate
    System.out.println(num1 + " - " + num2 + " = " + (num1-num2) );
    System.out.println(num1 + " x " + num2 + " = " + (num1*num2) );
    System.out.println(num1 + " / " + num2 + " = " + (num1/num2) );
    //compiler TRUNCATES the solution... removes all decimals
    /*Compiler Assuptions
     * 1. using intsints in any operation gives a solution of an int
     * 2. using a double in any operation gives a solution of double
     * 3. combining a double and an int = double
     */
    System.out.println("Fixed: " + num1 + " / " + num2 + " = " + ( (num1*1.0 )/num2) );
    
    input.close();
  }
}