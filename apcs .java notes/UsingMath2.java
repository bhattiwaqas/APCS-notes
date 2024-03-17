import java.util.Scanner;

public class UsingMath2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    //Declare
    double numDub; //user's number
    int numInt; //numDub+3
    //Question
    System.out.print("Enter a number: ");
    numDub = input.nextDouble();
    //letspopulate a value for numInt
    numInt = (int)numDub+3;
    //double + int -> double assuption #3
    // CAST the number(typeCasting). Compiler will temporarily change the variable type to a selected type of your choice
    // f.e change the double to an int
     
    //print out
    System.out.println("You entered " + numDub);
    System.out.println("I transformed that into " + numInt);
    
    
    double z = 987.654;
    int a = 7, b = 3;
    System.out.println(2 + 2 * 2);//6
    System.out.println( 5/2); //2 truncates decimal
    System.out.println( 10/3); //3
    System.out.println( a + 5 * 2); //17
    System.out.println( a/b ); //2
    System.out.println((int) z); //987
    System.out.println( z-b); //984.654
    System.out.println( (int) z-b); //984
    System.out.println( (double)( a/b) ); //2.0 int/int=int...turned into double
    System.out.println((double)a / b ); //2.3333333...
    //Casting...
    
    input.close();  
  }
}