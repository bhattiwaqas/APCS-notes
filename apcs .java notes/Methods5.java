import java.util.Scanner;
import java.text.DecimalFormat;

public class Methods5 {
  public static void prtSolution(int x) {
    System.out.println("The solution is " + x );
  }
  public static void prtSolution(double x) {
    System.out.println("The solution is " + x );
  }
  
  public static int newNum(){
    return (int)(Math.random()*9 + 2 );
  }
  public static int numDub(int y) {
    return y * 2;
  }
  public static double numHalf(int z) {
    return z/2.0;
  }
  /********* END METHODS *********************/
  /* How to declare a method
    public ->refers to how part of the code can access it
    static -> means it will always run in the code
    void/int/or any variable type -> what the code expects to be returned
    name() -> name of the method... can be overloaded
    (parameter) -> is needed information called from the main
    */
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    
    int num = newNum();
    //lets use prtSolution to print the new number
    prtSolution(num);
    
    //numDub() will accept a number and return that number doubled
    num = numDub(num);
    prtSolution(num);
    
    //numHalf()
    double num2 = numHalf(num);
    prtSolution(num2);
    prtSolution( numHalf(5) );
  }
}