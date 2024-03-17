import java.util.Scanner;
import java.text.DecimalFormat;

public class Methods1 {
  /********* END METHODS HERE ****************/
  // Public -> accessible to all parts of the code
  // Static -> means its always running
  // void -> is what the code expects to return to the main
  
  public static void prtStars(int stop, String letter) {
    //System.out.println("**********");
    for (int i = 1; i <= stop; i++) {
      System.out.print(letter);
    } // end for loop
    System.out.println();
  } // end prtStars
  
  /********* END METHODS *********************/
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    /*
      A method is a block of code which only runs when its CALLED.
      You can pass data, known as parameters, into a method.
      Methods are used to perform certain actions.
      Methods live outside the main of our code!
    */
    
    // System.out.println("**********\nJava\n**********\nis\n**********\neasy\n**********");
    
    prtStars(10, "*"); // this is a method call, we are asking the code to look for prtStars and do the task inside it.
    System.out.println("Java");
    prtStars(8, "H");
    System.out.println("is");
    prtStars(8, "X");
    System.out.println("easy");
    prtStars(20, "S");
    // The number inside the () is what we call a PARAMETER, the method will use the parameter if the initial code states it needs one.
    
    prtStars(100, "!");
    
  }
}