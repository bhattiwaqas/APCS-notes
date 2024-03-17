import java.util.Scanner;
import java.text.DecimalFormat;

public class Methods4 {
  public static void printer(String x) {
      System.out.println("I am printing " + x);
  } // end printer
  public static void printer(int x) {
      System.out.println("I am printing " + x);
  } // end printer
  public static void printer() {
      System.out.println("Error, you need to supply a parameter");
  } // end printer
  
  public static int makeNum(){ //void means nothing coming back but we want the information to be returned
    return (int)(Math.random()*100 + 1 );
  } // end makeNum
  
  // The command returns. Sends data back to the main.
  //The code needs to be told exactly what data is being sent
  
  /********* END METHODS *********************/
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    //System.out.println("Please enter a word");
  //  String word = input.next();
    
    int num = makeNum();
    if (num % 7 == 0 ) {
      printer("No Loop");
      
    }
    while (!(num%7 ==0) ){
      printer(num);
      num = makeNum();
    }
    
    
    //printer(word);
    
    num = makeNum();
    printer(num);
    
    printer();
    
    printer( makeNum() );
    
    /*
      Overloaded Methods
      two or more methods can have the same name if they differ in parameters.
      The compiler will use the one that makes the most logical sense.
      */
    
  }
}